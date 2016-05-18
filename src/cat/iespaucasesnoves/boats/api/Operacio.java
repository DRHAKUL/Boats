/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iespaucasesnoves.boats.api;

/**
 *
 * @author DRAKUL
 */
public class Operacio {

    protected int id;
    protected Estat estat;
    private static int contador = 1;

    public Operacio(Estat estat) {
        this.estat = estat;
        id = contador;
        contador++;
    }

    public int getId() {
        return id;
    }

    public Estat getEstat() {
        return estat;
    }

    public void setEstat(Estat estat) {
        this.estat = estat;
    }

}