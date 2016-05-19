package cat.iespaucasesnoves.boats.api;

import java.util.zip.DataFormatException;

/**
 *
 * @author jorge
 */
public class Targeta implements Pagable {

    private int numero;
    private String caducitat;
    private String verificacio;

    public Targeta(int numero, String caducitat, String verificacio) {
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

    public String getVerificacio() {
        return verificacio;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setCaducitat(String caducitat) {
        this.caducitat = caducitat;
    }

    public void setVerificacio(String verificacio) throws DataFormatException {
        if (verificacio.matches("^[0-3]{1}[0-9]{1}/[0-1]{1}[0-2]{1}")) {
            this.verificacio = verificacio;

        } else {
            throw new DataFormatException();
        }

        this.verificacio = verificacio;
    }

}
