/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iespaucasesnoves.boats.api;

import java.util.ArrayList;
import cat.iespaucasesnoves.boats.api.Pagable;
import cat.iespaucasesnoves.boats.api.Targeta;
import java.util.HashMap;

/**
 *
 * @author jorge
 */
public class Client extends Persona {

    private ArrayList<Pagable> pagament;

    public Client(String nom, String cognom, Document tipusDocument, String numeroDocument, String adreca, String telefon, String correu) {
        super(nom, cognom, tipusDocument, adreca, telefon, correu, numeroDocument);
        pagament = new ArrayList<>();

    }

    public void crearPagamentTargeta(int numero, String caducitat, int verificacio) {
        Targeta targeta = new Targeta(numero, caducitat, verificacio);
        pagament.add(targeta);

    }

    public void eliminarPagamentTargeta(int numero) {
        pagament.remove(numero);

    }
    
    public ArrayList<Pagable> llistarPagament() {
        return pagament;
    }
    
    public void crearPagamentCompte(String iban) {
        Compte compte = new Compte(iban);
        pagament.add(compte);
    }

    public void eliminarPagamentCompte(String iban) {
        pagament.remove(iban);
    }

    public ArrayList<Pagable> getPagament() {
        return pagament;
    }

}
