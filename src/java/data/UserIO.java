/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data;
import java.io.*;
import business.User;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
/**
 *
 * @author jkk
 */
public class UserIO {
    public static void add(User user, String filepath) throws IOException 
    {
        File file = new File(filepath);
        PrintWriter out = new PrintWriter(
                new FileWriter(file, true));
        out.println(user.getEmailAddress()+ "|" 
                + user.getFirstName() + "|" 
                + user.getLastName());
        out.close();
    }
    public static ArrayList<User> getUsers(String filename) throws IOException
    {
        ArrayList<User> users = new ArrayList<User>();
        BufferedReader in = new BufferedReader(
                new FileReader(filename));
        String line = in.readLine();
        while (line != null)
        {
            try
            {
                StringTokenizer t = new StringTokenizer(line, "|");
                String emailAddress = t.nextToken();
                String firstName = t.nextToken();
                String lastName = t.nextToken();
                User user = new User(firstName, lastName, emailAddress);
                users.add(user);
                line = in.readLine();
            }
            catch(NoSuchElementException e)
            {
                line = in.readLine();                
            }
        }
        in.close();
        return users;
    }
    
}
