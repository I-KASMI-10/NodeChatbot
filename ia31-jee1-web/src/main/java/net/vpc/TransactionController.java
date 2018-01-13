/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.vpc;

import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import net.vpc.Client;
import net.vpc.models.TransactionsClientFacade;

/**
 *
 * @author ROOT
 */
@Named(value = "transactionController")
@SessionScoped
public class TransactionController implements Serializable{
     @EJB
    private TransactionsClientFacade transactionsClientFacade;
    private TransactionsClient t = new TransactionsClient();

    public TransactionsClient getT() {
        return t;
    }

    public void setT(TransactionsClient t) {
        this.t = t;
    }
   
    public TransactionController() {
    }
    public List<TransactionsClient> findAll(){
        return this.transactionsClientFacade.findAll();
    }
    public String addTransaction(){
        this.transactionsClientFacade.create(this.t);
        return "index";
    }
    public void removeTransaction(TransactionsClient t){
        this.transactionsClientFacade.remove(t);
    }
    public String editTransaction(TransactionsClient t){
        this.t = t;
        return "editTransaction";
    }
    public String editTransaction(){
        this.transactionsClientFacade.edit(this.t);
        return "index";
    }
}
