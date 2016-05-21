package cat.iespaucasesnoves.boats.api;

import cat.iespaucasesnoves.boats.exepcions.DadesIncorrectesException;
import cat.iespaucasesnoves.boats.exepcions.TargetaException;
import java.util.zip.DataFormatException;

/**
 *
 * @author jorge
 */
public class Targeta implements Pagable {

    private int numero;
    private String caducitat;
    private int verificacio;

    public Targeta(int numero, String caducitat, int verificacio) throws TargetaException {
        this.numero = numero;
        this.caducitat = caducitat;
        this.verificacio = verificacio;
        if (numero == 0) {
            throw new TargetaException();
        } else {
            this.numero = numero;
        }
        if (caducitat == null) {
            throw new TargetaException();
        } else {
            this.caducitat = caducitat;
        }
        if (verificacio < 99 || verificacio > 999) {
            throw new TargetaException();
        } else {
            this.verificacio = verificacio;
        }
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

    public void setNumero(int numero) throws DadesIncorrectesException {
        this.numero = numero;
        if (numero == 0) {
            throw new DadesIncorrectesException();
        } else {
            this.numero = numero;
        }
    }

    public void setCaducitat(String caducitat) throws DataFormatException {
        if (caducitat.matches("^[0-1]{1}[0-9]{1}/[0-2]{1}[0-9]{1}")) {
            this.caducitat = caducitat;

        } else {
            throw new DataFormatException();
        }
    }

    public void setVerificacio(int verificacio) throws DadesIncorrectesException {
        this.verificacio = verificacio;
        if (verificacio < 99 || verificacio > 999) {
            throw new DadesIncorrectesException();
        } else {
            this.verificacio = verificacio;
        }
    }

}
