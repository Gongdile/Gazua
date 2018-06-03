<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet" href="/resources/css/bootstrap.css">
</head>
<body>
	<div class="container">
		<h1>게시판 리스트</h1>
		<table class="table">
			<thead class="thead-dark">
				<tr>
					<td scope="col">카테고리</td>
					<td scope="col">이름</td>
					<td scope="col">가격</td>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="list" items="${list}">
					<tr>
						<td scope="row">${list.category}</td>
						<td><a href="/detailForm?seq=${list.seq}">${list.p_name}</a></td>
						<td>${list.price}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>