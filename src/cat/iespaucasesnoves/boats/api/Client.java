/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iespaucasesnoves.boats.api;

import java.util.ArrayList;

/**
 *
 * @author jorge
 */
public class Client extends Persona {

    private ArrayList<Pagable> pagament;

    public Client() {
        pagament = new ArrayList<>();
    }

    public void crearPagamentTargeta(int numero, String caducitat, int verificacio) {

    }

    public void eliminarPagamentTargeta(int numero) {

    }

    public void crearPagamentcompte(String iban) {

    }

    public void eliminarPagamentCompte(String iban) {

    }

    public ArrayList<Pagable> getPagament() {
        return pagament;
    }

}
