<%-- 
    Document   : M_juez
    Created on : 7/06/2017, 10:15:19 PM
    Author     : Lucero
--%>

<%@page import="MVC_clases.Clase_juez"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%  Clase_juez a= (Clase_juez)request.getSession().getAttribute("valor"); %>
        <h1>Modificar</h1>
        <form name="modificar" action="Modi_juez">
            <table border="1">
                <thead>
                    <tr>
                        <th>Campos</th>
                        <th>Datos</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Codigo</td>
                        <td><input type="text" name="codigo" value="<%= a.getCodigo() %>" readonly maxlength="8" /></td>
                    </tr>
                    <tr>
                        <td>Nombre</td>
                        <td><input type="text" name="nombre" value="<%= a.getNombre() %>" /></td>
                    </tr>
                    <tr>
                        <td>Apellidos</td>
                        <td><input type="text" name="apellido" value="<%= a.getApellido() %>" /></td>
                    </tr>
                    <tr>
                        <td>Nacionalidad</td>
                        <td><input type="text" name="nacionalidad" value="<%=a.getNacionalidad() %>" /></td>
                    </tr>
                    <tr>
                        <td>Fecha de Nacimiento</td>
                        <td><input type="date" name="fecha" value="<%= a.getFecha_nac() %>" /></td>
                    </tr>
                </tbody>
            </table>
            <input type="submit" value="Guardar" name="Guardar" />
        </form>
    </body>
</html>
