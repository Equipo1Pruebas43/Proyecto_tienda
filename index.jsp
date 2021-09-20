<%@page import="control.Conexion" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="css/styles.css" type="text/css" rel="stylesheet"/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>
<title>Tienda Generica</title>

</head>
<body>
<%
Conexion con=new Conexion();
con.conexionbd();
%>

       <header id="Encabezado" class="Encabezado">
        <div class="cont_titulologo">
            <h1 style="color: #9297a0">Bienvenidos a la <b style="color: #13aaaa;">Tienda Gen&eacute;rica</b></h1>
            <div class="logo"></div>
        </div>
    </header>
    
    <div>
        <section class="barraGris" style="width:40%"></section>
        <form action="ServletAutentica" id="Ingreso" class="Ingreso" method="post">
            <table>
                <tr>
                    <td>Usuario:</td>
                    <td><input type="text" name="usuario" class="txtField_01"></td>
                </tr>
                <tr>
                    <td>Contrase&ntilde;a:</td>
                    <td><input type="password" name="clave" class="txtField_01"></td>
                </tr>
                <tr>
                <td><input type="submit" value="Aceptar" class="btns" name="btn_login"></td>
                <td><input type="submit" value="Cancelar"class="btns"></td>
                </tr>			
            </table>
        </form>
    </div>
   
</body>
</html>