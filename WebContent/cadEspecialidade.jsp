<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <f:view>
            
                <h2> Cadastro de Especialidade </h2>
                <h:form>
                    <h:inputHidden value="#{EspecialidadeBean.obj.id}"/>
                    Nome: <h:inputText value="#{EspecialidadeBean.obj.nome}"/>
                    <h:commandButton value="#{EspecialidadeBean.valueBotaoCadastro}" action="#{EspecialidadeBean.cadastrar}"/>
                
                <br>
                <h:commandLink value="Lista" action="listaEspecialidade"/>
                <br>
                <a href="index.jsp">Menu Principal </a>
               
                </h:form>        
            
        </f:view>
        
        </body>
</html>