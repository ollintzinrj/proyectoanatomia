<%-- 
    Document   : iniciojuego
    Created on : 28/11/2018, 11:25:07 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div id="eligeSistema" style="margin-bottom: 25px; height: 440px;">
  <p>Selecciona un sistema para interacturar</p>
  <form action="informacion" method="POST">
  <!-- Imagenes de sistemas -->
  <div style="display: table; width:  calc(100% - 173px);float: left;">
    <div style="display: table-cell;">
      <img src="./Imagenes/Nervioso.png" class="sistema_img" onmouseover="muestraNombre('pop_sistema_nervioso');" onmouseout="ocultaNombre('pop_sistema_nervioso');">
      
      <div id="pop_sistema_nervioso" style="display:none;">
        <img src="./Iconos/triangulo_naranja.png" class="pop-triangulo_naranja">
        <div class="pop-titulo_narnaja">Sistema Nervioso</div>
      </div>
    </div>
    <div style="display: table-cell;">
      <img src="./Imagenes/Huesos.png" class="sistema_img" onmouseover="muestraNombre('pop_sistema_oseo');" onmouseout="ocultaNombre('pop_sistema_oseo');">
      <div id="pop_sistema_oseo" style="display:none;">
        <img src="./Iconos/triangulo_naranja.png" class="pop-triangulo_naranja">
        <div class="pop-titulo_narnaja">Sistema Oseo</div>
      </div>
    </div>
    <div style="display: table-cell;">
      <img src="./Imagenes/Digestivo.png" class="sistema_img" onmouseover="muestraNombre('pop_sistema_digestivo');" onmouseout="ocultaNombre('pop_sistema_digestivo');">
      <div id="pop_sistema_digestivo" style="display:none;">
        <img src="./Iconos/triangulo_naranja.png" class="pop-triangulo_naranja">
        <div class="pop-titulo_narnaja">Sistema Digestivo</div>
      </div>
    </div>
    <div style="display: table-cell;">
        
        
            <button type="submit">
          <img src="./Imagenes/Circulatorio.png" class="sistema_img" onmouseover="muestraNombre('pop_sistema_circulatorio');" onmouseout="ocultaNombre('pop_sistema_circulatorio');">
            </button>
        <input type="text" value="circulatorio" name="btn" style="display: none">
      <div id="pop_sistema_circulatorio" style="display:none;">
          <img src="./Iconos/triangulo_naranja.png" class="pop-triangulo_naranja">
        <div class="pop-titulo_narnaja">Sistema Circulatorio</div>
      </div>
    </div>
  </div>
  </form>
  
  
  
  <!-- Botones -->
  <div style="width: 173px; float: right; margin-top: 115px;">
    <div class="boton" style="background-color: #F44650; cursor: pointer; width: 150px; margin: 10px; margin-bottom: 30px;">
      <a href="">Siguiente</a></div>
      <div class="boton" style="background-color: #68C149; cursor: pointer; width: 150px; margin: 10px;"><a href="">Regresar</a></div>
    </div>
    <div style="clear: both;"></div>
  </div>