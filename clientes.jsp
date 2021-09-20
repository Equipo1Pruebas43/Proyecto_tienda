<%@page import="control.Conexion" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="css/styles.css" type="text/css" rel="stylesheet"/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>
<title>Insert title here</title>
</head>
<body>
<%
Conexion con=new Conexion();
con.conexionbd();
%>
  <form action="ServletCliente" id="Ingreso" class="Ingreso" method="post">
            <table>
                <tr>
                    <td>Nombre Cliente:</td>
                    <td><input type="text" name="nomCli" class="txtField_01"></td>
                </tr>
                <tr>
                    <td>Cédula cliente:</td>
                    <td><input type="text" name="cedCli" class="txtField_01"></td>
                </tr>
                <tr>
                    <td>Email cliente:</td>
                    <td><input type="text" name="emaCli" class="txtField_01"></td>
                </tr>
                <tr>
                    <td>Dirección Cliente:</td>
                    <td><input type="text" name="dirCli" class="txtField_01"></td>
                </tr>
                <tr>
                    <td>Teléfono Cliente:</td>
                    <td><input type="text" name="telCli" class="txtField_01"></td>
                </tr>

                <tr>
                <td><input type="submit" value="Aceptar" class="btns" name="btn_insertar"></td>
                <td><input type="submit" value="Cancelar"class="btns"></td>
                </tr>			
            </table>
        </form>
</body>
</html>