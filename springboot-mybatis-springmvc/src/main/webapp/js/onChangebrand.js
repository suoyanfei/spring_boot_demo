function onSubmit(){
	var file = $("#file")[0].files[0];
	var fileName = $("#file").val();
	var suf = fileName.substring(fileName.lastIndexOf('.')+1);
	if(file == null){
		alert("请选择上传的图片");
		$("#file").val('');
		return ;
	}
	if(suf != 'jpg' && suf != 'png'){
		alert("请上传图片");
		$("#file").val('');
		return ;
	}
	var obj = new FormData();
	obj.append('file',file);
	$.ajax({
		url:'../uploadOnChange',
		type:'POST',
		data:obj,
		processData:false,//让ajax不处理我们自定义发送的数据
		contentType:false,
		dataType:'text',
		success:function(response){
			var json = $.parseJSON(response);
			alert(json.filePath);
			$("#path").attr('src',json.filePath);
		},
		error:function(data){
			alert("系统错误");
		}
		
		
	})
	
}

function detail(){
	
	
}