
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html;charset=utf-8" >
        <link rel="shortcut icon" href="img/logo_shortcut_icon.png">
        <title>UNIFEI - IMC Services</title>
        
        <!-- Arquivos bootstrap -->
        <link rel="stylesheet" href="bootstrap/css/bootstrap.css" type="text/css" >
        <script type="text/javascript" src="bootstrap/js/bootstrap.js"></script>
        
        <link href="bootstrap/css/carousel.css" rel="stylesheet">
        <script src="js/jquery.js"></script>
        <script src="bootstrap/js/bootstrap.min.js"></script>
        <script src="bootstrap/js/docs.min.js"></script>
        
        <!-- Arquivos de validação dos campos de cadastro -->
        <script type="text/javascript" src="js/jquery.js"></script> 
        <script type="text/javascript" src="js/jquery.validate.js"></script> 
        <script type="text/javascript" src="js/validacao.js" charset="UTF-8" ></script>
        
        <!-- Arquivos de Estilo da página -->
        <link rel="stylesheet" href="css/style-index.css" type="text/css" > 

    </head>
    <body>
        <div class="login_box">
            <!-- Login -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">

                <ul class="nav navbar-nav navbar-right">
                    <img src="img/logo_SIMC.png">
                    <form class="form-inline" role="form" action="consulta-usuario" method="POST">
                        <div class="form-group">
                            <label for="exampleInputEmail1">Usuário</label>
                            <label class="sr-only" for="exampleInputEmail2">Email</label>
                            <input type="user" class="form-control" name="emailLogin" id="exampleInputEmail2" placeholder="Usuário">
                        </div>
                        <div class="form-group">
                            <label for="exampleInputEmail1">Senha</label>
                            <label class="sr-only" for="exampleInputPassword2">Password</label>
                            <input type="password" class="form-control" name="senhaLogin" id="exampleInputPassword2" placeholder="Senha">
                        </div>
                        <div class="checkbox">
                          <label>
                            <input type="checkbox"> Lembre-me
                          </label>
                        </div>                        
                        <div class="button_login">
                            <button type="submit" class="btn btn-primary btn-loggin">Entrar</button>
                        </div>                        
                    </form>
                </ul>
            </div>
        </div>        
    </body>
</html>

