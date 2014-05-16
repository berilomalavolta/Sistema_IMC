

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="shortcut icon" href="img/logo_shortcut_icon.png">
        <title>UNIFEI - IMC Services</title>
        
        <!-- Arquivos bootstrap -->
        <link rel="stylesheet" href="bootstrap/css/bootstrap.css" type="text/css" >
        <script type="text/javascript" src="bootstrap/js/bootstrap.js"></script>
        
        <!-- Arquivo de Estilo da página -->
        <link rel="stylesheet" href="css/style-index.css" type="text/css" >
        
    </head>
    <body>
        <!-- Barra superior -->
        <nav class="navbar navbar-default" role="navigation">
            <div class="navbar-header">
                <a class="navbar-brand" href="index.jsp"><b>UNIFEI - IMC Services</b></a>
            </div>
        </nav>
        
        <div class="partition"></div>  

        <div class="error-page-box">
            <!-- Login -->
            <ul class="nav navbar-nav navbar-right">
                <form id="myForm" role="form" action="consulta-usuario" method="POST">
                    <h3>[Erro no Login]</h3>
                    <h4>
                        Usuário ou Senha Inválidos.                   
                    </h4>

                  <h2>Login</h2>

                  <div class="form-group">
                    <label class="sr-only" for="exampleInputEmail2">Email</label>
                    <input type="user" class="form-control" name="emailLogin" id="exampleInputEmail2" placeholder="Email">
                  </div>
                  <div class="form-group">
                    <label class="sr-only" for="exampleInputPassword2">Password</label>
                    <input type="password" class="form-control" name="senhaLogin" id="exampleInputPassword2" placeholder="Senha">
                  </div>
                  <div class="checkbox">
                    <label>
                        <input type="checkbox"> <div class="left-text">Lembre-me</div>
                    </label>
                  </div>
                  <button type="submit" class="btn btn-primary">Entrar</button>
                </form>
                <br /><br />
                [Esqueci minha Senha]
                <br /><br />
            </ul>
            <div class="clear"></div>
        </div>           
        
        <div class="partition"></div>        
                
        <div class="footer-layout"> 
            <div class="center-text">
                <br/>
                © 2014 UNIFEI - IMC Services
            </div>  
            <div class="clear"></div>
        </div>  
    </body>
</html>
