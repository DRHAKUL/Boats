/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iespaucasesnoves.boats.api;

import cat.iespaucasesnoves.boats.exepcions.DadesIncorrectesException;
import cat.iespaucasesnoves.boats.exepcions.PatroException;
import java.util.Date;

/**
 *
 * @author DRAKUL
 */
public class Patro extends Empleat {

    private String titulacio;
    private double preuDia;

    public Patro(String titulacio, double preuDia, String nom, String cognom, Document tipusDocument, String numeroDocument, String adreca, String telefon, String correu, Date dataAlta, Double sou) throws DadesIncorrectesException, PatroException {
        super(nom, cognom, tipusDocument, numeroDocument, adreca, telefon, correu, dataAlta, sou);
        this.titulacio = titulacio;
        if (preuDia <= 0) {
            throw new PatroException();
        } else {
            this.preuDia = preuDia;
        }
    }

    public String getTitulacio() {
        return titulacio;
    }

    public double getPreuDia() {
        return preuDia;
    }

    public void setTitulacio(String titulacio) {
        this.titulacio = titulacio;
    }

    public void setPreuDia(double preuDia) throws DadesIncorrectesException {
        if (preuDia <= 0) {
            throw new DadesIncorrectesException();
        } else {
            this.preuDia = preuDia;
        }
    }

    public String getNomina() {
        return "{nom:" + nom + ",cognom:" + cognom + ",tipusDocument:" + tipusDocument + ",numeroDocument:" + numeroDocument + ",adreca:" + adreca + ",telefon:" + telefon + ",correu:" + correu + ",dataAlta:" + dataAlta + ",sou:" + sou + ",preuDia" + preuDia + "}";
    }

}
