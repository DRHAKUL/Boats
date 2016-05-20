package cat.iespaucasesnoves.boats.proves;

import cat.iespaucasesnoves.boats.api.Boats;
import cat.iespaucasesnoves.boats.api.Client;
import cat.iespaucasesnoves.boats.api.Document;
import cat.iespaucasesnoves.boats.api.Estat;
import cat.iespaucasesnoves.boats.api.Habilitat;
import cat.iespaucasesnoves.boats.api.Lloguer;
import cat.iespaucasesnoves.boats.api.Mecanic;
import cat.iespaucasesnoves.boats.api.Patro;
import cat.iespaucasesnoves.boats.api.Vaixell;
import cat.iespaucasesnoves.boats.api.Veler;
import cat.iespaucasesnoves.boats.api.Venda;
import cat.iespaucasesnoves.boats.api.Venedor;
import cat.iespaucasesnoves.boats.exepcions.DadesIncorrectesException;
import cat.iespaucasesnoves.boats.exepcions.EmpleatException;
import cat.iespaucasesnoves.boats.exepcions.LloguerExeption;
import cat.iespaucasesnoves.boats.exepcions.ModelException;
import cat.iespaucasesnoves.boats.exepcions.PersonaException;
import cat.iespaucasesnoves.boats.exepcions.VelerException;
import cat.iespaucasesnoves.boats.exepcions.VendaException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DRAKUL
 */
public class Proves {

    Boats principal;

    public void inicialitzarBoats() {
        principal = new Boats();
        SimpleDateFormat plantilla = new SimpleDateFormat("mm-dd-yyyy");

        try {
            Date data1 = plantilla.parse("14-03-1973");
            Date data2 = plantilla.parse("14-04-1983");
            Date data3 = plantilla.parse("14-05-1999");
            Date data4 = plantilla.parse("14-06-1944");
            Date dataLloguer1 = plantilla.parse("14-06-2016");
            Date dataLloguer2 = plantilla.parse("20-06-2016");
            Date dataLloguer3 = plantilla.parse("14-08-2016");
            Date dataLloguer4 = plantilla.parse("19-08-2016");

            // --- Venedors
            Venedor venedor1 = new Venedor(5.00, "Miquel", "Coll", Document.DNI, "11113199111", "C/rosa 2", "971111111", "coll@gmail.com", data1, 430.00);
            Venedor venedor2 = new Venedor(7.00, "Juan", "Perez", Document.PASSAPORT, "111117711111", "C/rosa 2", "971133111", "rosa@gmail.com", data2, 350.40);
            Venedor venedor3 = new Venedor(10.00, "Pere", "Villa", Document.NIE, "111131153311", "C/Agua 7", "9711133111", "villa@gmail.com", data3, 280.25);
            Venedor venedor4 = new Venedor(6.00, "Jordi", "Cardell", Document.DNI, "111311164411", "C/ Marga 2", "97112111", "cardell@gmail.com", data4, 310.00);
            principal.afegirVenedor(venedor1);
            principal.afegirVenedor(venedor2);
            principal.afegirVenedor(venedor3);
            principal.afegirVenedor(venedor4);

            // ---- Mecanics
            Mecanic mecanic1 = new Mecanic(Habilitat.FONTANERIA, "Maria", "Alvarez", Document.DNI, "C\\Rosal 4", "971212211", "alvarez@gmail.com", "16611441111", data3, 1700.00);
            Mecanic mecanic2 = new Mecanic(Habilitat.ELECTRICITAT, "Javier", "Lopez", Document.DNI, "C\\Marina 4", "971812211", "lopez@gmail.com", "11611441111", data3, 1120.00);
            Mecanic mecanic3 = new Mecanic(Habilitat.MECANICA, "Tomas", "Coll", Document.DNI, "C\\Mar 4", "971562211", "coll@gmail.com", "116611441111", data3, 1220.00);
            Mecanic mecanic4 = new Mecanic(Habilitat.VELES, "Jacobo", "Salva", Document.DNI, "C\\Marina 4", "971112211", "salva@gmail.com", "116611441611", data3, 1410.00);
            principal.afegirMecanic(mecanic1);
            principal.afegirMecanic(mecanic2);
            principal.afegirMecanic(mecanic3);
            principal.afegirMecanic(mecanic4);

            // -- Patrons
            Patro patro1 = new Patro("PER", 40.00, "John", "Smith", Document.DNI, "C\\Mayor 4", "9711212211", "coll@gmail.com", "111111441111", data3, 1.00);
            Patro patro2 = new Patro("Titulin", 43.50, "Maria", "Costa", Document.DNI, "C\\Arcora 77", "9731122141", "kaka@gmail.com", "112111441111", data3, 1.00);
            Patro patro3 = new Patro("PER", 36.00, "Juana", "Llull", Document.DNI, "C\\Costa 10", "973112211", "llull@gmail.com", "112111441111", data3, 1.00);
            Patro patro4 = new Patro("PER", 34.10, "Pep", "Zolla", Document.DNI, "C\\Uno 1", "9731122131", "adri@gmai.com", "112111441111", data3, 1.00);
            principal.afegirPatro(patro1);
            principal.afegirPatro(patro2);
            principal.afegirPatro(patro3);
            principal.afegirPatro(patro4);

            // -- Clients
            Client client1 = new Client("Pablo", "Perez", Document.PASSAPORT, "143423423521", "Miro 23", "871334455", "perez@yahoo.com");
            Client client2 = new Client("Oscar", "Calafat", Document.DNI, "24423423521", "Del riu 56", "971335475", "cala@yahoo.com");
            Client client3 = new Client("Marcos", "Pons", Document.NIE, "34323423526", "Del pou 56", "971635475", "maso@yahoo.com");
            Client client4 = new Client("Teresa", "Pou", Document.DNI, "44423423521", "Del mar 6", "871335475", "pou@yahoo.com");
            principal.afegirClient(client1);
            principal.afegirClient(client2);
            principal.afegirClient(client3);
            principal.afegirClient(client4);

            // -- Models 
            Veler veler1 = new Veler(2, 1, 1, "A28987", "Copino", "Super surf", 24, 12, 15, 235000);
            Veler veler2 = new Veler(1, 2, 3, "B894487", "Altair", "2000", 26, 12, 16, 300000);
            Veler veler3 = new Veler(2, 1, 2, "C892987", "Ferretti", "J-123", 24, 15, 15, 400000);
            Veler veler4 = new Veler(1, 3, 1, "D228987", "Rodman", "Barracuda", 23, 11, 25, 350000);
            principal.afegirModelCataleg(veler1);

            crearFitxer();
            gestionarBoats();
        } catch (DadesIncorrectesException ex) {
            System.out.println("Dades incorrectes");
        } catch (EmpleatException ex) {
            System.out.println("Dades empleat incorrectes");
        } catch (PersonaException ex) {
            ex.printStackTrace();
            System.out.println("Dades persona incorrectes");
        } catch (VelerException ex) {
            System.out.println("Dades veler incorrectes");
        } catch (ModelException ex) {
            System.out.println("Dades model incorrectes");
        }/* catch (LloguerExeption ex) {
            System.out.println("Dades lloguer incorrectes");
            ex.printStackTrace();

        } catch (VendaException ex) {
            System.out.println("Dades venda incorrectes");
        } */ catch (ParseException ex) {
            System.out.println("Format Data incorrecte");

        }

    }

