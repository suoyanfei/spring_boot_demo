<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Insert title here</title>
</head>
<body>
<table>
	<tr>
	  <th>商品ID</th>
	  <th>商家ID</th>
	  <th>商品名称</th>
	  <th>所属品牌</th>
	  <th>商品标题</th>
	  <th>价格</th>
	  <th>状态</th>
	</tr>
	<c:forEach items="${list}" var="list">
		<tr>
			<td>${list.id}</td>
			<td>${list.sellerId}</td>
			<td>${list.goodsName}</td>
			<td>${list.brandId}</td>
			<td>${list.caption}</td>
			<td>${list.price}</td>
			<td>
			    <c:if test="${list.auditStatus eq '1'}">上架</c:if>
			    <c:if test="${list.auditStatus eq '0'}">已下架</c:if>
			</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>