/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iespaucasesnoves.boats.api;

import cat.iespaucasesnoves.boats.exepcions.CompteException;
import cat.iespaucasesnoves.boats.exepcions.DadesIncorrectesException;
import java.io.Serializable;

/**
 *
 * @author jorge
 */
public class Compte implements Pagable,Serializable {

    private String iban;

    public Compte(String iban) throws CompteException {
        this.iban = iban;
        if (iban == null) {
            throw new CompteException();
        } else {
            this.iban = iban;
        }
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) throws DadesIncorrectesException {
        this.iban = iban;
        if (iban == null) {
            throw new DadesIncorrectesException();
        } else {
            this.iban = iban;
        }
    }

    @Override
    public String toString() {
        return "Compte{" + "iban=" + iban + '}';
    }

}
