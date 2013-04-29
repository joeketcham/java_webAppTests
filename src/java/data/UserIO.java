/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data;
import java.io.*;
import business.User;
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
    
}
