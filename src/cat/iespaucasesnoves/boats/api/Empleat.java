package cat.iespaucasesnoves.boats.api;

import cat.iespaucasesnoves.boats.exepcions.DadesIncorrectesException;
import cat.iespaucasesnoves.boats.exepcions.EmpleatException;
import cat.iespaucasesnoves.boats.exepcions.PersonaException;
import java.util.Date;

/**
 *
 * @author DRAKUL
 */
public abstract class Empleat extends Persona {

    protected Date dataAlta;
    protected double sou;

    public Empleat(String nom, String cognom, Document tipusDocument, String numeroDocument, String adreca, String telefon, String correu, Date dataAlta, Double sou) throws PersonaException, EmpleatException {
        super(nom, cognom, tipusDocument, adreca, telefon, correu, numeroDocument);
        if (dataAlta == null) {
            throw new EmpleatException();
        } else {
            this.dataAlta = dataAlta;
        }
        if (sou < 0) {
            throw new EmpleatException();

        } else {
            this.sou = sou;
        }
    }

    public Date getDataAlta() {
        return dataAlta;
    }

    public void setDataAlta(Date dataAlta) throws DadesIncorrectesException {
        if (dataAlta == null) {
            throw new DadesIncorrectesException();
        } else {
            this.dataAlta = dataAlta;
        }
    }

    public double getSou() {
        return sou;
    }

    public void setSou(double sou) {
        this.sou = sou;
    }

    public String generarNomina() {

        return null;
    }

}
