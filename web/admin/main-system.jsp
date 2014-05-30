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
        <link rel="stylesheet" href="../bootstrap/css/bootstrap.css" type="text/css" >
        <script type="text/javascript" src="../bootstrap/js/bootstrap.js"></script>
        
        <!-- Arquivos de Estilo da página -->
        <link rel="stylesheet" href="../css/style-main.css" type="text/css" >
        
    </head>
    <body>
        <%@include file="header.jsp" %>  
        
        
        <div class="partition"></div>  

        <%@include file="left-menu.jsp" %>

        <div class="body-shape">

                        
            <nav class="navbar navbar-default" role="navigation">                    
                <div class="request">
                    <div class="body-partition"></div>
                        <form method="POST" role="form" action="chamado"> 
                            <h1> + Chamado <small>de Serviço</small></h1>
                            <div class="form-group">
                                <label for="exampleInputEmail1">Tipo de Chamado</label>
                                <select name="tipo_chamado" multiple class="form-control">
                                    <option>Serviço 1</option>
                                    <option>Serviço 2</option>
                                    <option>Serviço 3</option>
                                    <option>Serviço 4</option>
                                    <option>Serviço 5</option>
                                </select>
                            </div>
                            <div class="form-group">
                                <label for="exampleInputEmail1">Descrição do Chamado</label>
                                <textarea name="desc_chamado" class="form-control" rows="3"></textarea>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-3 control-label">Data do Chamado</label>
                                <p class="form-control-static" >
                                    <input name="data_chamado" type="text" value="<%=dataStr%>" 
                                           width="25%" onkeypress="formataData(this, event)" 
                                           maxlength="10" > 
                                </p>

                            </div>                          
                            <button type="submit" class="btn btn-default" >Submeter</button>
                          </form>

                    <div class="body-partition"></div>
                </div>                    
            </nav>
                                           
            

        </div>  

        <div class="clear"></div>

        <div class="partition"></div>
        
            
        <%@include file="footer.jsp" %>
    </body>
</html>

<!-- Chamado Completo
<form role="form"> 
                            <h1> + Chamado <small>de Serviço</small></h1>
                            <div class="form-group">
                              <label for="exampleInputEmail1">Código Identificador do Chamado</label>
                              <input class="form-control" id="disabledInput" type="text" placeholder="10000001" disabled>
                            </div>
                            <div class="form-group">
                                <label for="exampleInputEmail1">Tipo de Chamado</label>
                                <select multiple class="form-control">
                                    <option>Serviço 1</option>
                                    <option>Serviço 2</option>
                                    <option>Serviço 3</option>
                                    <option>Serviço 4</option>
                                    <option>Serviço 5</option>
                                </select>
                            </div>
                            <div class="form-group">
                                <label for="exampleInputEmail1">Descrição do Chamado</label>
                                <textarea class="form-control" rows="3"></textarea>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-3 control-label">Data do Chamado</label>
                                <p class="form-control-static" >
                                    <input type="text" name="date" value="<%=dataStr%>" 
                                           width="25%" onkeypress="formataData(this, event)" 
                                           maxlength="10" disabled> 
                                </p>
                                
                            </div>
                            <div class="form-group">
                                <label class="col-sm-3 control-label">Data da Resolução</label>
                                <p class="form-control-static">Não Resolvido</p>
                            </div>                          
                            <button type="submit" class="btn btn-default">Submeter</button>
                          </form>
-->