    public void gestionarBoats() {
        try {
            principal = lletgirFitxer();
            // -- Vaixells obtenint els objectes del seu respectiu llistat
            Vaixell vaixell1 = new Vaixell("14345-B", principal.tornaClient("143423423521"), principal.tornaModel("A898987"), true, 150.00);
            principal.afegirVaixell(vaixell1);
            principal.tornaVaixell("14345-B");
        } catch (DadesIncorrectesException ex) {
            System.err.println("Dades incorrectes");
        }
    }

    public void crearFitxer() {
        try (ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("Boats.boa")))) {
            out.writeObject(principal);
        } catch (FileNotFoundException e) {
            System.out.println("No es troba l'arxiu");
        } catch (IOException e) {
            System.out.println("Error d'entrada o sortida de dades");
        }
    }

    public Boats lletgirFitxer() {
        Boats dessat;
        try (ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream("Boats.boa")))) {
            dessat = (Boats) in.readObject();
            return dessat;
        } catch (FileNotFoundException e) {
            System.out.println("No es troba l'arxiu");
        } catch (IOException e) {
            System.out.println("Error d'entrada o sortida de dades");
        } catch (ClassNotFoundException e) {
            System.out.println("No es troba la classe");
        }
        return null;
    }

    public static void main(String[] args) {
        Proves p = new Proves();
        //if(p.lletgirFitxer()== null){
        p.inicialitzarBoats();
        //}else{
        //p.gestionarBoats();
        //}    
    }
}
