package form;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Usuario;
import services.Db_conection;

public class ProfileServlet extends HttpServlet {

    private PreparedStatement pstmt;

    public void init() throws ServletException {
        inicializaJdbc();
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            //recebe as informações de login da página jsp
            String nome = request.getParameter("nome");
            String sobrenome = request.getParameter("sobrenome");
            String desc = request.getParameter("description");

            HttpSession sessao = request.getSession(true);
            Usuario usuario = (Usuario) sessao.getAttribute("user");
            int id = usuario.getId();

            //modifica o usuário requerido
            modificaUsuario(nome, sobrenome, desc, id);

            Usuario user = new Usuario();
            user.setNome(nome);
            user.setSobrenome(sobrenome);
            user.setDesc(desc);
            user.setId(id);

            sessao.setAttribute("user", user);

            request.setAttribute("user", user);

            response.sendRedirect("profile.jsp");
        } catch (Exception ex) {
            //out.println("Error: " + ex.getMessage());
            return;
        }
    }

    private void inicializaJdbc() {
        try {
            pstmt = Db_conection.ex_statement("db_imc", "update usuario set nome = ?, sobrenome = ?, userdesc = ? where id = ?");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    private boolean modificaUsuario(String nome, String sobrenome, String desc, int id) throws SQLException {

        try {
            pstmt.setString(1, nome);
            pstmt.setString(2, sobrenome);
            pstmt.setString(3, desc);
            pstmt.setInt(4, id);
            pstmt.executeUpdate();
            //pstmt.close();
        } catch (Exception ex) {
            System.out.println(ex);
            return false;
        }

        return true;

    }
}
