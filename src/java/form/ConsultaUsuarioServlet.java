
package form;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Usuario;

public class ConsultaUsuarioServlet extends HttpServlet{
    private PreparedStatement pstmt;
    String pemail = "", psenha = "", pnome = "", psobrenome = ""; int pid; String pdesc = "";
    
    public void init() throws ServletException {
        inicializaJdbc();
    }
    
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
            
        try {
            //recebe as informações de login da página jsp
            String email = request.getParameter("emailLogin");
            String senha = request.getParameter("senhaLogin");
            
            //gera erro caso o usuário não coloque suas credenciais no login
            int erro;
            if(email.equals("") || senha.equals("")) 
                erro = 1/0;
            
            //consulta o usuário requerido
            consultaUsuario(email, senha);
            
            
            Usuario user = new Usuario();
            user.setNome(pnome);
            user.setSobrenome(psobrenome);
            user.setDesc(pdesc);
            user.setId(pid);
            
            HttpSession sessao = request.getSession(true);  
            sessao.setAttribute("user",user);
            
            request.setAttribute("user", user);
                        
            response.sendRedirect("admin/main-system.jsp");
        } catch (Exception ex) {
            response.sendRedirect("login-error.jsp");
            //out.println("Error: " + ex.getMessage());
            return;
        }
    }
    
    private void inicializaJdbc() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost/db_imc", "root", "");
            pstmt = c.prepareStatement("select id, nome, sobrenome, email, senha, userdesc from usuario where email = ?");            
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    
    private boolean consultaUsuario(String email, String senha) throws SQLException {
        pstmt.setString(1, email);
        
        
        
        ResultSet rs = pstmt.executeQuery();
        while(rs.next()){            
            pid = Integer.parseInt(rs.getString("id"));
            pemail = rs.getString("email");
            psenha = rs.getString("senha");
            pnome = rs.getString("nome");
            psobrenome = rs.getString("sobrenome");
            pdesc = rs.getString("userdesc");
        }
        
        
        if(email.equals(pemail) && senha.equals(psenha)){
            return true;
        }else{
            rs.getString("emailerrado");
        }
        
        return false;
        //pstmt.close();
    }
}
