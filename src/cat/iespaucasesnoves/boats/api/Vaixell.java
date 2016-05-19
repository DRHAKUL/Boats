package cat.iespaucasesnoves.boats.api;

/**
 *
 * @author Carlos
 */
public class Vaixell {

    private String matricula;
    private final Client propietari;
    private final Model model;
    private boolean perLloguar;
    private double preuDia;

    public Vaixell(String matricula, Client propietari, Model model, boolean perLloguar) {
        this.matricula = matricula;
        this.propietari = propietari;
        this.model = model;
        this.perLloguar = perLloguar;
        this.preuDia = 0;
    }

    public Vaixell(String matricula, Client propietari, Model model, boolean perLloguar, double preuDia) {
        this.matricula = matricula;
        this.propietari = propietari;
        this.model = model;
        this.perLloguar = perLloguar;
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

}
