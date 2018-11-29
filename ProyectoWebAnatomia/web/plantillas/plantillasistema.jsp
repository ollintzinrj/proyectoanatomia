<%-- 
    Document   : plantillasistema
    Created on : 28/11/2018, 11:50:16 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<div id="sistema_x" style="margin-bottom: 25px;">
            <p id="titulo_sistema_X" class="titulo">Sistema Circulatorio</p>
           <% 
      
        System.out.println( "llego de servlet ");
        
    
      %>
      ${sessionScope.miDato}
            <div style="width:  calc(100% - 442px);float: left;height: 673px; margin-right: 20px;position: relative;">
              <div id="info_sistema_x" style="background-color: pink; width: 100%;margin-left: auto;margin-right: auto;  overflow: auto; height: calc(100% - 165px);">
                  Información:<br>
                  <c:forEach items="${lista}" var="dato">
                      ${dato} <br>
                  </c:forEach>
              </div>

              <div id="contenedor_elementos" style="position: absolute;bottom: 0px;width: 100%;">
                
                <div class="div_slider_iconos">
                  <div id="elementos_sistema" class="contenedor_slider">                 
                    <div class="organos">
                      <img src="./Imagenes/elementosCardio/corazon.png" class="elementosEnSistema">
                    </div>
                    <div class="organos">
                      <img src="./Imagenes/elementosCardio/arterias.png" class="elementosEnSistema">
                    </div>
                    <div class="organos">
                      <img src="./Imagenes/elementosCardio/gblancos.png" class="elementosEnSistema">
                    </div>
                    <div class="organos">
                      <img src="./Imagenes/elementosCardio/grojos.png" class="elementosEnSistema">
                    </div>
                    <div class="organos">
                      <img src="./Imagenes/elementosCardio/plaquetas.png" class="elementosEnSistema">
                    </div>
                    <div class="organos">
                      <img src="./Imagenes/elementosCardio/venas.png" class="elementosEnSistema">
                    </div>
                  </div>
                </div>

                <div style="display: table;margin: 0px auto;">
                  <div id="botonquiz_sistema_X" class="boton quiz boton_linea" style="">Quiz</div>
                </div>

              </div>
            </div>
            
            <div style="width: 412px;float: right;height: 673px;">
              <img src="./Imagenes/Circulatorio.png" style="height: 100%; width: 100%;">
            </div>
            <div style="clear: both;"></div>
          </div>