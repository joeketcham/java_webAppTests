package email;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import business.User;
import data.UserIO;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
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
        
        HashMap<String, User> usersMap = UserIO.getUsersMap(path);
        request.setAttribute("usersMap", usersMap);
        request.setAttribute("emailAddress", emailAddress);
        
        Cookie c = new Cookie("emailCookie", emailAddress);
        c.setMaxAge(60*60); //set its age to 1 hour
        c.setPath("/"); //allow the entire application to access it
        response.addCookie(c);
        
        // send the current date
        Date currentDate = new Date();
        request.setAttribute("currentDate", currentDate);
        
        request.setAttribute("codesTest", "8601,pf01,pf02,jr01");
        
        // send an array of colors to the view
        String[] colors = {"Red", "blue", "green"};
        ServletContext application = this.getServletContext();
        application.setAttribute("colors", colors);
        
        // get array of users from the stored data using userIO
        ArrayList<User> users = UserIO.getUsers(path);
        application.setAttribute("users", users);
        
        // forward request and response objects to JSP page
        String url = "/display_email_entry_EL.jsp";
        RequestDispatcher dispatcher =
             getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);              
    }    
}
