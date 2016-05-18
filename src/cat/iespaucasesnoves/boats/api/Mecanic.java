/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iespaucasesnoves.boats.api;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author DRAKUL
 */
public class Mecanic extends Empleat {

    private ArrayList<Habilitat> habilitat;

    public Mecanic(Habilitat habilitat, String nom, String cognom, Document tipusDocument, String numeroDocument, String adreca, String telefon, String correu, Date dataAlta, Double sou) {
        super(nom, cognom, tipusDocument, numeroDocument, adreca, telefon, correu, dataAlta, sou);
        this.habilitat = new ArrayList<>();
        this.habilitat.add(habilitat);

    }

    public void afegirHabilitat(Habilitat h) {
        habilitat.add(h);
    }

    public void borrarHabilitat(Habilitat h) {
        habilitat.remove(h);
    }

    public ArrayList tornarHabilitats() {
        return habilitat;
    }

}
