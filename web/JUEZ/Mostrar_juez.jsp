<%-- 
    Document   : Mostrar_juez
    Created on : 7/06/2017, 08:49:55 PM
    Author     : Lucero
--%>


<%@page import="MVC_clases.Clase_juez"%>
<%@page import="java.util.LinkedList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%  LinkedList<Clase_juez> lista= (LinkedList<Clase_juez>)request.getSession().getAttribute("listajueces");%>
        <h1>Lista de Jueces</h1>
        <table border="1">
            <thead>
                <tr>
                    <th>Codigo</th>
                    <th>Nombre</th>
                    <th>Apellidos</th>
                    <th>Nacionalidad</th>
                    <th>Fecha de nacimiento</th>
                </tr>
            </thead>
            <tbody>
                <% for(int i = 0; i < lista.size(); i++){ %>
                
                <tr>
                    <th><%= lista.get(i).getCodigo() %></th>
                    <th><%= lista.get(i).getNombre() %></th>
                    <th><%= lista.get(i).getApellido() %></th>
                    <th><%= lista.get(i).getNacionalidad() %></th>
                    <th><%= lista.get(i).getFecha_nac() %></th>
                  
                    <td><a href="<%= request.getContextPath()%>/Mod_juez?id=<%= lista.get(i).getCodigo()%> " >Modificar</a></td>
                    <td><a href="<%= request.getContextPath()%>/El_juez?id=<%= lista.get(i).getCodigo()%> ">Eliminar</a></td>
                </tr>
                <% }%>
            </tbody>
                <a href="./JUEZ/R_juez.jsp">nuevo</a>
    </body>
</html>
