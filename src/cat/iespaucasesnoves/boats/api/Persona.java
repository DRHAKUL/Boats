package cat.iespaucasesnoves.boats.api;

import cat.iespaucasesnoves.boats.exepcions.DadesIncorrectesException;
import cat.iespaucasesnoves.boats.exepcions.PersonaException;
import java.io.Serializable;

public abstract class Persona implements Serializable {

    protected String nom;
    protected String cognom;
    protected Document tipusDocument;
    protected String numeroDocument;
    protected String adreca;
    protected String telefon;
    protected String correu;

    public Persona(String nom, String cognom, Document tipusDocument, String adreca, String telefon, String correu, String numeroDocument) throws PersonaException {
        if ("".equals(nom)) {
            throw new PersonaException();
        } else {
            this.nom = nom;
        }
        if ("".equals(cognom)) {
            throw new PersonaException();
        } else {
            this.cognom = cognom;
        }
        this.tipusDocument = tipusDocument;
        this.adreca = adreca;
        this.telefon = telefon;
        if ("".equals(numeroDocument)) {
            throw new PersonaException();
        } else {
            this.numeroDocument = numeroDocument;
        }
        if (!correu.equals("")) {
            //correu.matches("^[_a-z0-9-]+(\\.[_a-z0-9-]+)*@[a-z0-9-]+(\\.[a-z0-9-]+)*(\\.[a-z]{2,3})$")) {
            this.correu = correu;
        } else {
            throw new PersonaException();
        }
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) throws DadesIncorrectesException {
        if ("".equals(nom)) {
            throw new DadesIncorrectesException();
        } else {
            this.nom = nom;
        }
    }

    public String getCognom() {
        return cognom;
    }

    public void setCognom(String cognom) throws DadesIncorrectesException {
        if ("".equals(cognom)) {
            throw new DadesIncorrectesException();
        } else {
            this.cognom = cognom;
        }
    }

    public Document getTipusDocument() {
        return tipusDocument;
    }

    public void setTipusDocument(Document tipusDocument) {
        this.tipusDocument = tipusDocument;
    }

    public String getNumeroDocument() {
        return numeroDocument;
    }

    public String getAdreca() {
        return adreca;
    }

    public void setAdreca(String adreca) {
        this.adreca = adreca;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getCorreu() {
        return correu;
    }

    public void setCorreu(String correu) throws DadesIncorrectesException {
        if (correu.matches("^[_A-Za-z0-9-\\\\+]+(\\\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\\\.[A-Za-z0-9]+)*(\\\\.[A-Za-z]{2,})$;")) {
            this.correu = correu;
        } else {
            throw new DadesIncorrectesException();
        }
    }

    public void setNumeroDocument(String numeroDocument) throws DadesIncorrectesException {
        if ("".equals(numeroDocument)) {
            throw new DadesIncorrectesException();
        } else {
            this.numeroDocument = numeroDocument;
        }
    }

}
