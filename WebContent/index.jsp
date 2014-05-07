<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<%--
    This file is an entry point for JavaServer Faces application.
--%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Projeto Banco de Dados</title>
    </head>
    <body>
        <f:view>
            <h:form>
            <h1>Menu Principal</h1>
            
            <ul>
                <li> Especialidade ( 
                  <h:commandLink value="Cadastrar" action="cadEspecialidade"/> | 
                  <h:commandLink value="Listar" action="listaEspecialidade"/> ) </li>
                <li> Médico 
                  <h:commandLink value="Cadastrar" action="cadMedico"/> | 
                  <h:commandLink value="Listar" action="listaMedico"/> )
                </li>
            </ul>
            </h:form>
        </f:view>
    </body>
</html>