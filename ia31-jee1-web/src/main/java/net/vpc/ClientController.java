/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.vpc;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.*;
import javax.ejb.EJB;
import net.vpc.models.ClientFacade;

/**
 *
 * @author ROOT
 */
@Named(value = "clientController")
@SessionScoped
public class ClientController implements Serializable {

    @EJB
    private ClientFacade clientFacade;
    private Client c = new Client();

    public Client getC() {
        return c;
    }

    public void setC(Client c) {
        this.c = c;
    }
   
    public ClientController() {
    }
    public List<Client> findAll(){
        return this.clientFacade.findAll();
    }
    public String addClient(){
        this.clientFacade.create(this.c);
        return "index";
    }
    public void removeClient(Client c){
        this.clientFacade.remove(c);
    }
    public String editClient(Client c){
        this.c = c;
        return "editClient";
    }
    public String editClient(){
        this.clientFacade.edit(this.c);
        return "index";
    }
}
