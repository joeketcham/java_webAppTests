
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="util.CookieUtil"%>
<%@ include file="/includes/header.html" %>
        <h1>Hello World!</h1><br>
        <a href="<c:url value='/joinEmailList.jsp' />">Join the mailing list Expression Language Tests</a><br><br>
        <a href="ch10/joinEmailList.jsp">ch10 joinEmailList.jsp</a><br>
        <a href="./AE">test AE link</a><br>
        <a href="./Emailsss">test servlet emailsss</a><br>
        <a href="userIO.html">To userIO</a><br>
        <a href="servletIO.html">To servletIO</a><br>
        <p>Test form:</p>
        
        <br><br>
        
        
        <p>
        <%
            //CookieUtil cu = new CookieUtil;
            //String test = "";
            //CookieUtil.getCookieValue(request.getCookies(), "fName");
            //CookieUtil.getCookieValue(request.getCookies(), "lName");
            //CookieUtil.getCookieValue(request.getCookies(), "emailAddress");
            //CookieUtil.getCookieValue(request.getCookies(), "JSESSIONID");
            %>
        </p>
        <%@include file="/includes/footer.jsp" %>