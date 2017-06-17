<%-- 
    Document   : R_partido
    Created on : 8/06/2017, 04:00:57 PM
    Author     : Lucero
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%  ArrayList<String> listacamp= (ArrayList<String>)request.getSession().getAttribute("listacamp");
    ArrayList<String> listaest= (ArrayList<String>)request.getSession().getAttribute("listaest");
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    <body>
        <h1>Registro de Partido</h1>
        <hr>
        <form action ="../Reg_partido">
        Fecha: <input type="date" name="fecha" value="" />
        <br>
        Hora: <input type="time" name="hora" value="" />
        <br>
        Campeonato: 
        <select name="campeonato">
            <% for(int i = 0; i < listacamp.size(); i++){ %>
            <option><%= listacamp.get(i)%></option>
            <% }%>
        </select>
        <br>
        Estadio: 
        <select name="estadio">
            <% for(int i = 0; i < listaest.size(); i++){ %>
            <option><%= listaest.get(i)%></option>
            <% }%>
        </select>
        <br>
        <input type="submit" value="Guardar" name="Guardar"/>
        </form>
    </body>
</html>
