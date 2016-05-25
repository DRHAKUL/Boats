package cat.iespaucasesnoves.boats.api;

import cat.iespaucasesnoves.boats.exepcions.DadesIncorrectesException;

/**
 *
 * @author DRAKUL
 */
public class Web {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Boats boatWeb = new Boats();
        try {
            String info = boatWeb.tornaModel("A28987").tornarInformacioGeneral();
            Iot iot1 = (Iot) boatWeb.tornaVaixell("ABC4570").getModel();
            String info2 = iot1.tornarInformaciodetallada();
        } catch (DadesIncorrectesException ex) {
            System.out.println("Dades incorrectes.");
        }
    }

}
