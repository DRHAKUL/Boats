/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iespaucasesnoves.boats.api;

import java.util.Date;

/**
 *
 * @author DRAKUL
 */
public class Venedor extends Empleat {

    private double comissio;

    public Venedor(double comissio, String nom, String cognom, Document tipusDocument, String adreca, String telefon, String correu, Date dataAlta, Double sou) {
        super(nom, cognom, tipusDocument, adreca, telefon, correu, dataAlta, sou);
        this.comissio = comissio;
    }

    public double getComissio() {
        return comissio;
    }

    public void setComissio(double comissio) {
        this.comissio = comissio;
    }

}