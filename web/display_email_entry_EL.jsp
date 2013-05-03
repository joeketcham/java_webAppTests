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
        <h1>Thanks for entering stuff!</h1>
        <p>Here is the crap you gave me:</p>
        <table cellspacing="5" cellpadding="5" border="1">
            <tr>
                <td align="right">First name:</td>
                <td>${user["firstName"]}</td>
            </tr>
            <tr>
                <td align="right">Last name:</td>
                <td>${user.lastName}</td>
            </tr>
            <tr>
                <td align="right">Email address:</td>
                <td>${user.emailAddress}</td>
            </tr>
        </table>
        <p>To give me more crap, click on the back<br> 
            button in your browser</p>
        <p>Hello ${user.firstName}, today's date is: ${ requestScope.currentDate }</p>
        <p>The second color in the servlet is: ${colors[1]}</p>
        <p>
            The first address on file is: ${users[0].emailAddress}<br>
            The second address on file is: ${users[1].emailAddress}
        </p>
        <p>First name from hashMap: ${usersMap[emailAddress].firstName}</p>
        <p>Browser MIME types: ${header.accept}</p><br><br>
        <p>Browser compression types: ${header["accept-encoding"]}</p>
        <p>The email cookie: ${cookie.emailCookie.value}</p>
        <form action="joinEmailList.jsp" method="post">
            <input type="submit" value="Return">
        </form>
    </body>
</html>
