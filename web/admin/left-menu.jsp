<jsp:useBean id="user" class="model.Usuario" scope="session"/>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>UNIFEI - IMC Services</title>

        <!-- Arquivos bootstrap -->
        <link rel="stylesheet" href="../bootstrap/css/bootstrap.css" type="text/css" >
        <script type="text/javascript" src="../bootstrap/js/bootstrap.js"></script>
        <script src="../js/jquery.js"></script>

        <!-- Arquivos de Estilo da página -->
        <link rel="stylesheet" href="../css/style-main.css" type="text/css" >

    </head>
    <body>
        <div class="left-menu">
            <nav class="navbar navbar-default" role="navigation">

                <div class="left-menu-inside">
                    <!-- Permissão de Usuários -->
                    <br/>
                    <h3><b>+ Chamados</b></h3>
                    <br/>
                    <div class="left-sub-menu-inside">                            
                        <h4>- Resolvidos</h4>
                        <br/>
                        <h4>- Não Resolvidos</h4>
                        <br/>
                        <h4>- Todos</h4>                            
                    </div>
                    <br/>

                    <% if (user.getTipoUsuario().equalsIgnoreCase("coordenador")) { %>
                    <h3><b>+ Cadastrar</b></h3>
                    <br/>
                    <div class="left-sub-menu-inside"> 
                        <nav>
                            <ul>
                                <li><a href="#">Usuário</a></li>
                                <li><a href="/Sistema_IMC/admin/add-ic.jsp">Item de Configuração</a></li>
                            </ul>
                        </nav> 
                    </div>
                    <br/>
                    <% } %>

                    <% if (user.getTipoUsuario().equalsIgnoreCase("coordenador")) { %>
                    <h3><b>+ Relatórios</b></h3>
                    <br/>
                    <div class="left-sub-menu-inside">

                        <h5>- Tempo de Resolução</h5>
                        <br/>
                        <h5>- Chamados Não Resolvidos</h5>
                        <br/>
                        <h5>- Equipamentos Defeituosos</h5>
                        <br/>
                        <h5>- Eficiência do Funcionário</h5>
                        <br/>
                        <h5>- Chamadas Realizadas por Usuário</h5>                            
                    </div>
                    <br/>
                    <% }%>
                </div>

            </nav>
        </div>
    </body>
</html>
