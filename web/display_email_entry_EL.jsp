<%-- 
    Document   : display_email_entry
    Created on : Apr 2, 2013, 5:46:53 PM
    Author     : jkk
--%>

<%@page import="java.util.Enumeration"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Email List change two</title>
    </head>
    <body>
        <%@ page import="business.User" %>
        <%
            User user = (User) request.getAttribute("user");
        %>
        <h1>Thanks for entering stuff!</h1>
        <p>Here is the crap you gave me:</p>
        <table cellspacing="5" cellpadding="5" border="1">
            <tr>
                <td align="right">First name:</td>
                <td><%= user.getFirstName() %></td>
            </tr>
            <tr>
                <td align="right">Last name:</td>
                <td><%= user.getLastName() %></td>
            </tr>
            <tr>
                <td align="right">Email address:</td>
                <td><%= user.getEmailAddress() %></td>
            </tr>

        </table>
    <p>To give me more crap, click on the back<br> 
            button in your browser</p>
        <form action="joinEmailList.jsp" method="post">
            <input type="submit" value="Return">
        </form>
    </body>
</html>
