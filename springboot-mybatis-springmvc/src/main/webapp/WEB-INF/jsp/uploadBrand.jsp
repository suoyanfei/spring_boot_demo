<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>品牌添加------</title>
<script type="text/javascript" src="../js/jquery-1.8.0.min.js"></script>
<script type="text/javascript" src="../js/brand.js"></script>

</head> 
<body>
<form action="../addFile" method="post" enctype="multipart/form-data">
  <table>
  	<tr>
  		<td>品牌名称:<input name="name" type="text" id="name"></td>
  	</tr>
  	<tr>
  		<td>排序:<input type="text" name="firstChar"></td>
  	</tr>
  	<tr>
  		<td>文件:<input type="file" name="file" id="file"></td>
  	</tr>
  	<tr>
  		<td>文件:<input type="file" name="file1" id="file1"></td>
  	</tr>
  	<tr>
  		<td>上传单个图片:<input type="submit"></td>
  	</tr>
  	<tr>
  		<td>文件上传:<input type="button" onclick="Submit()"></td>
  	</tr>
  </table>
 
</form>

</body>
</html>