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
public class Iot extends Model {

    private int camarots;
    private int potencia;
    private double autonomia;
    private boolean bodega;

    public Iot(int camarots, int potencia, double autonomia, boolean bodega, String referencia, String marca, String model, double manega, double eslora, double calat, double preu) {
        super(referencia, marca, model, manega, eslora, calat, preu);
        this.camarots = camarots;
        this.potencia = potencia;
        this.autonomia = autonomia;
        this.bodega = bodega;
    }

    public int getCamarots() {
        return camarots;
    }

    public void setCamarots(int camarots) {
        this.camarots = camarots;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public double getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(double autonomia) {
        this.autonomia = autonomia;
    }

    public boolean isBodega() {
        return bodega;
    }

    public void setBodega(boolean bodega) {
        this.bodega = bodega;
    }

    public String tornarInformaciodetallada() {
        String json = "";

        return tornarInformacioGeneral() + json;
    }

    @Override
    public String toString() {
        return "Iot{" + "camarots=" + camarots + ", potencia=" + potencia + ", autonomia=" + autonomia + ", bodega=" + bodega + '}';
    }

}
