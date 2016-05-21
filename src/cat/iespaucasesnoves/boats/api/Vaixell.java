package cat.iespaucasesnoves.boats.api;

import java.io.Serializable;

/**
 *
 * @author Carlos
 */
public class Vaixell implements Serializable {

    private String matricula;
    private final Client propietari;
    private final Model model;
    private boolean perLloguar;
    private double preuDia;

    public Vaixell(String matricula, Client propietari, Model model) {
        this.matricula = matricula;
        this.propietari = propietari;
        this.model = model;
        this.perLloguar = false;
        this.preuDia = 0;
    }

    public Vaixell(String matricula, Client propietari, Model model, double preuDia) {
        this.matricula = matricula;
        this.propietari = propietari;
        this.model = model;
        this.perLloguar = true;
        this.preuDia = preuDia;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Client getPropietari() {
        return propietari;
    }

    public Model getModel() {
        return model;
    }

    public boolean isPerLloguar() {
        return perLloguar;
    }

    public void setPerLloguar(boolean perLloguar, double preuDia) {
        this.perLloguar = perLloguar;
        this.preuDia = preuDia;
    }

    public double getPreuDia() {
        return preuDia;
    }

    public void setPreuDia(double preuDia) {
        this.preuDia = preuDia;
    }

    @Override
    public String toString() {
        return "matricula= " + matricula + " \npropietari\n " + propietari + "\n model= " + model + "\n perLloguar=" + perLloguar + " preuDia=" + preuDia + "\n";
    }

}
