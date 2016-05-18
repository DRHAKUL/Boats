package cat.iespaucasesnoves.boats.api;

import cat.iespaucasesnoves.boats.exepcions.DadesIncorrectesException;
import cat.iespaucasesnoves.boats.exepcions.EmpleatException;
import cat.iespaucasesnoves.boats.exepcions.PersonaException;
import cat.iespaucasesnoves.boats.exepcions.VenedorException;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;

public class Venedor extends Empleat {

    private double comissio;
    private double souTotal;
    private HashMap<Integer, Venda> llistaVendes;

    public Venedor(double comissio, String nom, String cognom, Document tipusDocument, String numeroDocument, String adreca, String telefon, String correu, Date dataAlta, Double sou) throws VenedorException, DadesIncorrectesException, PersonaException, EmpleatException {
        super(nom, cognom, tipusDocument, numeroDocument, adreca, telefon, correu, dataAlta, sou);
        llistaVendes = new HashMap<>();
        if (comissio < 0 || comissio >= 50) {
            throw new VenedorException();
        } else {
            this.comissio = comissio;
        }
        souTotal = 0;
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

    public void setSouTotal() {
        Iterator it = llistaVendes.entrySet().iterator();
        double totalVendes = 0;
        while (it.hasNext()) {
            Venda nova = (Venda) it.next();
            Venedor mostra = nova.getVenedor();
            if (mostra.getNumeroDocument().equals(this.getNumeroDocument())) {
                totalVendes = totalVendes + nova.getPreu();

            }
        }

        souTotal = sou + (totalVendes * 100 / comissio);
    }

    public String getNomina() {
        return "{nom:" + nom + ",cognom:" + cognom + ",tipusDocument:" + tipusDocument + ",numeroDocument:" + numeroDocument + ",adreca:" + adreca + ",telefon:" + telefon + ",correu:" + correu + ",dataAlta:" + dataAlta + ",sou:" + sou + ",comissio:" + comissio + ",souTotal:" + souTotal + "}";
    }

}
