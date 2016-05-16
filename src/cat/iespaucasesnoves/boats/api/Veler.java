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
public class Veler extends Model{
    
    private int cascs;
    private int mastils;
    private int cabines;

    public Veler(int cascs, int mastils, int cabines, String referencia, String marca, String model, double manega, double eslora, double calat, double preu) {
        super(referencia, marca, model, manega, eslora, calat, preu);
        this.cascs = cascs;
        this.mastils = mastils;
        this.cabines = cabines;
    }

    public int getCascs() {
        return cascs;
    }

    public void setCascs(int cascs) {
        this.cascs = cascs;
    }

    public int getMastils() {
        return mastils;
    }

    public void setMastils(int mastils) {
        this.mastils = mastils;
    }

    public int getCabines() {
        return cabines;
    }

    public void setCabines(int cabines) {
        this.cabines = cabines;
    }
    
    public String tornarInformaciodetallada(){
        String json = "";
        
        
        return tornarInformacioGeneral() + json;
    }

    @Override
    public String toString() {
        return "Veler{" + "cascs=" + cascs + ", mastils=" + mastils + ", cabines=" + cabines + '}';
    }
    
    
    
}
