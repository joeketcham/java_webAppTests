<%@ page import="java.util.*,util.*" %>

<%
    GregorianCalendar currentDate = new GregorianCalendar();
    int currentYear = currentDate.get(Calendar.YEAR);
    
    %>
    
    <p><small>&copy; Copyright <%= currentYear %> Super JKK &amp Associates, Inc.
        </small>
    </p>
    <%@ page import="business.User" %>
    <%
        User user = new User("Joe", "Ketcham", "none@yahoo.com");
        session.setAttribute("testAttribute1", user);
        session.setAttribute("testAttribute2", user);
        session.setAttribute("testAttribute3", user);
        
        Enumeration names = session.getAttributeNames();
        while (names.hasMoreElements())
        {
            System.out.println((String) names.nextElement());
        }
        
        Cookie Fcookie = new Cookie("fName", "Joe");
        Fcookie.setPath("/");
        
        Cookie Lcookie = new Cookie("lName", "Ketcham TEST 4-11");
        Lcookie.setPath("/");
        
        Cookie Ecookie = new Cookie("emailAddress", "none@yahoo.com");
        Ecookie.setPath("/");
        //Fcookie.setMaxAge(0); //deletes the cookie
        response.addCookie(Fcookie);
        response.addCookie(Lcookie);
        response.addCookie(Ecookie);
        String testCookieUtil = "";
        testCookieUtil = CookieUtil.getCookieValue(request.getCookies(), "lName");
        
        %>
        <p>The cookie value is: <%= testCookieUtil %></p>
        <a href="<%=response.encodeURL("testEncoding")%>">"Test encoding"</a>

        <br>
        
</body>
</html>