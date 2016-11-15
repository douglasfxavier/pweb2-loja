<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Catálogo</title>
</head>
<body>
		<table>
			<tr>
				<th>Descrição curta</th>
				<th>Descrição longa</th>
				<th>Preço</th>
			</tr>
	 		<c:forEach var="item" items="${itens}">
	 		<form action="${pageContext.request.contextPath}/pedido" method="post">
				<tr>
					<td>${item.descricaoCurta}</td>
					<td>${item.descricaoLonga}</td>
					<td>${item.preco}</td>
					<td>
						<input type="hidden" name="itemID" value="${item.itemID}">	
						<input type="number" name="qtd-itens" min="1" max="10" value="1">
					<td>
						<input type="submit" value="Comprar">
					</td>
					
				</tr>
			</form>
			</c:forEach>
		</table>
	
</body>
</html>