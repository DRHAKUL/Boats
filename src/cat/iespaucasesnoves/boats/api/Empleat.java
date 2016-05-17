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
public class Empleat extends Persona {

    protected Date dataAlta;
    protected double sou;

    public Empleat(String nom, String cognom, Document tipusDocument, String adreca, String telefon, String correu, Date dataAlta, Double sou) {
        super(nom, cognom, tipusDocument, adreca, telefon, correu);
        this.dataAlta = dataAlta;
        this.sou = sou;
    }

    public Date getDataAlta() {
        return dataAlta;
    }

    public void setDataAlta(Date dataAlta) {
        this.dataAlta = dataAlta;
    }

    public double getSou() {
        return sou;
    }

    public void setSou(double sou) {
        this.sou = sou;
    }

    public String generarNomina() {
        String nomina = "La nomina del " + getClass() + " suma un total de " + sou + " euros.";
        return nomina;
    }

}
