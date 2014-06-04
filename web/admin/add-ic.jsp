<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.sql.Date"%>
<%
    //data atual
    Date dataAtual = new Date(System.currentTimeMillis());
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    String dataStr = sdf.format(dataAtual);
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>UNIFEI - IMC Services</title>

        <!-- Arquivos bootstrap -->
        <link rel="stylesheet" href='../bootstrap/css/bootstrap.css' type="text/css" >
        <script type="text/javascript" src="../bootstrap/js/bootstrap.js"></script>

        <!-- Arquivos de Estilo da página -->
        <link rel="stylesheet" href="../css/style-main.css" type="text/css" >

        <!-- Arquivos tabulous (abas) -->
        <script type="text/javascript" src="../js/jquery.js"></script>
        <script type="text/javascript" src="../tabulous/tabulous.js"></script>
        <script type="text/javascript" src="../tabulous/js.js"></script>
        <link href='../tabulous/tabulous.css' rel='stylesheet' type='text/css'>

        <link rel="stylesheet" type="text/css" href="../tabulous/reset-min.css">


    </head>
    <body>
        <%@include file="header.jsp" %>  

        <div class="partition"></div>  

        <%@include file="left-menu.jsp" %>

        <div class="body-shape">

            <nav class="navbar navbar-default" role="navigation">                    
                <div class="request">
                    <div class="body-partition"></div>

                    <h1> + Cadastro <small>de Item de Configuração</small></h1>
                    </p>
                    <h3>Classificação</h3>
                    <div>                                                         
                        <div id="wrapper">

                            <div id="tabs">
                                <ul>
                                    <li><a href="#tabs-1" title="">Hardware</a></li>
                                    <li><a href="#tabs-2" title="">Software</a></li>
                                    <li><a href="#tabs-3" title="">Documentação</a></li>
                                </ul>

                                <div id="tabs_container">
                                    
                                    <!--Cadastro de Hardware-->
                                    <div id="tabs-1">
                                        <form id="myForm" method="POST" role="form" action="cad-ic" >
                                            
                                            <input type="hidden" name="classificacao" 
                                                   value="hardware"  class="form-control ic_form" />

                                            <h3>Tipo</h3>
                                            <input type="text" name="tipo" 
                                                   placeholder="Ex. Impressora"  class="form-control ic_form" />

                                            <h3>Modelo</h3>
                                            <input type="text" name="modelo" 
                                                   placeholder="Ex. Xerox"  class="form-control ic_form" />

                                            <h3>Descrição</h3>
                                            <textarea type="text" name="description" maxlength="300" 
                                                      placeholder="Descrição do equipqmento" 
                                                      class="form-control ic_form" rows="3" ></textarea>
                                            <h3>Local de instalação</h3>
                                            <input type="text" name="local" 
                                                   placeholder="Ex. Secretaria IMC" class="form-control ic_form" />
                                            <h3>Nº Patrimônio</h3>
                                            <input type="text" name="patrimonio" 
                                                   placeholder="Ex. 00001" class="form-control ic_form" />
                                            <h3>Nº de Série</h3>
                                            <input type="text" name="sn" 
                                                   placeholder="abc9932" class="form-control ic_form" />
                                            <h3>Estado</h3>
                                            <select name="estado_ic" class="form-control ic_form">
                                                <option>Ativo</option>
                                                <option>Inativo</option>
                                                <option>Descarte</option>
                                            </select>

                                            <h3>Data de aquisição</h3>
                                            <input type="date" name="data_aq" 
                                                   value="dd/mm/aaaa" class="form-control ic_form" />
                                            <h3>Valor estimado</h3>
                                            <input type="monetary" name="valor" 
                                                   placeholder="1000,00" class="form-control ic_form" />
                                            <h3>Validade (meses)</h3>
                                            <input type="text" name="validade" 
                                                   placeholder="Ex. 36" class="form-control ic_form" />

                                            </p>

                                            <button class="btn btn-success" type="submit" >Salvar</button>
                                            <button class="btn" type="reset" >Limpar</button>
                                        </form>

                                    </div>

                                    <!--Cadastro de Software-->                                     
                                    <div id="tabs-2">
                                        <form id="myForm" method="POST" role="form" action="cad-ic" > 
                                            
                                            <input type="hidden" name="classificacao" 
                                                   value="software"  class="form-control ic_form" />

                                            <h3>Nome</h3>
                                            <input type="text" name="nome" 
                                                   placeholder="Ex. Office 2013"  class="form-control ic_form" />

                                            <h3>Licença</h3>
                                            <input type="text" name="licenca" 
                                                   placeholder="defrr-as331-444ss-brd23-eexx2-rr6gh"  class="form-control ic_form" />

                                            <h3>Função</h3>
                                            <textarea type="text" name="description" maxlength="300" 
                                                      placeholder="Descrição das funcionalidades" 
                                                      class="form-control ic_form" rows="3" ></textarea>
                                            <h3>SN hardware instalado</h3>
                                            <input type="text" name="sn_hardware" 
                                                   placeholder="Ex. Secretaria IMC" class="form-control ic_form" />
                                            <h3>Plataforma</h3>
                                            <select name="plataforma" class="form-control ic_form">
                                                <option>Windows</option>
                                                <option>Linux</option>
                                                <option>IOS</option>
                                                <option>Outros</option>
                                            </select>
                                            <h3>Estado</h3>
                                            <select name="estado_ic" class="form-control ic_form">
                                                <option>Ativo</option>
                                                <option>Inativo</option>
                                                <option>Descarte</option>
                                            </select>

                                            <h3>Data_Aq</h3>
                                            <input type="date" name="data_aq" 
                                                   value="dd/mm/aaaa" class="form-control ic_form" />
                                            <h3>Valor estimado</h3>
                                            <input type="monetary" name="valor" 
                                                   placeholder="1000,00" class="form-control ic_form" />
                                            <h3>Validade (meses)</h3>
                                            <input type="text" name="validade" 
                                                   placeholder="Ex. 36" class="form-control ic_form" />

                                            </p>

                                            <button class="btn btn-success" type="submit" >Salvar</button>
                                            <button class="btn" type="reset" >Limpar</button>
                                        </form>
                                    </div>

                                    <!--Cadastro de Documentação-->
                                    <div id="tabs-3">
                                        
                                        <form id="myForm" method="POST" role="form" action="cad-ic" > 
                                            
                                            <input type="hidden" name="classificacao" 
                                                   value="documentacao"  class="form-control ic_form" />

                                            <h3>Título</h3>
                                            <input type="text" name="titulo" 
                                                   placeholder="Ex. POSIC-UNIFEI"  class="form-control ic_form" />

                                            <h3>Versão</h3>
                                            <input type="text" name="versao" 
                                                   placeholder="Ex. 1.0.1"  class="form-control ic_form" />

                                            <h3>Descrição</h3>
                                            <textarea type="text" name="description" maxlength="300" 
                                                      placeholder="Descrição do documento" 
                                                      class="form-control ic_form" rows="3" ></textarea>
                                            <h3>Licença</h3>
                                            <input type="text" name="licenca" 
                                                   placeholder="Ex. 1.0.1" class="form-control ic_form" />
                                            <h3>Responsável</h3>
                                            <input type="text" name="responsavel" 
                                                   placeholder="Ex. 00001" class="form-control ic_form" />
                                            
                                            <h3>Estado</h3>
                                            <select name="estado_ic" class="form-control ic_form">
                                                <option>Ativo</option>
                                                <option>Inativo</option>
                                                <option>Descarte</option>
                                            </select>

                                            <h3>Data de Aquisição</h3>
                                            <input type="date" name="data_aq" 
                                                   value="dd/mm/aaaa" class="form-control ic_form" />
                                            <h3>Valor estimado</h3>
                                            <input type="monetary" name="valor" 
                                                   placeholder="1000,00" class="form-control ic_form" />
                                            <h3>Validade (meses)</h3>
                                            <input type="text" name="validade" 
                                                   placeholder="Ex. 36" class="form-control ic_form" />

                                            </p>

                                            <button class="btn btn-success" type="submit" >Salvar</button>
                                            <button class="btn" type="reset" >Limpar</button>
                                        </form>    
                                    </div>

                                </div><!--End tabs container-->

                            </div><!--End tabs-->

                            <div class="body-partition"></div>
                        </div>  
                    </div>
            </nav>

        </div>  

        <div class="clear"></div>

        <div class="partition"></div>

        <%@include file="footer.jsp" %>
    </body>

</html>
