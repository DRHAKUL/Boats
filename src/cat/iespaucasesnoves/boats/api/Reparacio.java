package cat.iespaucasesnoves.boats.api;

import java.util.ArrayList;
import java.util.Date;

public class Reparacio extends Operacio {

    private Client propietari;
    private Vaixell vaixell;
    private ArrayList<Mecanic> mecanics;
    private String llocReparacio;
    private Date dataInici;
    private Date dataPrevFinal;
    private String descAveria;
    private double preuPresupost;
    private double preuExtras;
    private double preuFinal;
    private String notes;

    public Reparacio(Client propietari, Vaixell vaixell, String llocReparacio, Date dataInici, Date dataPrevFinal, String descAveria, double preuPresupost, Estat estat) {
        super(estat);
        this.propietari = propietari;
        this.vaixell = vaixell;
        this.llocReparacio = llocReparacio;
        this.dataInici = dataInici;
        this.dataPrevFinal = dataPrevFinal;
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

    public void setDataPrevFinal(Date dataPrevFinal) {
        this.dataPrevFinal = dataPrevFinal;
    }

    public void setPreuFinal(double preuFinal) {
        this.preuFinal = preuFinal;
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

}
