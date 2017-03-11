<%-- 
    Document   : Personaje
    Created on : 24-feb-2017, 17:14:09
    Author     : JULIAN
--%>


<%  
  String personaje = request.getParameter("dato");
  String escudo = request.getParameter("escudo");
  String cuerpo = request.getParameter("cuerpo");
  String arma = request.getParameter("arma");
  String montura = request.getParameter("montura");
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link type="text/css" rel="stylesheet" href="EstiloPersonaje.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tu personaje</title>
    </head>
    <body background="IMG/fondo2.jpg">
    <center>
        <h1 class="titulo"><%=personaje%></h1>
        <table>
            <tr><img src= <%=cuerpo%> ></tr>
            <tr><img src= <%=escudo%> ></tr>
            <tr><img src= <%=arma%> ></tr>
            <tr><img src= <%=montura%> ></tr>
        </table>
    </center>    
    </body>
</html>
