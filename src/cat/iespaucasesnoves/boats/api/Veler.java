package cat.iespaucasesnoves.boats.api;

import cat.iespaucasesnoves.boats.exepcions.ModelException;
import cat.iespaucasesnoves.boats.exepcions.VelerException;

/**
 *
 * @author Carlos
 */
public class Veler extends Model {

    private int cascs;
    private int mastils;
    private int cabines;

    public Veler(int cascs, int mastils, int cabines, String referencia, String marca, String model, double manega, double eslora, double calat, double preu) throws VelerException, ModelException {
        super(referencia, marca, model, manega, eslora, calat, preu);
        if (cascs < 1 || cascs > 3) {
            throw new VelerException();
        } else if (mastils < 1 || mastils > 5) {
            throw new VelerException();
        } else if (cabines < 1 || cabines > 5) {
            throw new VelerException();
        }
        this.cascs = cascs;
        this.mastils = mastils;
        this.cabines = cabines;
        this.tipus = "Veler";
    }

    public int getCascs() {
        return cascs;
    }

    public void setCascs(int cascs) throws VelerException {
        if (cascs < 1 || cascs > 3) {
            throw new VelerException();
        }
        this.cascs = cascs;
    }

    public int getMastils() {
        return mastils;
    }

    public void setMastils(int mastils) throws VelerException {
        if (mastils < 1 || mastils > 5) {
            throw new VelerException();
        }
        this.mastils = mastils;
    }

    public int getCabines() {
        return cabines;
    }

    public void setCabines(int cabines) throws VelerException {
        if (cabines < 1 || cabines > 5) {
            throw new VelerException();
        }
        this.cabines = cabines;
    }

    public String tornarInformaciodetallada() {

        return "Model{" + "referencia=" + referencia + ", marca=" + marca + ", model=" + model + ", manega=" + manega + ", eslora=" + eslora + ", calat=" + calat + ", preu=" + preu + ", cascs:" + cascs + ", mastils:" + mastils + ", cabines:" + cabines + "}";
    }

    @Override
    public String toString() {
        return "Veler{" + "cascs=" + cascs + ", mastils=" + mastils + ", cabines=" + cabines + '}';
    }

}
