package email;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import business.User;
import data.UserIO;
import java.util.Date;
import java.util.Set;

public class AddEmailListServlet extends HttpServlet
{    
    @Override
    protected void doPost(HttpServletRequest request, 
                          HttpServletResponse response) 
                          throws ServletException, IOException
    {
        // get parameters from the request
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String emailAddress = request.getParameter("emailAddress");

        // get a relative file name
        ServletContext context = getServletContext();
        String path = context.getRealPath("/WEB-INF/EmailList.txt");

        // use regular Java classes
        User user = new User(firstName, lastName, emailAddress);
        UserIO.add(user, path);
        
        // store the User object in the request object
        request.setAttribute("user", user);
        
        // send the current date
        Date currentDate = new Date();
        request.setAttribute("currentDate", currentDate);
        
        // forward request and response objects to JSP page
        String url = "/display_email_entry_EL.jsp";
        RequestDispatcher dispatcher =
             getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);              
    }    
}
