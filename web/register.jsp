<%-- 
    Document   : register
    Created on : May 15, 2012, 8:54:07 PM
    Author     : TATARAO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%--      <html:errors/> --%>
        <html:html>
            <html:form action="register" method="get" >
       name:       <html:text property="username" /></br>
       password:         <html:password property="password" /><br>
            <html:submit value="Register" />      
            </html:form>
        </html:html>
    </body>
</html>
