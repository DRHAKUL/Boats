package cat.iespaucasesnoves.boats.api;

import cat.iespaucasesnoves.boats.exepcions.ModelException;
import cat.iespaucasesnoves.boats.exepcions.MotorException;

/**
 *
 * @author Carlos
 */
public class Motor extends Model {

    private int potencia;
    private double capDeposit;
    private boolean motAuxiliar;

    public Motor(int potencia, double capDeposit, boolean motAuxiliar, String referencia, String marca, String model, double manega, double eslora, double calat, double preu) throws MotorException, ModelException {
        super(referencia, marca, model, manega, eslora, calat, preu);
        if (potencia < 1 || potencia > 2000) {
            throw new MotorException();
        } else if (capDeposit < 1 || capDeposit > 10000) {
            throw new MotorException();
        } else if (motAuxiliar != true || motAuxiliar != false) {
            throw new MotorException();
        }
        this.potencia = potencia;
        this.capDeposit = capDeposit;
        this.motAuxiliar = motAuxiliar;
        this.tipus = "Motor";
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) throws MotorException {
        if (potencia < 1 || potencia > 2000) {
            throw new MotorException();
        }
        this.potencia = potencia;
    }

    public double getCapDeposit() {
        return capDeposit;
    }

    public void setCapDeposit(double capDeposit) throws MotorException {
        if (capDeposit < 1 || capDeposit > 10000) {
            throw new MotorException();
        }
        this.capDeposit = capDeposit;
    }

    public boolean isMotAuxiliar() {
        return motAuxiliar;
    }

    public void setMotAuxiliar(boolean motAuxiliar) throws MotorException {
        if (motAuxiliar != true || motAuxiliar != false) {
            throw new MotorException();
        }
        this.motAuxiliar = motAuxiliar;
    }

    public String tornarInformaciodetallada() {

        return "Model{" + "referencia=" + referencia + ", marca=" + marca + ", model=" + model + ", manega=" + manega + ", eslora=" + eslora + ", calat=" + calat + ", preu=" + preu + ", potencia:" + potencia + ",capDeposit:" + capDeposit + ", motorAuxiliar:" + motAuxiliar + "}";
    }

    @Override
    public String toString() {
        return "Motor{" + "potencia=" + potencia + ", capDeposit=" + capDeposit + ", motAuxiliar=" + motAuxiliar + '}';
    }

}
