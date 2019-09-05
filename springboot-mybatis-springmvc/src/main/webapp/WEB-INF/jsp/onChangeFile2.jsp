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
  		<td>图片></td>
  	</tr><br>
  	
  	<div>
  		<img id="path"  src="${filePath}"style="width: 100px;height: 100px">
  	</div>
  	
  	
  
</form>

</body>
</html>