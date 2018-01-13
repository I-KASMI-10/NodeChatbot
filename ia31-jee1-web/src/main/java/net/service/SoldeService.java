/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.service;

import java.util.List;
import java.util.Objects;
import javax.ejb.EJB;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Response;
import net.vpc.Account;
import net.vpc.Client;
import net.vpc.TransactionsClient;
import net.vpc.models.AccountFacade;
import net.vpc.models.ClientFacade;
import net.vpc.models.TransactionsClientFacade;

/**
 *
 * @author ROOT
 */
@Path("/Services")
@ApplicationPath("/ressources")
public class SoldeService extends Application {

    @EJB
    private AccountFacade accountFacade;
    @EJB
    private ClientFacade clientFacade;
    @EJB
    private TransactionsClientFacade transactionFacade;
//    List<Client> l = clientFacade.findAll();

    @GET
    @Path("/sayHello")
    public String getHello() {

        return "Hello  !! ";
    }

    @GET
    @Path("/getSolde")
    public Response getSolde(@QueryParam("id") Long id) {
        Double res = 0.0;
        if (id != null) {
            List<Account> l = accountFacade.findAll();
            for (int i = 0; i < l.size(); i++) {
                if (Objects.equals(l.get(i).getClient().getId(), id)) {
                    res = l.get(i).getBalance();
                    break;
                }

            }
            return Response.ok("Votre solde actuelle est :  " + res).build();
        }
        return Response.ok("id null !!!!!").build();

    }

    @GET
    @Path("/getTransactions")
    public Response getTransactions(@QueryParam("id") Long id) {
        String res = "";
        if (id != null) {
            res += "Vos transactions sont : ";
            List<TransactionsClient> l = transactionFacade.findAll();
             int k = 1;
            for (int i = 0; i < l.size(); i++) {
               
                if (Objects.equals(l.get(i).getClienttr().getId(), id)) {
                    res += "\n\"Transaction\" " + k + " :  \"Description\" : " + l.get(i).getDescription() + " \"Montant\" :" + l.get(i).getMontant() + "   \"Date\" : " + l.get(i).getTransactionDate();
                     k++;
                }
                
            }
            return Response.ok(res).build();
        }
        return Response.ok("id null !!!!!").build();

    }

}
