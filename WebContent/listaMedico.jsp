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
        <link rel="stylesheet" media="all" type="text/css" href="http://www.sigaa.ufrn.br/shared/css/ufrn.css"/>
    </head>
    <body>
        
        <f:view>
        
            <h2> Lista de Médicos </h2>
            <h:form>
                <h:dataTable value="#{MedicoBean.all}" var="medico" 
                             styleClass="listagem" rowClasses="linhaPar,linhaImpar"> 
                     <h:column>
                         <f:facet name="header">
                             <h:outputText value="Id"/>
                         </f:facet>
                        <h:outputText value="#{medico.id}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Nome"/>
                         </f:facet>
                        <h:outputText value="#{medico.nome}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                             <h:outputText value="Especialidade"/>
                         </f:facet>
                        <h:outputText value="#{medico.especialidade.nome}"/>
                    </h:column>
                     <h:column>
                        <h:commandLink value="Alterar" action="#{MedicoBean.alterar}">
                            <f:param name="id" value="#{medico.id}"/>
                        </h:commandLink>
                    </h:column>

                    <h:column>
                        <h:commandLink value="Remover" actionListener="#{MedicoBean.remover}">
                            <f:param name="id" value="#{medico.id}"/>
                        </h:commandLink>
                    </h:column>
                </h:dataTable>
            
            <br>
                <h:commandLink value="Cadastro" action="cadMedico"/>
                <br>
                <a href="index.jsp">Menu Principal </a>
            
            </h:form>
            
            
        </f:view>
        
    </body>
</html>