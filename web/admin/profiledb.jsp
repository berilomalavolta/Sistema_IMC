

<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<jsp:useBean id="user" class="model.Usuario" scope="session"/>
 
<html>
    <head>
        <title>JINSERT Operation</title>
    </head>
    <body>
        <c:if test="${ empty param.nome or empty param.sobrenome}">
            <c:redirect url="profile.jsp" >
                <c:param name="errMsg" value="Please Enter Product and Quantity" />
            </c:redirect> 
        </c:if>
        <sql:setDataSource var="dbsource" driver="com.mysql.jdbc.Driver"
                           url="jdbc:mysql://localhost/english_life"
                           user="root"  password=""/>
 
 
        <sql:update dataSource="${dbsource}" var="result">
            update usuario set nome = ?, sobrenome = ? where email like '${user.email}';
            <sql:param value="${param.nome}" />
            <sql:param value="${param.sobrenome}" />
        </sql:update>
        <c:if test="${result>=1}">
            <font size="5" color='green'> Data inserted successfully.</font>            
        
            <c:redirect url="profile.jsp" >
                <c:param name="susMsg" value="Data inserted successfully." />
            </c:redirect>
        </c:if> 
 
 
    </body>
</html>