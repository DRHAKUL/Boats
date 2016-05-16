package cat.iespaucasesnoves.boats.api;

public class Persona {

    protected String nom;
    protected String cognom;
    protected Document tipusDocument;
    protected String adreca;
    protected String telefon;
    protected String correu;

    public Persona(String nom, String cognom, Document tipusDocument, String adreca, String telefon, String correu) {
        this.nom = nom;
        this.cognom = cognom;
        this.tipusDocument = tipusDocument;
        this.adreca = adreca;
        this.telefon = telefon;
        this.correu = correu;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognom() {
        return cognom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    public Document getTipusDocument() {
        return tipusDocument;
    }

    public void setTipusDocument(Document tipusDocument) {
        this.tipusDocument = tipusDocument;
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

    public void setCorreu(String correu) {
        this.correu = correu;
    }

}
