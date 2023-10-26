<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Lista de Baterias </title>
</head>
<body>
    <h2>Lista de Baterias 🥁</h2>

    <ul>
         <c:forEach items="${bateria}" var="bateria">
                    <li>Tipo: ${bateria.tipo}, Preço: R$ ${bateria.preco}</li>
                </c:forEach>
    </ul>
    <p>A média do preço das baterias é: R$ <fmt:formatNumber value="${mediaValor}" type="number" pattern="#,##0.00" /></p>

     <a href="/">Voltar para a página inicial 🏠</a>
</body>
</html>