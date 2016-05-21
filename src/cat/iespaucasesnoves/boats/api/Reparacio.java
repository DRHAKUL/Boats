package cat.iespaucasesnoves.boats.api;

import cat.iespaucasesnoves.boats.exepcions.ReparacioException;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author DRAKUL
 */
public class Reparacio extends Operacio {

    private final Client propietari;
    private final Vaixell vaixell;
    private final ArrayList<Mecanic> mecanics;
    private String llocReparacio;
    private final Date dataInici;
    private Date dataPrevFinal;
    private final String descAveria;
    private final double preuPresupost;
    private final double preuExtras;
    private double preuFinal;
    private String notes;

    public Reparacio(Client propietari, Vaixell vaixell, String llocReparacio, Date dataInici, Date dataPrevFinal, String descAveria, double preuPresupost, Estat estat) throws ReparacioException {
        super(estat);
        this.propietari = propietari;
        this.vaixell = vaixell;
        this.llocReparacio = llocReparacio;
        if (dataInici == null) {
            throw new ReparacioException();
        } else {
            this.dataInici = dataInici;
        }
        if (dataPrevFinal == null) {
            throw new ReparacioException();
        } else {
            this.dataPrevFinal = dataPrevFinal;
        }
        if (dataInici.after(dataPrevFinal)) {
            throw new ReparacioException();
        }
        this.descAveria = descAveria;
        this.preuPresupost = preuPresupost;
        mecanics = new ArrayList<>();
        preuExtras = 0;
        preuFinal = 0;
        notes = "";
    }

    public Client getPropietari() {
        return propietari;
    }

    public Vaixell getVaixell() {
        return vaixell;
    }

    public ArrayList<Mecanic> getMecanics() {
        return mecanics;
    }

    public String getLlocReparacio() {
        return llocReparacio;
    }

    public Date getDataInici() {
        return dataInici;
    }

    public Date getDataPrevFinal() {
        return dataPrevFinal;
    }

    public String getDescAveria() {
        return descAveria;
    }

    public double getPreuPresupost() {
        return preuPresupost;
    }

    public double getPreuExtras() {
        return preuExtras;
    }

    public double getPreuFinal() {
        return preuFinal;
    }

    public String getNotes() {
        return notes;
    }

    public void setLlocReparacio(String llocReparacio) {
        this.llocReparacio = llocReparacio;
    }

    public void setDataPrevFinal(Date dataPrevFinal) throws ReparacioException {
        if (dataInici.after(dataPrevFinal)) {
            throw new ReparacioException();
        } else {
            this.dataPrevFinal = dataPrevFinal;
        }
    }

    public void setPreuFinal(double preuFinal) {
        this.preuFinal = preuFinal + preuExtras;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    private void assignarMecanic(Mecanic m) {
        mecanics.add(m);
    }

    private void eliminarMecanic(Mecanic m) {
        mecanics.remove(m);
    }

    @Override
    public String toString() {
        return "propietari\n" + propietari + "\nvaixell\n" + vaixell + "\nmecanics\n" + mecanics + "\nllocReparacio= " + llocReparacio + "\ndataInici= " + dataInici + " dataPrevFinal= " + dataPrevFinal + "\ndescAveria= " + descAveria + "\npreuPresupost= " + preuPresupost + " preuExtras= " + preuExtras + " preuFinal= " + preuFinal + "\nnotes= " + notes + '}';
    }

}
