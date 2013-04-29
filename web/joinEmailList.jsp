<%-- 
    Document   : join_email_list.jsp
    Created on : Apr 16, 2013, 7:10:32 PM
    Author     : jkk
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Join our email list</h1>
        <p>To join fill out the form you dummy!</p>
        <form action="AELS" method="post">
            <jsp:useBean id="user" scope="session" class="business.User"/>
            <table cellspacing="5" border="0">
                <tr>
                    <td align="right">First name:</td>
                    <td><input type="text" name="firstName"
                               value="<jsp:getProperty name="user" property="firstName"/>"
                    </td>
                </tr>
                <tr>
                    <td align="right">Last name:</td>
                    <td><input type="text" name="lastName"
                               value="<jsp:getProperty name="user" property="lastName"/>"
                    </td>
                </tr>
                <tr>
                    <td align="right">Email address:</td>
                    <td><input type="text" name="emailAddress"
                               value="<jsp:getProperty name="user" property="emailAddress"/>"
                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td><br><input type="submit" value="Submit"></td>
                </tr>
            </table>
        </form>
</html>
