$(function(){
	initDataGrid();//初始化DataGrid
	initLinkbutton();//初始化按钮
	
	//initForm();
	
	/*$("a[title]").click(function(){
		var title = $(this).attr('title');
		if($("#brandGrid").tabs('exists',title)){//判断选项卡是否存在 存在返回true 
			$('#brandGrid').tabs('select',title);//跳到指定参数的tab页上
		}else{
			initDataGrid();//初始化DataGrid
			initLinkbutton();//初始化按钮
		}
	})*/
});

function initLinkbutton(){
	$("#btn").linkbutton({
		text:'查询',
		inconCls:'icon-search',
		onClick:function(){
		 var value = $('#bname').val();
			$("#brandGrid").datagrid('load',{
				name:value
			});
		}
	})
}

/*function serch() {
	var name = $('#bname').val();
	$("#brandGrid").datagrid('load',{
		name:name
	});
}*/

function initDataGrid(){
	$("#brandGrid").datagrid({
		url:'../initDataGrid',
		autoRowHeight:true,
		nowrap:false,
		pagination:true,
		loadMsg:'数据正在加载中....',
		rownumbers:false,
		pageSize:10,
		pageList:[1,10,20,30,100,1000],
		striped:true,
		columns:[[
			{
				field:'ok',checkbox:true
			},{
				field:'id',title:'操作',width:100,
				formatter:function(value,row,index){
					var str = "<a href='#' id='det' name='det'  onClick='detail("+value+")' >操作<a>";
					return str;
					
				}
			},{
				field:'name',title:'商品名称',align:'center',width:200,
				
			},{
				field:'firstChar',title:'商品首字母排序',align:'center',width:200

			}
			
		]],
		onLoadSuccess:function(){
			//在这里 id选择器会失效 选择其它选择器
			$("a[name='det']").linkbutton({text:'详情',iconCls:'icon-search'});
		},
		toolbar:[{
			text:'新增',
			iconCls:'icon-add',
			handler:function(){
				$("#dig").dialog({
					title:'品牌添加'
				});
				$("#myForm").find('input[name]').val('');
				$("#dig").dialog('open');
				
				
			}
			
		},{
			text:'修改',
			iconCls:'icon-edit',
			handler:function(){
				var rows = $("#brandGrid").datagrid('getChecked');
				if(rows.length != 1){
					$.messager.alert('提示',"只能选一行数据");
					return null;
				}
				$("#dig").dialog({
					title:'品牌修改'
				});
				$("#myForm").form('load',{
					name:rows[0].name,
					sort:rows[0].firstChar,
				});
				$("#dig").dialog('open');
			}
			
		},{
			text:'基本数据导出',
			iconCls:'icon-edit',
			handler:function(){
				var row = $("#brandGrid").datagrid('getChecked');
				if(row.length <=0){
					$.messager.alert('提示','请选择导出的页面');
					return ;
				}
				exprot(row);
			}
		},{
			text:'详细数据导出',
			iconCls:'icon-edit',
			handler:function(){
				var row = $("#brandGrid").datagrid('getChecked');
				if(row.length <=0){
					$.messager.alert('提示','请选择导出的页面');
					return ;
				}
				var ids = [];
				for(var i=0 ; i<row.length ; i++){
					ids.push(row[i].id)
				}
				exprotDetail(ids);
			}
		}],
	})
}

/**
 * 详情页面
 * @returns
 */
function detail(brandId){
	debugger;
	var url = '../goods/getGoodsList?id='+brandId;
	var html = '<iframe style=width:100%;height:570px src='+url+'></iframe>';
	$("#brandGrid1").tabs('add',{
	 title:'商品列表',
	 content:html,
	closable:true
	}
	
	);
}
/**
 * 基本数据导出
 */
function exprot(row){
	debugger;
	$.ajax({
		url:'../exprot',
	    type:'POST',
	    dataType:'text',
	    //contenType:'application/json',
	    data:{
	    	rows:JSON.stringify(row)
	    },
	   
	    success:function(){
	    	
	    }
	    
		
	})
}
/**
 * 详情页面导出
 * @param row
 * @returns
 */
function exprotDetail(id){
	debugger;
	$.ajax({
		url:'../exprotDetail',
		type:'POST',
		dataType:'text',
		data:{
			list:id
		},
		
		success:function(){
			
		}
		
		
	})
}

/**
 * 退出按钮
 * @returns
 */
function edit(){
	$("#dig").dialog('close');
}

/**
 * 新增
 */
function save(){
	var name = $("#name").val();
	var sort = $("#sort").val();
	var parms={
			
			name:name,
			firstChar:sort
	};
	$.ajax({
		url:'../saveBrand/1',
		type:'POST',
		dataType:'text',
		contentType:'application/json',
	    data:JSON.stringify(parms),
	    success:function(response){
	    	var json = $.parseJSON(response);
	    	if(response.success){
	    		$.messager.alert('提示',json.msg);
	    	}
	    	$.messager.alert('提示',json.msg);
	    },
	    error:function(){
	    	$.messager.alert('提示','系统出错');
	    }
	})
}

























