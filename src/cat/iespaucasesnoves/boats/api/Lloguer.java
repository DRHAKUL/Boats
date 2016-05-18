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
public class Lloguer extends Operacio {

    private boolean ambPatro;
    private Date iniciLloguer;
    private Date fiLloguer;
    private Client client;
    private Vaixell vaixell;
    private double preuDia;
    private Patro patro;

    public Lloguer(boolean ambPatro, Date iniciLloguer, Date fiLloguer, Client client, Vaixell vaixell, double preuDia, Patro patro, Estat estat) {
        super(estat);
        this.ambPatro = ambPatro;
        this.iniciLloguer = iniciLloguer;
        this.fiLloguer = fiLloguer;
        this.client = client;
        this.vaixell = vaixell;
        this.preuDia = preuDia;
        this.patro = patro;
    }

    public Lloguer(Date iniciLloguer, Date fiLloguer, Client client, Vaixell vaixell, double preuDia, Estat estat) {
        this(false, iniciLloguer, fiLloguer, client, vaixell, preuDia, null, estat);
    }

    public boolean isAmbPatro() {
        return ambPatro;
    }

    public Date getIniciLloguer() {
        return iniciLloguer;
    }

    public Date getFiLloguer() {
        return fiLloguer;
    }

    public Client getClient() {
        return client;
    }

    public Vaixell getVaixell() {
        return vaixell;
    }

    public double getPreuDia() {
        return preuDia;
    }

    public Patro getPatro() {
        return patro;
    }

    public void setIniciLloguer(Date iniciLloguer) {
        this.iniciLloguer = iniciLloguer;
    }

    public void setFiLloguer(Date fiLloguer) {
        this.fiLloguer = fiLloguer;
    }

    public void setPreuDia(double preuDia) {
        this.preuDia = preuDia;
    }

}
