package cat.iespaucasesnoves.boats.api;

import cat.iespaucasesnoves.boats.exepcions.DadesIncorrectesException;
import cat.iespaucasesnoves.boats.exepcions.VendaException;
import java.util.Date;

/**
 *
 * @author DRAKUL
 */
public class Venda extends Operacio {

    private final Vaixell vaixell;
    private Date dataVenda;
    private double preu;
    private final Client comprador;
    private final Venedor venedor;

    public Venda(Vaixell vaixell, Date dataVenda, double preu, Client comprador, Venedor venedor, Estat estat) throws VendaException {
        super(estat);
        this.vaixell = vaixell;
        if (dataVenda == null) {
            throw new VendaException();
        } else {
            this.dataVenda = dataVenda;
        }
        if (preu <= 0) {
            throw new VendaException();
        } else {
            this.preu = preu;
        }
        this.comprador = comprador;

        this.venedor = venedor;

    }

    public Vaixell getVaixell() {
        return vaixell;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public double getPreu() {
        return preu;
    }

    public Client getComprador() {
        return comprador;
    }

    public Venedor getVenedor() {
        return venedor;
    }

    public void setDataVenda(Date dataVenda) throws DadesIncorrectesException {
        if (dataVenda == null) {
            throw new DadesIncorrectesException();
        } else {
            this.dataVenda = dataVenda;
        }
    }
    /*
     Si el preu d'una venda canvia se suposa que s'esta tramitant
     */

    public void setPreu(double preu) throws DadesIncorrectesException {
        if (preu <= 0) {
            throw new DadesIncorrectesException();
        } else {
            this.preu = preu;
            estat = Estat.TRAMITANT;
        }
    }

    public void tancarVenda() {
        estat = Estat.FINALITZAT;
    }

    @Override
    public String toString() {
        return "vaixell\n" + vaixell + "dataVenda= " + dataVenda + " preu= " + preu + "\ncomprador\n " + comprador + "\nvenedor\n " + venedor + '}';
    }

}
