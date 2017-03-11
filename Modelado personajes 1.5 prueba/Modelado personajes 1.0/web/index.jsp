<%-- 
    Document   : index
    Created on : 24-feb-2017, 17:03:11
    Author     : JULIAN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link type="text/css" rel="stylesheet" href="EstiloIndex.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Crear Personaje</title>
    </head>
    <body background="IMG/fondo1.jpg">
        <form action="Crear" method="post">
            <center>
                <h1 class="titulo">CREA TU PERSONAJE</h1>
                <h2 class="subtitulo">Escoje un Personaje</h2>
                <input type="radio" name="seleccion" value="Humano">Humano<br>
                <input type="radio" name="seleccion" value="Elfo">Elfo<br>
                <input type="radio" name="seleccion" value="Enano">Enano<br>
                <input type="radio" name="seleccion" value="Hechicero">Hechicero<br>
                <input type="submit" value="Empezar a Crear">
            </center>    
        </form>    
    </body>
</html>
