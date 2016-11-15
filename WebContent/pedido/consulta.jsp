<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Carrinho</title>
</head>
<body>
	
		
	<form name="itens-carrinho" action="${pageContext.request.contextPath}/resumo" method="post">	
		<table>
			<tr>
				<th>Item</th>
				<th>Qtd </th>
			</tr>
				<c:forEach var="itemCarrinho" items="${carrinho.itemsCarrinho}">
					
						<tr>
							<td>${itemCarrinho.item.descricaoCurta}</td>
							<td><input type="number" name="itemCarrinho.item.itemID" min="1" max="10" value="${itemCarrinho.numItens}"></td>
						</tr>
				</c:forEach>
			<tr>
				<td><a href="${pageContext.request.contextPath}/catalogo">Continuar comprando</a>
				<input type="submit" value="Finalizar compra"><td>
			</tr>	
		</table>
		</form>	
	

</body>
</html>