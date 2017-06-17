<%-- 
    Document   : L_partido
    Created on : 7/06/2017, 11:49:36 PM
    Author     : Lucero
--%>

<%@page import="MVC_clases.Clase_partido"%>
<%@page import="java.util.LinkedList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%  LinkedList<Clase_partido> lista= (LinkedList<Clase_partido>)request.getSession().getAttribute("listapartido");%>
        <h1>Lista de Partido</h1>
        <table border="1">
            <thead>
                <tr>
                    <th>Codigo</th>
                    <th>Fecha</th>
                    <th>Hora</th>
                    <th>Campeonato</th>
                    <th>Estadio</th>
                </tr>
            </thead>
            <tbody>
                <% for(int i = 0; i < lista.size(); i++){ %>
                
                <tr>
                    <th><%= lista.get(i).getCodigo() %></th>
                    <th><%= lista.get(i).getFecha() %></th>
                    <th><%= lista.get(i).getHora() %></th>
                    <th><%= lista.get(i).getCampeonto() %></th>
                    <th><%= lista.get(i).getEstadio() %></th>
                  
                    <td><a href="<%= request.getContextPath()%>/Mod_juez?id=<%= lista.get(i).getCodigo()%> " >Modificar</a></td>
                    <td><a href="<%= request.getContextPath()%>/El_juez?id=<%= lista.get(i).getCodigo()%> ">Eliminar</a></td>
                </tr>
            
                <% }%>
            </tbody>
            <a href="<%= request.getContextPath()%>/Reg_partido">nuevo</a>
    </body>
</html>
