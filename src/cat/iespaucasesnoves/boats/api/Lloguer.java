package cat.iespaucasesnoves.boats.api;

import cat.iespaucasesnoves.boats.exepcions.DadesIncorrectesException;
import cat.iespaucasesnoves.boats.exepcions.LloguerExeption;
import java.util.Date;

/**
 *
 * @author DRAKUL
 */
public class Lloguer extends Operacio {

    private boolean ambPatro;
    private Date iniciLloguer;
    private Date fiLloguer;
    private Client client;
    private Vaixell vaixell;
    private double preuDia;
    private Patro patro;
    private double preuTotalLloguer;

    /**
     * Constructor amb Patro.
     */
    public Lloguer(boolean ambPatro, Date iniciLloguer, Date fiLloguer, Client client, Vaixell vaixell, double preuDia, Patro patro, Estat estat) throws LloguerExeption {
        super(estat);
        this.ambPatro = ambPatro;
        if (iniciLloguer.after(fiLloguer) || (iniciLloguer.equals(fiLloguer))) {
            throw new LloguerExeption();
        } else {
            this.iniciLloguer = iniciLloguer;
            this.fiLloguer = fiLloguer;
        }
        this.client = client;
        this.vaixell = vaixell;
        if (preuDia < 0) {
            throw new LloguerExeption();

        } else {
            this.preuDia = preuDia;
        }
        this.patro = patro;
        preuTotalLloguer = 0;
    }

    /**
     * Constructor sense Patro.
     */
    public Lloguer(Date iniciLloguer, Date fiLloguer, Client client, Vaixell vaixell, double preuDia, Estat estat) throws LloguerExeption {
        this(false, iniciLloguer, fiLloguer, client, vaixell, preuDia, null, estat);
    }

    public boolean isAmbPatro() {
        return ambPatro;
    }

    public Date getIniciLloguer() {
        return iniciLloguer;
    }

    public Date getFiLloguer() {
        return fiLloguer;
    }

    public Client getClient() {
        return client;
    }

    public Vaixell getVaixell() {
        return vaixell;
    }

    public double getPreuDia() {
        return preuDia;
    }

    public Patro getPatro() {
        return patro;
    }

    /**
     * Comproba que les data de fi sigui major que la de inici.
     *
     */
    public void setIniciLloguer(Date iniciLloguer) throws DadesIncorrectesException {
        if (iniciLloguer.after(fiLloguer) || (iniciLloguer.equals(fiLloguer))) {
            throw new DadesIncorrectesException();
        } else {
            this.iniciLloguer = iniciLloguer;
            estat = Estat.INICIAT;
        }
    }

    public void setFiLloguer(Date fiLloguer) throws DadesIncorrectesException {
        if (iniciLloguer.after(fiLloguer) || (iniciLloguer.equals(fiLloguer))) {
            throw new DadesIncorrectesException();
        } else {
            this.fiLloguer = fiLloguer;
            estat = Estat.FINALITZAT;
        }
    }

    public void setPreuDia(double preuDia) throws DadesIncorrectesException {
        if (preuDia <= 0) {
            throw new DadesIncorrectesException();

        } else {
            this.preuDia = preuDia;
        }
    }

    /*
     * Calcula els dies a partir de dues date.
     */
    public int calcularDies(Date inci, Date fi) {
        double data1 = inci.getTime();
        double data2 = fi.getTime();
        double diferencia = data1 - data2;
        int dias = (int) Math.floor(diferencia / (1000 * 60 * 60 * 24));
        return dias;
    }

    /**
     * Calcula el preu total del lloguer amb patro i sense patro segons el
     * numero de dies.
     */
    public void calcularPreuLloguer() {
        double dias = calcularDies(iniciLloguer, fiLloguer);
        if (ambPatro) {
            preuTotalLloguer = dias * (preuDia + patro.getPreuDia());
        } else {
            preuTotalLloguer = dias * preuDia;
        }
    }

    public double getPreuTotalLloguer() {
        return preuTotalLloguer;
    }

    @Override
    public String toString() {
        return "id = " + id + " estat= " + estat + " ambPatro= " + ambPatro + " iniciLloguer= " + iniciLloguer + " fiLloguer= " + fiLloguer + "\n client\n" + client + "\n vaixell\n" + vaixell + "\n patro\n " + patro + "\n preuTotalLloguer=" + preuTotalLloguer;
    }

}
