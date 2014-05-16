
package form;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class LoginServlet extends HttpServlet{
    
    
    protected  void  processRequest(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException { 
        
                
        if (request.getSession(false) != null) {
            response.sendRedirect(request.getContextPath() + "/admin/sistema-principal.jsp");
        }else{
            response.sendRedirect(request.getContextPath() + "/index.jsp");
        }
    
    }
    
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*HttpSession session = request.getSession();
        
        String nome = (String)session.getAttribute("nome");
        
        if (nome != "") {
            response.sendRedirect(request.getContextPath() + "/sistema-principal.jsp");
        }else{
            response.sendRedirect(request.getContextPath() + "/index.jsp");
        }*/
        
        processRequest(request, response);
    }
}
