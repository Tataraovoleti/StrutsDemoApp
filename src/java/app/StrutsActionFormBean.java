/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author TATARAO
 */
public class StrutsActionFormBean extends org.apache.struts.action.ActionForm {
    
    private String username;
    private String password;

    /**
     * @return
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param string
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param i
     */
    public void setPassword(String password) {
        this.password = password;
    }
 /*   @Override
    public ActionErrors validate(ActionMapping mapping,HttpServletRequest request)
    {
        ActionErrors aes=new ActionErrors();
        if(getUsername()!=null && getPassword()!=null)
        {
            aes.add("username",new ActionMessage("required"));
        }
        return aes;
    } */

}
