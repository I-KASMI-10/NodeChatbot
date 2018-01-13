/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.vpc;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author vpc
 */
@Entity
public class Hammadi implements Serializable {

    @Id
    @GeneratedValue
    private int id;
    private String prenom;
    @ManyToOne
    private Alia saAlia;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Alia getSaAlia() {
        return saAlia;
    }

    public void setSaAlia(Alia saAlia) {
        this.saAlia = saAlia;
    }

}
