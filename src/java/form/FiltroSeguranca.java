
package form;

import java.io.IOException;

 

import javax.servlet.Filter;

import javax.servlet.FilterChain;

import javax.servlet.FilterConfig;

import javax.servlet.ServletException;

import javax.servlet.ServletRequest;

import javax.servlet.ServletResponse;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import javax.servlet.http.HttpSession;

import model.Usuario;

 

public class FiltroSeguranca implements Filter {

 

      public void init(FilterConfig config) throws ServletException {


      }

 

      public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) 
              throws IOException, ServletException {

            HttpSession session = ((HttpServletRequest)req).getSession();

            Usuario usuario = (Usuario)session.getAttribute("user");

            //adicionar uma variável estadoUsuario booleano que verifica se o usuário
            //ativou sua conta pelo email
            if(usuario==null){
                
                  session.setAttribute("msg","Você não está logado no sistema!");

                  ((HttpServletResponse)res).sendRedirect("../index.jsp");

            }else{

                  chain.doFilter(req, res);

            }

      }

 

      public void destroy() {


      }

}