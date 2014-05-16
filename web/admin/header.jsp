
<jsp:useBean id="user" class="model.Usuario" scope="session"/>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="shortcut icon" href="../img/logo_shortcut_icon.png">
        <title>UNIFEI - IMC Services</title>
        
        <!-- Arquivos bootstrap -->
        <link rel="stylesheet" href="../bootstrap/css/bootstrap.css" type="text/css" >
        <link rel="stylesheet" href="../bootstrap/css/bootstrap-theme.css" type="text/css" >
        <script type="text/javascript" src="../bootstrap/js/bootstrap.js"></script>
        <link href="../bootstrap/css/navbar.css" rel="stylesheet">
        <script src="../js/jquery.js"></script>
        <script src=../"bootstrap/js/bootstrap.min.js"></script>
        
        <!-- Arquivos de Estilo da página -->
        <link rel="stylesheet" href="../css/style-main.css" type="text/css" >
        
        
    </head>
    <body>
        <!-- Barra superior -->
        <nav class="navbar navbar-default" role="navigation">
            <div class="navbar-header">
                
                    <a class="navbar-brand" href="main-system.jsp">
                        <div class="main-logo"><img src="../img/logo_SIMC_small.png" /></div>
                    </a>
                
            </div>
            
            <!-- Exibe o nome do usuário logado -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav navbar-right">
                        
                    <li class="dropdown">
                      <a href="#" class="dropdown-toggle" data-toggle="dropdown">${user.nome} ${user.sobrenome} <b class="caret"></b></a>
                      <ul class="dropdown-menu">
                        <li><a href="main-system.jsp">Início</a></li>
                        <li><a href="profile.jsp">Perfil</a></li>
                        <li><a href="#">Configurações</a></li>
                        <li><a href="${pageContext.request.contextPath}/logout">Sair</a></li>
                        
                        <li class="divider"></li>
                        <li><a href="#">Help</a></li>
                        <li><a href="#">Report a Problem</a></li>
                      </ul>
                    </li>
                </ul>
            </div>
        </nav>
                        
                        
    </body>
</html>
