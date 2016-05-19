package cat.iespaucasesnoves.boats.api;

import cat.iespaucasesnoves.boats.exepcions.DadesIncorrectesException;
import cat.iespaucasesnoves.boats.exepcions.EmpleatException;
import cat.iespaucasesnoves.boats.exepcions.PersonaException;
import cat.iespaucasesnoves.boats.exepcions.VenedorException;
import java.util.ArrayList;
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

    /**
     * Torna un array amb les vendes
     *
     * @return
     */
    public ArrayList llistarVendes() {
        ArrayList llistatVendes = new ArrayList();
        Iterator it = llistaVendes.entrySet().iterator();
        while (it.hasNext()) {
            Venda nova = (Venda) it.next();
            llistatVendes.add(nova);
        }
        return llistatVendes;
    }

    /**
     * Calcula es sou total sumant sou + comisio sobre totes les seves vendes.
     */
    public void setSouTotal() {
        ArrayList vendes = llistarVendes();
        double totalVendes = 0;
        for (int i = 0; i < vendes.size(); i++) {
            Venda v = (Venda) vendes.get(i);
            totalVendes = totalVendes + v.getPreu();
        }

        souTotal = sou + (totalVendes * 100 / comissio);

    }

    public String getNomina() {
        return "{nom:" + nom + ",cognom:" + cognom + ",tipusDocument:" + tipusDocument + ",numeroDocument:" + numeroDocument + ",adreca:" + adreca + ",telefon:" + telefon + ",correu:" + correu + ",dataAlta:" + dataAlta + ",sou:" + sou + ",comissio:" + comissio + ",souTotal:" + souTotal + "}";
    }

    public void afegirVenda(Venda v) {
        llistaVendes.put(v.getId(), v);
    }

    public void eliminarVenda(int id) {
        llistaVendes.remove(id);
    }

}
