/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iespaucasesnoves.boats.api;

/**
 *
 * @author Carlos
 */
public class Motor extends Model {

    private int potencia;
    private double capDeposit;
    private boolean motAuxiliar;

    public Motor(int potencia, double capDeposit, boolean motAuxiliar, String referencia, String marca, String model, double manega, double eslora, double calat, double preu) {
        super(referencia, marca, model, manega, eslora, calat, preu);
        this.potencia = potencia;
        this.capDeposit = capDeposit;
        this.motAuxiliar = motAuxiliar;
        this.tipus = "Motor";
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public double getCapDeposit() {
        return capDeposit;
    }

    public void setCapDeposit(double capDeposit) {
        this.capDeposit = capDeposit;
    }

    public boolean isMotAuxiliar() {
        return motAuxiliar;
    }

    public void setMotAuxiliar(boolean motAuxiliar) {
        this.motAuxiliar = motAuxiliar;
    }

    public String tornarInformaciodetallada() {

        return "Model{" + "referencia=" + referencia + ", marca=" + marca + ", model=" + model + ", manega=" + manega + ", eslora=" + eslora + ", calat=" + calat + ", preu=" + preu+", potencia:"+potencia+",capDeposit:"+capDeposit+", motorAuxiliar:"+motAuxiliar+"}";
    }

    @Override
    public String toString() {
        return "Motor{" + "potencia=" + potencia + ", capDeposit=" + capDeposit + ", motAuxiliar=" + motAuxiliar + '}';
    }

}
