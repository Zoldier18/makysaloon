<%-- 
    Document   : R_juez
    Created on : 7/06/2017, 11:05:24 PM
    Author     : Lucero
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Registro de Jueces</h1>
        <hr>
        <form action ="../Reg_juez">
        Nombre: <input type="text" name="nombre" value="" />
        <br>
        Apellido: <input type="text" name="apellido" value="" />
        <br>
        Nacionalidad: <input type="text" name="nacionalidad" value="" />
        <br>
        Fecha Nac.: <input type="date" name="fecha" value="" />
        <br>
        <input type="submit" value="Guardar" name="Guardar"/>
        </form>
        
    </body>
</html>
