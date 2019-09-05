<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Insert title here</title>
<script type="text/javascript" src="../js/jquery-easyui-1.5.2/jquery.min.js"></script>
<script type="text/javascript" src="../js/jquery-easyui-1.5.2/jquery.easyui.min.js"></script>
<!-- easyui核心UI文件 css -->  
<link href="../js/jquery-easyui-1.5.2/themes/default/easyui.css" rel="stylesheet" type="text/css"/>
<!-- easyui图标 -->
<link href="../js/jquery-easyui-1.5.2/themes/icon.css" rel="stylesheet" type="text/css"/>
<script type="text/javascript" src="../js/brandGrid.js"></script>
</head>
<body>
 
<!-- <div id="cc" class="easyui-layout" style="width:100%;height:100%;" data-options="fit:true">
  <div data-options="region:'north',title:'North Title',split:true" style="height:100px;">
                    商品名称:<input type="text" id="bname">
		<a href="#" id="btn"></a>
  </div> 
	<div data-options="region:'west',title:'菜单',iconCls:'icon-ok',split:true,plain:true" style="width:200px;">
   <div class="easyui-accordion" data-options="fit:true,title:'用户管理'">
	 	 <div title="店铺管理" data-options="fit:true">
	 		<a  title="brand">商品管理</a><br>
	 	</div>
	 	<div title="权限管理" data-options="fit:true"></div>
	 	<div title="资产管理" data-options="fit:true"></div>
	 	<div title="部门管理" data-options="fit:true"></div> 
 </div> 
  </div> 
   <div data-options="region:'center',title:'主页面'" style="height: 800px">
	    <div id="brandGrid" class="easyui-tabs" options-data=" closable:true">
	 	
	   </div>
   </div> 
</div> -->
<div>
	  商品名称:<input type="text" id="bname">
		<a href="#" id="btn"></a>
</div>
 
 <table id="brandGrid" >
 	
 </table>
 <table id="brandGrid1" class="easyui-tabs">
 
 </table>
 
 <div id="dig" class="easyui-dialog"  closed='true' modal='true' draggable='false' style="width:300px;height: 300px">
 	<form id="myForm" action="">
 		<table>
 			<tr>
 			    <td>品牌名称:<input name="name" id="name" type="text"></td>
 			</tr>
 			<tr>
 				<td>排序:<input name="sort" id="sort" type="text"></td>
 			</tr>
 			<tr>
 				<td><a href="#" id="yes" class="easyui-linkbutton" data-options ="iconCls:'icon-save'" onclick="save()"></td>
 				<td><a href="#" id="no" class="easyui-linkbutton"  iconCls="icon-cancel" onclick="edit()"></td>
 			</tr>
 			
 		</table>
 	</form>
 </div>
 	


</body>
</html>