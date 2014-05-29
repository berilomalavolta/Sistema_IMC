

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>UNIFEI - IMC Services</title>
        
        <!-- Arquivos bootstrap -->
        <link rel="stylesheet" href="../bootstrap/css/bootstrap.css" type="text/css" >
        <script type="text/javascript" src="../bootstrap/js/bootstrap.js"></script>
        
        <!-- Arquivos de Estilo da página -->
        <link rel="stylesheet" href="../css/style-main.css" type="text/css" >
        
        <!-- Arquivos de validação dos campos -->
        <script type="text/javascript" src="js/jquery.js"></script> 
        <script type="text/javascript" src="js/jquery.validate.js"></script> 
        <script type="text/javascript" src="js/validacao.js" charset="UTF-8" ></script>
        
    </head>
    <body>
        <%@include file="header-user.jsp" %>  
        
        <div class="layout-login">
            <div class="partition"></div>  
            
            <%@include file="left-menu.jsp" %>

            <div class="body-shape">
                <!-- Título e Descrição -->
                <nav class="navbar navbar-default" role="navigation">                    
                    <div class="request">
                        <br/>
                        <h1>Perfil</h1>
                        <br/><br/>
                        <!-- Formulário de cadastro de usuário -->
                        <form id="myForm" method="POST" role="form" action="profileuser" > 

                            <div class="form-group">
                                <h3>Nome</h3>
                                <input type="text" name="nome" 
                                       placeholder="Nome" value="${user.nome}" class="form-control" />
                            </div>

                            <div class="form-group">
                                <h3>Sobrenome</h3>
                                <input type="text" name="sobrenome" 
                                       placeholder="Sobrenome" value="${user.sobrenome}" class="form-control" />
                            </div>

                            <div class="form-group">
                                <h3>Sua Descrição</h3>
                                <textarea type="text" name="description" maxlength="300" 
                                          placeholder="Descrição Pessoal" 
                                          class="form-control" rows="3" >${user.desc}</textarea>
                            </div>
                            
                            <div>
                                <button class="btn btn-success" type="submit" >Salvar</button>
                            </div> 
                            

                        </form> 
                        
                        <br/>

                    </div>                    
                </nav>
                
                <div class="clear"></div>
                <div class="body-partition" ></div> 
            </div>
        
        </div>
            
        <div class="clear"></div>    

        <%@include file="footer.jsp" %>          
    </body>
</html>
