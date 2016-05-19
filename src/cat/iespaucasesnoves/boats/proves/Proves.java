/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iespaucasesnoves.boats.proves;

import cat.iespaucasesnoves.boats.api.Boats;
import cat.iespaucasesnoves.boats.api.Document;
import cat.iespaucasesnoves.boats.api.Empleat;
import cat.iespaucasesnoves.boats.api.Habilitat;
import cat.iespaucasesnoves.boats.api.Mecanic;
import cat.iespaucasesnoves.boats.api.Venedor;
import cat.iespaucasesnoves.boats.exepcions.DadesIncorrectesException;
import cat.iespaucasesnoves.boats.exepcions.EmpleatException;
import cat.iespaucasesnoves.boats.exepcions.PersonaException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Carlos
 */
public class Proves {

    Boats principal;
    Venedor venedor1;

    public void inicialitzarProves() {
        principal = new Boats();

        SimpleDateFormat plantilla = new SimpleDateFormat("mm-dd-yyyy");

        try {
            Date data1 = plantilla.parse("14-03-1973");
            Date data2 = plantilla.parse("14-04-1983");
            Date data3 = plantilla.parse("14-05-1999");
            Date data4 = plantilla.parse("14-06-1944");
            Date dataLloguer1 = plantilla.parse("14-06-2016");
            Date dataLloguer2 = plantilla.parse("20-06-2016");

            Venedor venedor1 = new Venedor(5, "Miquel", "Coll", Document.DNI, "C/rosa 2", "971111111", "coll@gmai.com", "111131111111", data1, 430.00);
            Venedor venedor2 = new Venedor(5, "Juan", "Perez", Document.PASSAPORT, "C/rosa 2", "971133111", "coll@gmai.com", "111111111111", data2, 350.40);
            Venedor venedor3 = new Venedor(5, "Pere", "Villa", Document.NIE, "C/Agua 7", "9711133111", "coll@gmai.com", "111131111111", data3, 280.25);
            Venedor venedor4 = new Venedor(5, "Jordi", "Cardell", Document.DNI, "C/ Marga 2", "97112111", "coll@gmai.com", "111311111111", data4, 310.00);

            Mecanic mecanic1 = new Mecanic(Habilitat.FONTANERIA, "Maria", "Alvarez", Document.DNI, "C\\Marina 4", "971112211", "coll@gmai.com", "111111441111", data3, 310.00);
            Mecanic mecanic2 = new Mecanic(Habilitat.ELECTRICITAT, "Javier", "Lopez", Document.DNI, "C\\Marina 4", "971112211", "coll@gmai.com", "111111441111", data3, 310.00);
            Mecanic mecanic3 = new Mecanic(Habilitat.MECANICA, "Tomas", "Coll", Document.DNI, "C\\Marina 4", "971112211", "coll@gmai.com", "111111441111", data3, 310.00);
            Mecanic mecanic4 = new Mecanic(Habilitat.VELES, "Jacobo", "Salva", Document.DNI, "C\\Marina 4", "971112211", "coll@gmai.com", "111111441111", data3, 310.00);

        } catch (DadesIncorrectesException ex) {
            System.out.println("Dades incorrectes");
        } catch (EmpleatException ex) {
            System.out.println("Dades constructor incorrectes");
        } catch (PersonaException ex) {
            System.out.println("Dades personals incorrectes");
        } catch (ParseException ex) {
            System.out.println("Format Data incorrecte");

        }

    }

    public void crearFitxer() {

    }

    public static void main(String[] args) {
        // TODO code application logic here
    }

}
