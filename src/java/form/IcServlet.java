/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package form;

import java.io.IOException;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import services.Db_conection;

/**
 *
 * @author Berilo
 */
public class IcServlet extends HttpServlet {
    private String classificacao;

    @Override
    public void init() throws ServletException {
   //     inicializaJdbc();
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //HttpSession sessao = request.getSession(true);
        //Usuario usuario = (Usuario) sessao.getAttribute("user");      
        
        try {
            //recebe dados
            classificacao = request.getParameter("classificacao");
            if(classificacao.equalsIgnoreCase("hardware")){
                String tipo = request.getParameter("tipo");
                String modelo = request.getParameter("modelo");
                String descricao = request.getParameter("description");
                String loc_inst = request.getParameter("local");
                String nro_patrimonio = request.getParameter("patrimonio");
                String nro_serie = request.getParameter("sn");
                String estado = request.getParameter("estado_ic");
                String data_aq = request.getParameter("data_aq");
                String val_estimado = request.getParameter("valor");
                String meses_val = request.getParameter("validade");
                
                //cadastrar ic
                cadastrarIC_hardware(tipo, modelo, descricao, loc_inst, nro_patrimonio, nro_serie, estado, data_aq, val_estimado, meses_val);
                
            }else if(classificacao.equalsIgnoreCase("software")){
                String nome = request.getParameter("nome");
                String licenca = request.getParameter("licenca");
                String funcao = request.getParameter("description");
                String sn_hardware = request.getParameter("sn_hardware");
                String plataforma = request.getParameter("plataforma");
                String estado = request.getParameter("estado_ic");
                String data_aq = request.getParameter("data_aq");
                String val_estimado = request.getParameter("valor");
                String meses_val = request.getParameter("validade");
                
                //cadastrar ic
                cadastrarIC_software(nome, licenca, funcao, sn_hardware, plataforma, estado, data_aq, val_estimado, meses_val);
                
            }else if(classificacao.equalsIgnoreCase("documentacao")){
                String titulo = request.getParameter("titulo");
                String versao = request.getParameter("versao");
                String descricao = request.getParameter("description");
                String licenca = request.getParameter("licenca");
                String responsavel = request.getParameter("responsavel");
                String estado = request.getParameter("estado_ic");
                String data_aq = request.getParameter("data_aq");
                String val_estimado = request.getParameter("valor");
                String meses_val = request.getParameter("validade");
                
                //cadastrar ic
                cadastrarIC_documento(titulo, versao, descricao, licenca, responsavel, estado, data_aq, val_estimado, meses_val);

            }

            response.sendRedirect("main-system.jsp");
        } catch (Exception ex) {
            //out.println("Error: " + ex.getMessage());
            return;
        }
    }

    private void cadastrarIC_hardware(String tipo, String modelo, String descricao, String loc_inst, String nro_patrimonio, String nro_serie, String estado, String data_aq, String val_estimado, String meses_val) {
        //conversão de valores
        float val = Float.parseFloat(val_estimado);
        int validade = Integer.parseInt(meses_val);
        //transforma a data no formato para banco
        Date dataAq = null;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");  
        try { 
            dataAq = new java.sql.Date(format.parse(data_aq).getTime());
        } catch (ParseException ex) {
            Logger.getLogger(IcServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            PreparedStatement pstmt = Db_conection.ex_statement("cmdb", "insert into ic (valor, classificacao, validade, estado, data_aq, hardware_sn, hardware_patrimonio, hardware_tipo_eqpto, hardware_modelo, hardware_descricao, hardware_local_isnt) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            pstmt.setFloat(1, val);
            pstmt.setString(2, classificacao);
            pstmt.setInt(3, validade);
            pstmt.setString(4, estado);
            pstmt.setDate(5, dataAq);
            pstmt.setString(6, nro_serie);
            pstmt.setString(7, nro_patrimonio);
            pstmt.setString(8, tipo);
            pstmt.setString(9, modelo);
            pstmt.setString(10, descricao);
            pstmt.setString(11, loc_inst);
            pstmt.executeUpdate();
            pstmt.close();
        } catch (Exception ex) {
            Logger.getLogger(IcServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void cadastrarIC_software(String nome, String licenca, String funcao, String sn_hardware, String plataforma, String estado, String data_aq, String val_estimado, String meses_val) {
        //conversão de valores
        float val = Float.parseFloat(val_estimado);
        int validade = Integer.parseInt(meses_val);
        //transforma a data no formato para banco
        Date dataAq = null;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");  
        try { 
            dataAq = new java.sql.Date(format.parse(data_aq).getTime());
        } catch (ParseException ex) {
            Logger.getLogger(IcServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            PreparedStatement pstmt = Db_conection.ex_statement("cmdb", "insert into ic (valor, classificacao, validade, estado, data_aq, software_licenca, software_nome, software_plataforma, software_funcao, software_sn_hard) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            pstmt.setFloat(1, val);
            pstmt.setString(2, classificacao);
            pstmt.setInt(3, validade);
            pstmt.setString(4, estado);
            pstmt.setDate(5, dataAq);
            pstmt.setString(6, licenca);
            pstmt.setString(7, nome);
            pstmt.setString(8, plataforma);
            pstmt.setString(9, funcao);
            pstmt.setString(10, sn_hardware);
            pstmt.executeUpdate();
            pstmt.close();
        } catch (Exception ex) {
            Logger.getLogger(IcServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void cadastrarIC_documento(String titulo, String versao, String descricao, String licenca, String responsavel, String estado, String data_aq, String val_estimado, String meses_val) {
        //conversão de valores
        float val = Float.parseFloat(val_estimado);
        int validade = Integer.parseInt(meses_val);
        //transforma a data no formato para banco
        Date dataAq = null;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");  
        try { 
            dataAq = new java.sql.Date(format.parse(data_aq).getTime());
        } catch (ParseException ex) {
            Logger.getLogger(IcServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            PreparedStatement pstmt = Db_conection.ex_statement("cmdb", "insert into ic (valor, classificacao, validade, estado, data_aq, doc_titulo, doc_versao, doc_licenca, doc_responsavel) values (?, ?, ?, ?, ?, ?, ?, ?, ?)");
            pstmt.setFloat(1, val);
            pstmt.setString(2, classificacao);
            pstmt.setInt(3, validade);
            pstmt.setString(4, estado);
            pstmt.setDate(5, dataAq);
            pstmt.setString(6, titulo);
            pstmt.setString(7, versao);
            pstmt.setString(8, licenca);
            pstmt.setString(9, responsavel);
            pstmt.executeUpdate();
            pstmt.close();
        } catch (Exception ex) {
            System.out.println("ERRO: " + ex.toString());
        }
    }

}
