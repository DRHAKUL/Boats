/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iespaucasesnoves.boats.api;

import java.util.Date;

/**
 *
 * @author DRAKUL
 */
public class Venda extends Operacio {

    private Vaixell vaixell;
    private Date dataVenda;
    private double preu;
    private Client comprador;
    private Venedor venedor;

    public Venda(Vaixell vaixell, Date dataVenda, double preu, Client comprador, Venedor venedor, Estat estat) {
        super(estat);
        this.vaixell = vaixell;
        this.dataVenda = dataVenda;
        this.preu = preu;
        this.comprador = comprador;
        this.venedor = venedor;
    }

    public Vaixell getVaixell() {
        return vaixell;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public double getPreu() {
        return preu;
    }

    public Client getComprador() {
        return comprador;
    }

    public Venedor getVenedor() {
        return venedor;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }

}
