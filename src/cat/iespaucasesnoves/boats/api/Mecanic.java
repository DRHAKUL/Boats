package cat.iespaucasesnoves.boats.api;

import cat.iespaucasesnoves.boats.exepcions.DadesIncorrectesException;
import cat.iespaucasesnoves.boats.exepcions.EmpleatException;
import cat.iespaucasesnoves.boats.exepcions.PersonaException;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author DRAKUL
 */
public class Mecanic extends Empleat {

    private final ArrayList<Habilitat> habilitat;

    public Mecanic(Habilitat habilitat, String nom, String cognom, Document tipusDocument, String numeroDocument, String adreca, String telefon, String correu, Date dataAlta, Double sou) throws DadesIncorrectesException, PersonaException, EmpleatException {
        super(nom, cognom, tipusDocument, numeroDocument, adreca, telefon, correu, dataAlta, sou);
        this.habilitat = new ArrayList<>();
        this.habilitat.add(habilitat);

    }

    public void afegirHabilitat(Habilitat h) throws DadesIncorrectesException {
        if (habilitat.lastIndexOf(h) != -1) {
            throw new DadesIncorrectesException();
        } else {
            habilitat.add(h);
        }
    }

    public void borrarHabilitat(Habilitat h) throws DadesIncorrectesException {
        habilitat.remove(h);
        if (habilitat.remove(h) == false) {
            throw new DadesIncorrectesException();
        }
    }

    public ArrayList tornarHabilitats() {
        return habilitat;
    }

      

    @Override
    public String generarNomina() {
        return "{nom:" + nom + ",cognom:" + cognom + ",tipusDocument:" + tipusDocument + ",numeroDocument:" + numeroDocument + ",adreca:" + adreca + ",telefon:" + telefon + ",correu:" + correu + ",dataAlta:" + dataAlta + ",sou:" + sou + "}";
    }

}
