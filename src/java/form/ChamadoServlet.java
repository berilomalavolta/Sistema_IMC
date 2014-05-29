package form;

import java.io.IOException;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Usuario;
import services.Db_conection;

public class ChamadoServlet extends HttpServlet {

    private PreparedStatement pstmt;

    public void init() throws ServletException {
        inicializaJdbc();
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession sessao = request.getSession(true);
        Usuario usuario = (Usuario) sessao.getAttribute("user");
        
          
        
        try {
            //recebe do chamado
            String tipoChamado = request.getParameter("tipo_chamado");
            String descChamado = request.getParameter("desc_chamado");
            String dataChamado = request.getParameter("data_chamado");
            //pega o email do usuario na sessão
            String emailU = usuario.getEmail();
            
            //transforma a data no formato para banco
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");  
            Date dataB = new java.sql.Date(format.parse(dataChamado).getTime());

            //cadastrar chamado
            cadastrarChamado(tipoChamado, descChamado, dataB, emailU);


            response.sendRedirect("main-system-user.jsp");
        } catch (Exception ex) {
            //out.println("Error: " + ex.getMessage());
            return;
        }
    }

    private void inicializaJdbc() {
        try {
            pstmt = Db_conection.ex_statement("db_imc", "insert into chamado (tipo, descricao, data_chamado, email_u) values (?, ?, ?, ?)");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    private boolean cadastrarChamado(String tipoChamado, String descChamado, Date dataChamado, String emailU) throws SQLException {

        try {
            pstmt.setString(1, tipoChamado);
            pstmt.setString(2, descChamado);
            pstmt.setDate(3, dataChamado);
            pstmt.setString(4, emailU);
            pstmt.executeUpdate();
            //pstmt.close();
        } catch (Exception ex) {
            System.out.println(ex);
            return false;
        }

        return true;

    }
}
