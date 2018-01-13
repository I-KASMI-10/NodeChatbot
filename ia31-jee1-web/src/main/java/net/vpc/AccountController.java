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
import net.vpc.models.AccountFacade;

/**
 *
 * @author ROOT
 */
@Named(value = "accountController")
@SessionScoped
public class AccountController implements Serializable {
        @EJB
    private AccountFacade accountFacade;
    private Account a = new Account();

    public Account getA() {
        return a;
    }

    public void setA(Account a) {
        this.a = a;
    }
   
    public AccountController() {
    }
    public List<Account> findAll(){
        return this.accountFacade.findAll();
    }
    public String addAccount(){
        this.accountFacade.create(this.a);
        return "index";
    }
    public void removeAccount(Account a){
        this.accountFacade.remove(a);
    }
    public String editAccount(Account a){
        this.a = a;
        return "editAccount";
    }
    public String editAccount(){
        this.accountFacade.edit(this.a);
        return "index";
    }
}
