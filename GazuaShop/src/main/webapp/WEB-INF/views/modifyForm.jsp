<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>게시글 수정 폼</h1>
	<form method="post" action="/update">
				<input type="hidden" name="seq" value="${list.seq}"></br>
		카테코리 : <input type="text" value="${list.category}" name="category"></br>
		상품이름 : <input type="text" value="${list.p_name}" name="p_name"></br>
		상품내용 : <input type="text" value="${list.p_detail}" name="p_detail"></br>
		상품가격 : <input type="text" value="${list.price}" name="price"></br>
		<input type="submit" value="수정">
	</form>
</body>
</html>