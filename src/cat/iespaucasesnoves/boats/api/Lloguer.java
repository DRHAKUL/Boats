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
    private Client client;
    private Vaixell vaixell;
    private double preuDia;
    private Patro patro;

    public Lloguer(boolean ambPatro, Date iniciLloguer, Client client, Vaixell vaixell, double preuDia, Patro patro, Estat estat) {
        super(estat);
        this.ambPatro = ambPatro;
        this.iniciLloguer = iniciLloguer;
        this.client = client;
        this.vaixell = vaixell;
        this.preuDia = preuDia;
        this.patro = patro;
    }

    public Lloguer(Date iniciLloguer, Client client, Vaixell vaixell, double preuDia, Estat estat) {
        this(false, iniciLloguer, client, vaixell, preuDia, null, estat);
    }

}
