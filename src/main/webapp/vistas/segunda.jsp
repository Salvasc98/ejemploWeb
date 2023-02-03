<%@ include file="/vistas/cabecera.jsp" %>
<html>
<head>
<title>Segunda</title>
</head>
<body>
	<h1>JSP de Segunda</h1>
	<p>Segunda (dentro de vistas)</p>
	<p>Mensaje del controlador: <c:out value="${ miModelo.mensaje }"/></p>
	<p>${ miModelo.mensaje }</p>
</body>
</html>