/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iespaucasesnoves.boats.api;

import cat.iespaucasesnoves.boats.exepcions.DadesIncorrectesException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author DRAKUL
 */
public class Empleat extends Persona {

    protected Date dataAlta;
    protected double sou;

    public Empleat(String nom, String cognom, Document tipusDocument, String numeroDocument, String adreca, String telefon, String correu, Date dataAlta, Double sou) throws DadesIncorrectesException {
        super(nom, cognom, tipusDocument, adreca, telefon, correu, numeroDocument);
        if (dataAlta.equals("")) {
            throw new DadesIncorrectesException();
        } else {
            this.dataAlta = dataAlta;
        }
        if (sou <= 0) {
            throw new DadesIncorrectesException();

        } else {
            this.sou = sou;
        }
    }

    public Date getDataAlta() {
        return dataAlta;
    }

    public void setDataAlta(Date dataAlta) throws DadesIncorrectesException {
        if (dataAlta.equals("")) {
            throw new DadesIncorrectesException();
        } else {
            this.dataAlta = dataAlta;
        }
    }

    public double getSou() {
        return sou;
    }

    public void setSou(double sou) {
        this.sou = sou;
    }

    public String generarNomina() {

        return null;
    }

}
