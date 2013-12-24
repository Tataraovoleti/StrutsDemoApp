/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author TATARAO
 */
public class RegisterAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    
    /**
     * This is the action called from the Struts framework.
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        StrutsActionFormBean sfb=(StrutsActionFormBean)form;
        
        String name=sfb.getUsername();
        String pwd=sfb.getPassword();
        
        System.out.println(name+" "+pwd);
        
        if(name.equals("fazel")&&pwd.equals("sanjay"))
            return mapping.findForward("success");
        else
            return mapping.findForward("failure");
        
    }
}
