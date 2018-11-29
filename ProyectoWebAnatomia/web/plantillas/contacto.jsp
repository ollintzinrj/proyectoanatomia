<%-- 
    Document   : contacto
    Created on : 28/11/2018, 10:35:11 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div id="contacto" style="margin-bottom: 25px;">
  <div style="width: 50%; margin-left: auto; margin-right: auto; padding: 20px; background-color: #fff;">
    <label>Contacto</label>
    
    <div style="margin: 15px 0px 10px 0px;">
      <label>Nombre</label>
      <input type="text" name="contact-name" id="contact-name" class="cajatextoContacto">
    </div>
    
    <div style="margin: 15px 0px 10px 0px;">
      <label>Email</label>
      <input type="text" name="contact-email" id="contact-email" class="cajatextoContacto">
    </div>
    
    <div style="margin: 15px 0px 10px 0px;">
      <label>Mensaje</label>
      <textarea name="contact-message" id="contact-message" row="25" class="cajatextoContacto" style="height: 150px"></textarea>
    </div>
    
    <input type="button" name="envio-contact" value="Enviar" class="boton" style="border-radius: 25px; padding-top: 0px; float: right;">
  </div>
</div>
