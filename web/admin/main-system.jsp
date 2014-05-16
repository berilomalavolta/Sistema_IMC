

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


                    <div class="body-partition"></div>
                </div>                    
            </nav>
            <div class="lesson-partition" ></div>

        </div>  

        <div class="clear"></div>

        <div class="partition"></div>
        
            
        <%@include file="footer.jsp" %>
    </body>
</html>
