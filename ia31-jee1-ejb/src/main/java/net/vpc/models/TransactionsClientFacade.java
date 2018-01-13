/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.vpc.models;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import net.vpc.TransactionsClient;

/**
 *
 * @author ROOT
 */
@Stateless
public class TransactionsClientFacade extends AbstractFacade<TransactionsClient> {

    @PersistenceContext(unitName = "net.vpc_ia31-jee1-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TransactionsClientFacade() {
        super(TransactionsClient.class);
    }
    
}
