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
public class Model {
    
    protected String referencia;
    protected String marca;
    protected String model;
    protected double manega;
    protected double eslora;
    protected double calat;
    protected double preu;
    
    public Model (String referencia,String marca,String model,double manega,double eslora,double calat,double preu){
        this.referencia = referencia;
        this.marca = marca;
        this.model = model;
        this.manega = manega;
        this.eslora = eslora;
        this.calat = calat;
        this.preu = preu;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getManega() {
        return manega;
    }

    public void setManega(double manega) {
        this.manega = manega;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public double getCalat() {
        return calat;
    }

    public void setCalat(double calat) {
        this.calat = calat;
    }

    public double getPreu() {
        return preu;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }
    
    public String tornarInformacioGeneral(){
        String json = "";
        
        
        return json;
    }

    @Override
    public String toString() {
        return "Model{" + "referencia=" + referencia + ", marca=" + marca + ", model=" + model + ", manega=" + manega + ", eslora=" + eslora + ", calat=" + calat + ", preu=" + preu + '}';
    }
    
}
