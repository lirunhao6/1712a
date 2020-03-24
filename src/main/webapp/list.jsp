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
<script type="text/javascript">
	$(function(){
		$("#qx").toggle(function(){
			$("[name='pid']").attr("checked",true);
		},function(){
			$("[name='pid']").attr("checked",false);
		})
	})
</script>
<script type="text/javascript">
	function deleteAll(id){
		if(confirm("确定要删除吗?")){
			var ids="";
			if(id==undefined){
				var ids=$("[name='gid']:checked").map(function(){
					return $(this).val();
				}).get().join(",");
			}else{
				ids=id;
			}
			
			$.post("deleteGoods",{"ids":ids},function(data){
				if(data){
					alert("删除成功");
					location.href="list";
				}else{
					alert("删除失败");
				}
			})
			
			
			
			
			
		}
	}
</script>
</head>
<body>
<a href="toadd"><input type="button" value="添加"></a>
<input type="button" value="批删" onclick="deleteAll()">
	<table>
		<tr>
		<td>
		<input type="checkbox" id="qx">
		</td>
			<td>编号</td>
			<td>品牌</td>
			<td>分类</td>
			<td>发布时间</td>
			<td>操作</td>
		</tr>
		
		<c:forEach items="${page.list }" var="p">
			<tr>
			<td>
				<input type="checkbox" value="${p.id }" name="pid">
			</td>
			<td>${p.id }</td>
			<td>${p.name }</td>
			<td>${p.cname }</td>
			<td>${p.datea}</td>
			<td>
			<a href="toupdate?id=${p.id }"><input type="button" value="修改"></a>
			<input type="button" value="删除" onclick="deleteAll('${p.pid}')">
			</td>
		</tr>
		</c:forEach>
		<tr>
			<td colspan="3">
				<a href="list?pageNum=1">首页</a>
				<a href="list?pageNum=${page.pageNum-1 < 1?page.pageNum:page.pageNum-1 }">上一页</a>
				<a href="list?pageNum=${page.pageNum+1 > 1?page.pageNum+1:page.pageNum }">下一页</a>
				<a href="list?pageNum=${page.pages }">尾页</a>
			</td>
		</tr>
	</table>
</body>
</html>