/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iespaucasesnoves.boats.api;

import cat.iespaucasesnoves.boats.api.Persona;

/**
 *
 * @author DRAKUL
 */
public class Empleat extends Persona {

    public Empleat(String nom, String cognom, Document tipusDocument, String adreca, String telefon, String correu) {
        super(nom, cognom, tipusDocument, adreca, telefon, correu);
    }

}
