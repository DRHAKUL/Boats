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
public class Patro extends Empleat {

    private String titulacio;
    private double preuDia;

    public Patro(String titulacio, double preuDia, String nom, String cognom, Document tipusDocument, String numeroDocument, String adreca, String telefon, String correu, Date dataAlta, Double sou) {
        super(nom, cognom, tipusDocument, numeroDocument, adreca, telefon, correu, dataAlta, sou);
        this.titulacio = titulacio;
        this.preuDia = preuDia;
    }

}
