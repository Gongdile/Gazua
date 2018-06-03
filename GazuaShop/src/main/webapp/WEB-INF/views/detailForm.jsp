<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>게시글 내용 폼</h1>
	<script>
		function modifybtn() {
			var form = document.btnForm;
			form.action = "/modifyForm";
			form.submit();
		}
		function deletebtn() {
			var form = document.btnForm;
			form.action = "/delete";
			form.submit();
		}
		function listbtn() {
			var form = document.btnForm;
			form.action = "/main";
			form.submit();
		}
	</script>
	<table>
		<tr>
			<td>카테고리</td>
			<td>이름</td>
			<td>내용</td>
			<td>가격</td>
		</tr>
		<tr>
			<td>${list.category}</td>
			<td>${list.p_name}</td>
			<td>${list.p_detail}</td>
			<td>${list.price}</td>
		</tr>
	</table>

	<form method="get" name="btnForm">
		<input type="hidden" name="seq" value="${list.seq}">
		<input type="button" value="수정" onclick="modifybtn()"> 
		<input type="button" value="삭제" onclick="deletebtn()"> 
		<input type="button" value="목록" onclick="listbtn()">
	</form>


</body>
</html>