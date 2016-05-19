package cat.iespaucasesnoves.boats.api;

/**
 *
 * @author jorge
 */
public class Targeta implements Pagable {

    private int numero;
    private String caducitat;
    private int verificacio;

    public Targeta(int numero, String caducitat, int verificacio) {
        this.numero = numero;
        this.caducitat = caducitat;
        this.verificacio = verificacio;
    }

    public int getNumero() {
        return numero;
    }

    public String getCaducitat() {
        return caducitat;
    }

    public int getVerificacio() {
        return verificacio;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setCaducitat(String caducitat) {
        this.caducitat = caducitat;
    }

    public void setVerificacio(int verificacio) {
        this.verificacio = verificacio;
    }

}
