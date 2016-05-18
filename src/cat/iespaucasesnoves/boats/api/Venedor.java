package cat.iespaucasesnoves.boats.api;

import cat.iespaucasesnoves.boats.exepcions.DadesIncorrectesException;
import cat.iespaucasesnoves.boats.exepcions.VenedorException;
import java.util.Date;

public class Venedor extends Empleat {

    private double comissio;

    public Venedor(double comissio, String nom, String cognom, Document tipusDocument, String numeroDocument, String adreca, String telefon, String correu, Date dataAlta, Double sou) throws VenedorException {
        super(nom, cognom, tipusDocument, numeroDocument, adreca, telefon, correu, dataAlta, sou);
        if (comissio < 0 || comissio >= 50) {
            throw new VenedorException();
        } else {
            this.comissio = comissio;
        }
    }

    public double getComissio() {
        return comissio;
    }

    public void setComissio(double comissio) throws DadesIncorrectesException {
        if (comissio < 0 || comissio >= 50) {
            throw new DadesIncorrectesException();
        } else {
            this.comissio = comissio;
        }
    }

    public String getNomina() {
        return "{nom:" + nom + ",cognom:" + cognom + ",tipusDocument:" + tipusDocument + ",numeroDocument:" + numeroDocument + ",adreca:" + adreca + ",telefon:" + telefon + ",correu:" + correu + ",dataAlta:" + dataAlta + ",sou:" + sou + ",comissio" + comissio + "}";
    }

}
