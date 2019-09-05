<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>品牌添加------</title>
<script type="text/javascript" src="../js/jquery-1.8.0.min.js"></script>
<script type="text/javascript" src="../js/onChangebrand.js"></script>

</head> 
<body>
<form action="../addFile" method="post" enctype="multipart/form-data">
 
  	<tr>
  		<td>品牌名称:<input name="name" type="text" id="name"></td>
  	</tr><br>
  	<tr>
  		<td>排序:<input type="text" name="firstChar"></td>
  	</tr><br>
  	<tr>
  		<td>手机图片:<input type="file" name="file" id="file" onchange="onSubmit()"></td>
  	</tr><br>
  	<td>
  		详情:<input type="button" onclick="detail()">
  	</td>
  	<div>
  		<img id="path"  src="${filePath}"style="width: 100px;height: 100px">
  	</div>
  	
  	
  
</form>

</body>
</html>