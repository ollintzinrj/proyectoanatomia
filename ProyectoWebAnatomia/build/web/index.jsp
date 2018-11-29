<%-- 
    Document   : index
    Created on : 28/11/2018, 10:24:07 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta name="tipo_contenido"  content="text/html;" http-equiv="content-type" charset="utf-8">
    <link rel="stylesheet" type="text/css" href="CSS/header.css">
    <link rel="stylesheet" type="text/css" href="CSS/contenido.css">
    <link rel="stylesheet" type="text/css" href="CSS/footer.css">
    <script type="text/javascript" src="JS/principal.js"></script>
    <script type="text/javascript" src="JS/visualizar.js"></script>
    <title>Proyecto Anatomía para Niños</title>
</head>
  <body class="body">
      <% 
        String sUrlPage = "plantillas/principal.jsp";
        System.out.println(request.getParameter("page"));
        
        if (request.getParameter("page") != null) { 
          sUrlPage = "plantillas/"+request.getParameter("page").toString()+".jsp";
        }
      %>
    
    <jsp:include page="plantillas/header.jsp" />
    
    <div id="content-wrap" class="content-wrap">
      <div id="content" style="margin: auto 30px;  max-width: 1280px;">
        <!-- Este es el lugar que ira cambiando para mostrar bloques de información, que son las páginas -->
          <jsp:include page="<%=sUrlPage%>" />
        <!-- fin del bloque para cmabiar -->
        </div>
    </div>
    
    <jsp:include page="plantillas/footer.jsp" />
    
  </body>
</html>
