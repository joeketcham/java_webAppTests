/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
/**
 *
 * @author jkk
 */
public class User implements Serializable{
    private String firstName;
    private String lastName;
    private String emailAddress;
    
    public User(String firstName, String lastName, String emailAddress)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        
    }
    public User()
    {
        this.firstName = "";
        this.lastName = "";
        this.emailAddress = "";
        
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setEmailAddress(String emailAddress){
        this.emailAddress = emailAddress;
    }
    public String getEmailAddress(){
        return emailAddress;
    }
    public static HashMap<String, User> getUsersMap(String filename) throws IOException
    {
        HashMap<String, User> users = new HashMap<String, User>();
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
                users.put(emailAddress, user);
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
