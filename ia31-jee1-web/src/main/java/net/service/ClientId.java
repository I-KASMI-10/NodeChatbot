/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.vpc.Account;
import net.vpc.Client;
import net.vpc.models.AccountFacade;
import net.vpc.models.ClientFacade;

/**
 *
 * @author ROOT
 */
@WebServlet(name = "ClientId", urlPatterns = {"/ClientId"})
public class ClientId extends HttpServlet {

    @EJB
    private ClientFacade clientFacade;
    
    @EJB
    private AccountFacade accountFacade;
    

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       // response.setContentType("application/json");
         response.setContentType("text/charset=UTF-8");
        List<Client> l = clientFacade.findAll();
        
        try (PrintWriter out = response.getWriter()) {
            String user = "";
            user = request.getParameter("user");
            Long id = Long.parseLong(user);
            List<Account> ll = (List<Account>) accountFacade.findAll();
//            String objectToReturn = "{ key1: 'value1', key2: 'value2' }";
            /* TODO output your page here. You may use following sample code. */

            // out.println("<h1>Servlet ClientId at " + request.getContextPath() + "</h1>");
               out.println(" welcome " + ll.get(0).getLogin() + "  " + ll.get(0).getBalance() + "    "+user);
             //out.println(" votre solde est :  " + ll.get(0));
//            out.print(objectToReturn);
//            out.flush();
//            Object ojb = {"nom" : "titi"};
//        String json = new Gson().toJson(ojb);
//        response.setContentType("application/json");
//        response.setCharacterEncoding("UTF-8");
//        response.getWriter().write(json);
    }
}

// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
/**
 * Handles the HTTP <code>GET</code> method.
 *
 * @param request servlet request
 * @param response servlet response
 * @throws ServletException if a servlet-specific error occurs
 * @throws IOException if an I/O error occurs
 */
@Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
        public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
