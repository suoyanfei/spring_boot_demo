function Submit(){
	var file = $("#file")[0].files[0];//获取上传文件的类容
	var file1 = $('#file1')[0].files[0];
	var fileName = $("#file").val();//获取文件名
	alert(fileName);
			if(file == null){
				alert("上传的文件不能为空");
			}
			var suf = fileName.substring(fileName.lastIndexOf(".")+1);
			if(suf != 'xls'&& suf != 'xlsx'){
				alert("请上传excel文件");
			}
			var obj = new FormData();
			obj.append('file',file);
			obj.append('file1',file1);
			$.ajax({
				url:'../addFile1',
		        type:'POST',
				data:obj,
				processData:false,//让ajax不处理我们自定义发送的数据
				contentType:false,
				success:function(){
					alert('上传成功');
				},
				error:function(){
					alert('系统错误');
				}
				
			})
		}
	