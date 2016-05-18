/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iespaucasesnoves.boats.api;
import cat.iespaucasesnoves.boats.exepcions.IotException;

/**
 *
 * @author Carlos
 */
public class Iot extends Model {

    private int camarots;
    private int potencia;
    private double autonomia;
    private boolean bodega;

    public Iot(int camarots, int potencia, double autonomia, boolean bodega, String referencia, String marca, String model, double manega, double eslora, double calat, double preu)throws IotException {
        super(referencia, marca, model, manega, eslora, calat, preu);
        if(camarots < 1 || camarots > 20){
            throw new IotException();
        }else if(potencia < 1 || potencia > 5000){
            throw new IotException();
        }else if(autonomia < 1 || autonomia > 2000){
            throw new IotException();
        }else if (bodega != true || bodega != false){
            throw new IotException();
        }
        this.camarots = camarots;
        this.potencia = potencia;
        this.autonomia = autonomia;
        this.bodega = bodega;
        this.tipus = "Iot";
    }

    public int getCamarots() {
        return camarots;
    }

    public void setCamarots(int camarots)throws IotException {
        if(camarots < 1 || camarots > 20){
            throw new IotException();
        }
        this.camarots = camarots;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia)throws IotException {
        if(potencia < 1 || potencia > 5000){
            throw new IotException();
        }
        this.potencia = potencia;
    }

    public double getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(double autonomia)throws IotException {
        if(autonomia < 1 || autonomia > 2000){
            throw new IotException();
        }
        this.autonomia = autonomia;
    }

    public boolean isBodega() {
        return bodega;
    }

    public void setBodega(boolean bodega)throws IotException {
        if (bodega != true || bodega != false){
            throw new IotException();
        }
        this.bodega = bodega;
    }

    public String tornarInformaciodetallada() {
        

        return "Model{" + "referencia=" + referencia + ", marca=" + marca + ", model=" + model + ", manega=" + manega + ", eslora=" + eslora + ", calat=" + calat + ", preu=" + preu +", camarots:"+camarots+", potencia:"+potencia+", autonomia:"+autonomia+", bodega:"+bodega+"}";
    }

    @Override
    public String toString() {
        return "Iot{" + "camarots=" + camarots + ", potencia=" + potencia + ", autonomia=" + autonomia + ", bodega=" + bodega + '}';
    }

}
