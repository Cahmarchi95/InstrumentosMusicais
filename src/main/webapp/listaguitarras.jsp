<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Lista de Guitarras</title>
</head>
<body>
    <h2> Lista de todas guitarras 🎸</h2>

    <ul>
        <c:forEach items="${todasGuitarras}" var="guitarra">
            <li>Modelo: ${guitarra.modelo}, Preço: R$ ${guitarra.preco}</li>
        </c:forEach>
    </ul>

    <h3>Modelo Les Paul: </h3>

    <ul>
        <c:forEach items="${lesPaulGuitarras}" var="guitarra">
            <li>Modelo: ${guitarra.modelo}, Preço: R$ ${guitarra.preco}</li>
        </c:forEach>
    </ul>

    <a href="/">Voltar para a página inicial 🏠</a>
</body>
</html>
