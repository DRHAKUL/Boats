package cat.iespaucasesnoves.boats.api;

import java.util.Date;

public class Venedor extends Empleat {

    private double comissio;

    public Venedor(double comissio, String nom, String cognom, Document tipusDocument, String numeroDocument, String adreca, String telefon, String correu, Date dataAlta, Double sou) {
        super(nom, cognom, tipusDocument, numeroDocument, adreca, telefon, correu, dataAlta, sou);
        this.comissio = comissio;
    }

    public double getComissio() {
        return comissio;
    }

    public void setComissio(double comissio) {
        this.comissio = comissio;
    }

    public String getNomina() {
        return "{" + "nom:" + nom + "," + "cognoms:" + cognom + "," + "tipusDocument:" + tipusDocument + "numeroDocument" + adreca + "}";
    }

}
