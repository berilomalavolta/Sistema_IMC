
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
import services.Db_conection;

public class ConsultaUsuarioServlet extends HttpServlet{
    private PreparedStatement pstmt;
    String pemail = "", psenha = "", pnome = "", psobrenome = ""; int pid; 
    String pdesc = "", ptipoUsuario = "";
    
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
            
            //identifica o tipo do usuário
            if(ptipoUsuario.equalsIgnoreCase("comum")){
                response.sendRedirect("admin/main-system-user.jsp");
            }else{
                if(ptipoUsuario.equalsIgnoreCase("coordenador")){
                    response.sendRedirect("admin/main-system.jsp");
                }else{
                    if(ptipoUsuario.equalsIgnoreCase("estagiario")){
                        response.sendRedirect("admin/main-system.jsp");
                    }else{
                        if(ptipoUsuario.equalsIgnoreCase("tec_servico")){
                           response.sendRedirect("admin/main-system.jsp"); 
                        }else{
                            if(ptipoUsuario.equalsIgnoreCase("tec_adm")){
                                response.sendRedirect("admin/main-system.jsp");
                            }
                        }
                    }
                }
            }
            
        } catch (Exception ex) {
            response.sendRedirect("login-error.jsp");
            //out.println("Error: " + ex.getMessage());
            return;
        }
    }
    
    private void inicializaJdbc() {
        try {
            pstmt = Db_conection.ex_statement("db_imc", "select id, nome, sobrenome, userdesc, email, senha, tipo_usuario  from usuario where email = ?");        
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    
    private boolean consultaUsuario(String email, String senha) throws SQLException {
        pstmt.setString(1, email);       
        
        ResultSet rs = pstmt.executeQuery();
        while(rs.next()){            
            pid = Integer.parseInt(rs.getString("id"));
            pnome = rs.getString("nome");
            psobrenome = rs.getString("sobrenome");
            pdesc = rs.getString("userdesc");
            pemail = rs.getString("email");
            psenha = rs.getString("senha");
            ptipoUsuario = rs.getString("tipo_usuario");
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
