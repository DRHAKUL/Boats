/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iespaucasesnoves.boats.api;

import java.util.ArrayList;
import cat.iespaucasesnoves.boats.api.Pagable;
import cat.iespaucasesnoves.boats.api.Targeta;
import cat.iespaucasesnoves.boats.exepcions.ClientException;
import cat.iespaucasesnoves.boats.exepcions.CompteException;
import java.util.HashMap;
import cat.iespaucasesnoves.boats.exepcions.PersonaException;
import cat.iespaucasesnoves.boats.exepcions.DadesIncorrectesException;
import cat.iespaucasesnoves.boats.exepcions.TargetaException;
import java.util.zip.DataFormatException;

/**
 *
 * @author jorge
 */
public class Client extends Persona {

    private ArrayList<Pagable> pagament;

    public Client(String nom, String cognom, Document tipusDocument, String numeroDocument, String adreca, String telefon, String correu) throws PersonaException, ClientException {
        super(nom, cognom, tipusDocument, adreca, telefon, correu, numeroDocument);
        pagament = new ArrayList<>();
        if (numeroDocument == null) {
            throw new ClientException();
        } else {
            this.numeroDocument = numeroDocument;
        }
    }

    public void crearPagamentTargeta(int numero, String caducitat, int verificacio) throws DadesIncorrectesException, DataFormatException, TargetaException {
        if (numero == 0) {
            throw new DadesIncorrectesException();
        } else {
            Targeta targeta = new Targeta(numero, caducitat, verificacio);
        pagament.add(targeta);
        }
        if (caducitat.matches("^[0-1]{1}[0-9]{1}/[0-2]{1}[0-9]{1}")) {
            Targeta targeta = new Targeta(numero, caducitat, verificacio);
        pagament.add(targeta);
        } else {
            throw new DataFormatException();
        }
        if (verificacio < 99 || verificacio > 999) {
            throw new DadesIncorrectesException();
        } else {
            Targeta targeta = new Targeta(numero, caducitat, verificacio);
        pagament.add(targeta);
        }
        

    }

    public void eliminarPagamentTargeta(int numero) throws DadesIncorrectesException {
        if (numero == 0) {
            throw new DadesIncorrectesException();
        } else {
            pagament.remove(numero);
            
        }
    }

    public ArrayList<Pagable> llistarPagament() {
        return pagament;
    }

    public void crearPagamentCompte(String iban) throws CompteException, DadesIncorrectesException {
        if (iban == null) {
            throw new DadesIncorrectesException();
        } else {
            Compte compte = new Compte(iban);
            pagament.add(compte);
        }
    }

    public void eliminarPagamentCompte(String iban) throws DadesIncorrectesException {
        if (iban == null) {
            throw new DadesIncorrectesException();
        } else {
            pagament.remove(iban);
        }
    }

    public ArrayList<Pagable> getPagament() {
        return pagament;
    }

}
