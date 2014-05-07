<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <f:view>
        
            <h2> Lista de Especialidade </h2>
            <h:form>
                <h:dataTable value="#{EspecialidadeBean.all}" var="centro">
                     <h:column>
                        <h:outputText value="#{especialidade.id}"/>
                    </h:column>
                    <h:column>
                        <h:outputText value="#{especialidade.nome}"/>
                    </h:column>
                     <h:column>
                        <h:commandLink value="Alterar" action="#{EspecialidadeBean.alterar}">
                            <f:param name="id" value="#{especialidade.id}"/>
                        </h:commandLink>
                    </h:column>

                    <h:column>
                        <h:commandLink value="Remover" actionListener="#{EspecialidadeBean.remover}">
                            <f:param name="id" value="#{especialidade.id}"/>
                        </h:commandLink>
                    </h:column>
                </h:dataTable>
            
            <br>
                <h:commandLink value="Cadastro" action="cadEspecialidade"/>
                <br>
                <a href="index.jsp">Menu Principal </a>
            
            </h:form>
            
            
        </f:view>
        
        
        
    </body>
</html>