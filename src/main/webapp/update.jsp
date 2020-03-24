<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath() %>/css/css.css" rel="stylesheet">
<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-1.8.2.min.js"></script>
</head>
<body>
	<form action="update" method="post">
		编号:<input type="text" name="id" value="${goods.id }"><br>
		品牌:<input type="text" name="name" value="${goods.name }"><br>
		分类:<select name="tid">
			<option value="">请选择</option>
			<c:forEach items="${typeList }" var="b">
				<option value="${b.tid }" <c:if test="${goods.tid==t.tid }"> selected="selected"</c:if>>${b.cname }</option>
			</c:forEach>
		</select><br>
		价格:<input type="text" name="price" value="${goods.price }">
		<input type="submit" value="修改">
	</form>
</body>
</html>