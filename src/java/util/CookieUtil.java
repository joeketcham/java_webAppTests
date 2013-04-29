/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import javax.servlet.http.*;
/**
 *
 * @author jkk
 */
public class CookieUtil {
    public static String getCookieValue(
            Cookie[] cookies, String cookieName)
    {
        String cookieValue = "";
        Cookie cookie;
        if (cookies != null)
        {
            for (Cookie c : cookies) 
            {
                if (cookieName.equals(c.getName()))
                {
                    cookieValue = c.getValue();
                }
            }
        }
        return cookieValue;
    }
}
