/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Admin
 */
@WebServlet("/informacion")
public class ServletInformacionSistema extends HttpServlet {
    HttpSession session;
    
    @Override
    protected void doPost( HttpServletRequest request , HttpServletResponse response ){
        try {
            System.out.println("llego DEL FORMULARIO DE SISTEMAS "+request.getParameter("btn"));
            
          
            //buscar la info de circulatorio
            List<String> lista = new ArrayList<>();
            lista.add("info1");
            lista.add("info2");
            lista.add("info3");
            
            request.setAttribute("datos", lista);
            
            session = request.getSession();
            
            session.setMaxInactiveInterval(60*5); // 5 minutos dura la sesion
            session.setAttribute("miDato", lista); //GUARDO LOS DATOS EN UNA VARIABLE DE SESION NO ES LO IDEAL PERO SOLUCIONA DE MOMENTO
            
            //request.getRequestDispatcher("index.jsp?page=plantillasistema").forward(request, response);
            response.sendRedirect("index.jsp?page=plantillasistema");
        } catch (IOException ex) {
            Logger.getLogger(ServletInformacionSistema.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
