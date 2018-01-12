<%-- 
    Document   : mostrarcv
    Created on : 12-ene-2018, 12:00:25
    Author     : luis
--%>

<%@page import="paquetecv.CreaHTML"%>
<%@page import="java.util.List"%>
<%@page import="paquetecv.Campo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    List<Campo> lista_campos=(List<Campo>)request.getAttribute("lista_campos");
    String html_cv=CreaHTML.pintarCV(lista_campos);
    %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="funciones/funciones.js"></script>
        <link rel="stylesheet" type="text/css" href="estilos/estilos.css">
    </head>
    <body>
        <h1>Curriculum</h1>
        <%=html_cv%>
    </body>
</html>
