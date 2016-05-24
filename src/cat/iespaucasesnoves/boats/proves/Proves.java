package cat.iespaucasesnoves.boats.proves;

import cat.iespaucasesnoves.boats.api.*;
import cat.iespaucasesnoves.boats.exepcions.*;
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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.DataFormatException;

/**
 *
 * @author DRAKUL
 */
public class Proves {

    Boats principal;

    public void inicialitzarBoats() {
        principal = new Boats();
        SimpleDateFormat plantilla = new SimpleDateFormat("dd-MM-yyyy");

        try {
            // --- Dates necesaries per la creacio d'objectes (patro,lloguer,venda,...)
            Date dataAlta1 = plantilla.parse("14-03-1973");
            Date dataAlta2 = plantilla.parse("14-04-1983");
            Date dataAlta3 = plantilla.parse("14-05-1999");
            Date dataAlta4 = plantilla.parse("14-06-1944");
            Date dataLloguer1Inici = plantilla.parse("14-06-2016");
            Date dataLloguer1Fi = plantilla.parse("15-06-2016");
            Date dataLloguer1Inici2 = plantilla.parse("14-06-2016");
            Date dataLloguer1Fi2 = plantilla.parse("15-06-2016");
            Date dataLloguer2 = plantilla.parse("20-06-2016");
            Date dataLloguer3 = plantilla.parse("14-08-2016");
            Date dataLloguer4 = plantilla.parse("19-08-2016");
            Date dataLloguerInici = plantilla.parse("14-05-2016");
            Date dataLloguerfi = plantilla.parse("17-05-2016");
            Date dataVenda1 = plantilla.parse("14-03-2015");
            Date dataIniciRep1 = plantilla.parse("03-14-2016");
            Date dataPrevFinal1 = plantilla.parse("03-20-2016");
            Date dataIniciRep2 = plantilla.parse("08-14-2015");
            Date dataPrevFinal2 = plantilla.parse("08-20-2015");

            // --- Venedors
            Venedor venedor1 = new Venedor(5.00, "Miquel", "Coll", Document.DNI, "11113199111", "C/rosa 2", "971111111", "coll@gmail.com", dataAlta1, 430.00);
            Venedor venedor2 = new Venedor(7.00, "Juan", "Perez", Document.PASSAPORT, "111117711111", "C/rosa 2", "971133111", "rosa@gmail.com", dataAlta2, 350.40);
            Venedor venedor3 = new Venedor(10.00, "Pere", "Villa", Document.NIE, "111131153311", "C/Agua 7", "9711133111", "villa@gmail.com", dataAlta3, 280.25);
            Venedor venedor4 = new Venedor(6.00, "Jordi", "Cardell", Document.DNI, "111311164411", "C/ Marga 2", "97112111", "cardell@gmail.com", dataAlta4, 310.00);
            principal.afegirVenedor(venedor1);
            principal.afegirVenedor(venedor2);
            principal.afegirVenedor(venedor3);
            principal.afegirVenedor(venedor4);

            // ---- Mecanics
            Mecanic mecanic1 = new Mecanic(Habilitat.FONTANERIA, "Maria", "Alvarez", Document.DNI, "16611441111", "C\\Rosal 4", "971212211", "alvarez@gmail.com", dataAlta3, 1700.00);
            Mecanic mecanic2 = new Mecanic(Habilitat.ELECTRICITAT, "Javier", "Lopez", Document.DNI, "16611441112", "C\\Marina 4", "971812211", "lopez@gmail.com", dataAlta3, 1120.00);
            Mecanic mecanic3 = new Mecanic(Habilitat.MECANICA, "Tomas", "Coll", Document.DNI, "16611441113", "C\\Mar 4", "971562211", "coll@gmail.com", dataAlta3, 1220.00);
            Mecanic mecanic4 = new Mecanic(Habilitat.VELES, "Jacobo", "Salva", Document.DNI, "16611441114", "C\\Marina 4", "971112211", "salva@gmail.com", dataAlta3, 1410.00);
            principal.afegirMecanic(mecanic1);
            principal.afegirMecanic(mecanic2);
            principal.afegirMecanic(mecanic3);
            principal.afegirMecanic(mecanic4);

            // -- Patrons
            Patro patro1 = new Patro("PER", 40.00, "John", "Smith", Document.DNI, "C\\Mayor 4", "9711212211", "coll@gmail.com", "111111441111", dataAlta3, 1.00);
            Patro patro2 = new Patro("Titulin", 43.50, "Maria", "Costa", Document.DNI, "C\\Arcora 77", "9731122141", "kaka@gmail.com", "112111441111", dataAlta3, 1.00);
            Patro patro3 = new Patro("PER", 36.00, "Juana", "Llull", Document.DNI, "C\\Costa 10", "973112211", "llull@gmail.com", "112111441111", dataAlta3, 1.00);
            Patro patro4 = new Patro("PER", 34.10, "Pep", "Zolla", Document.DNI, "C\\Uno 1", "9731122131", "adri@gmai.com", "112111441111", dataAlta3, 1.00);
            principal.afegirPatro(patro1);
            principal.afegirPatro(patro2);
            principal.afegirPatro(patro3);
            principal.afegirPatro(patro4);

            // -- Clients y pagaments
            Client empresa = new Client("Boats Inc", "Boats", Document.DNI, "42542323E", "Sol 45", "871949393", "Direccio@BoatsInc.com");
            Client client1 = new Client("Pablo", "Perez", Document.PASSAPORT, "143423423521", "Miro 23", "871334455", "perez@yahoo.com");
            Client client2 = new Client("Oscar", "Calafat", Document.DNI, "24423423521", "Del riu 56", "971335475", "cala@yahoo.com");
            Client client3 = new Client("Marcos", "Pons", Document.NIE, "34323423526", "Del pou 56", "971635475", "maso@yahoo.com");
            Client client4 = new Client("Teresa", "Pou", Document.DNI, "44423423521", "Del mar 6", "871335475", "pou@yahoo.com");
            client1.crearPagamentTargeta(1479454999, "05/16", 532);
            client1.crearPagamentCompte("ES34-542789-454322");
            client2.crearPagamentTargeta(1439454979, "05/16", 232);
            client3.crearPagamentCompte("ES34-142489-414722");
            client4.crearPagamentTargeta(1279454969, "05/16", 472);
            client4.crearPagamentCompte("ES34-942189-452392");
            principal.afegirClient(client1);
            principal.afegirClient(client2);
            principal.afegirClient(client3);
            principal.afegirClient(client4);

            // -- Models 
            Veler model1 = new Veler(2, 1, 1, "A28987", "Copino", "Super surf", 24, 12, 15, 235000);
            Iot model2 = new Iot(2, 200, 300, false, "B894487", "Altair", "2000", 26, 12, 16, 300000);
            Motor model3 = new Motor(170, 150, true, "C892987", "Ferretti", "J-123", 24, 15, 15, 400000);
            Veler model4 = new Veler(1, 3, 1, "D228987", "Rodman", "Barracuda", 23, 11, 25, 350000);
            principal.afegirModelCataleg(model1);
            principal.afegirModelCataleg(model2);
            principal.afegirModelCataleg(model3);
            principal.afegirModelCataleg(model4);

            //Vaixells
            Vaixell vaixell1 = new Vaixell("ABC4570", empresa, model1, 130);
            Vaixell vaixell2 = new Vaixell("ABC4571", client1, model1);
            Vaixell vaixell3 = new Vaixell("ABC4572", empresa, model3, 160);
            Vaixell vaixell4 = new Vaixell("ABC4573", empresa, model4, 140);
            Vaixell vaixell5 = new Vaixell("ABC4574", empresa, model2, 110);

            principal.afegirVaixell(vaixell1);
            principal.afegirVaixell(vaixell2);
            principal.afegirVaixell(vaixell3);
            principal.afegirVaixell(vaixell4);
            principal.afegirVaixell(vaixell5);

            // -- Lloguers
            Lloguer lloguer1 = new Lloguer(true, dataLloguer1Inici, dataLloguer1Fi, client1, vaixell1, 150, patro1, Estat.INICIAT);
            principal.afegirLloguer(lloguer1);

            // -- Vendes
            Venda venda1 = new Venda(principal.tornaVaixell("ABC4571"), dataVenda1, principal.tornaModel("A28987").getPreu(), principal.tornaClient("24423423521"), principal.tornaVenedor("111131153311"), Estat.INICIAT);
            Venda venda2 = new Venda(principal.tornaVaixell("ABC4571"), dataVenda1, principal.tornaModel("C892987").getPreu(), principal.tornaClient("34323423526"), principal.tornaVenedor("111131153311"), Estat.FINALITZAT);
            principal.afegirVenda(venda1);

            // ---Reparacions
            Reparacio reparacio1 = new Reparacio(client1, vaixell2, "Port de Soller", dataIniciRep1, dataPrevFinal1, "Motor no arranca", 1500, Estat.TRAMITANT);
            Reparacio reparacio2 = new Reparacio(client2, vaixell1, "Port d'Andratx", dataIniciRep2, dataPrevFinal2, "Fuga de combustible", 1500, Estat.FINALITZAT);
            principal.afegirReparacio(reparacio1);
            reparacio1.assignarMecanic(mecanic3);

            // guardam la inicialitzacio al fitxer i executam les gestions
            guardarFitxer();
            gestionarBoats();
        } catch (DadesIncorrectesException ex) {
            System.out.println("Dades incorrectes");
            ex.printStackTrace();
        } catch (EmpleatException ex) {
            System.out.println("Dades empleat incorrectes");
        } catch (PersonaException ex) {
            System.out.println("Dades persona incorrectes");
        } catch (VelerException ex) {
            System.out.println("Dades veler incorrectes");
        } catch (ModelException ex) {
            System.out.println("Dades model incorrectes");
        } catch (ParseException ex) {
            System.out.println("Format Data incorrecte");
        } catch (LloguerExeption ex) {
            System.out.println("Dades Lloguer incorrectes");
        } catch (VendaException ex) {
            System.out.println("Dades Venda incorrectes");
        } catch (ReparacioException ex) {
            System.out.println("Dades Reparacio incorrectes");
        } catch (DataFormatException ex) {
            System.out.println("Dades Data incorrectes");
        }

    }

    public void gestionarBoats() throws VendaException {

        /*
        try {
        //Tornam elements individuals
            //System.out.println(principal.tornaClient("24423423521"));
            //System.out.println(principal.tornaModel("A28987"));
            //System.out.println(principal.tornaModel("B894487"));
            //System.out.println(principal.tornaVaixell("ABC4570"));
                // Tornam operacions individuals(Lloguers,Vendes o reparacions) individuals
           //System.out.println(principal.tornaLloguer(1));
            //System.out.println(principal.tornaVenda(2));
            System.out.println(principal.tornaReparacio(3));
        } catch (DadesIncorrectesException ex) {
            System.out.println("Dades incorrectes");
        }
         */
        //Tornam llistes d'elements
        //System.out.println(principal.getClients());
        //System.out.println(principal.getLlistatMecanics());
        //System.out.println(principal.getLlistatVenedors()); 
        //System.out.println(principal.getLloguers());        
        //Metodes especifics de l'enunciat
        //System.out.println(principal.llistarModelsDisponibles());
        //System.out.println(principal.llistarPerTipusEmbarcacio("Veler"));
        //System.out.println(principal.llistarEmbarcacionsPreu(234000, 236000));
        /*
        //Probam el metode que torna les embarcacions lliures a unes determinades dates
        try{
        //generam les dates per fer la prova
        SimpleDateFormat plantilla = new SimpleDateFormat("dd-MM-yyyy");
        Date dataLloguerDessitjatInici = plantilla.parse("14-06-2016");
        Date dataLloguerDessitjatFi = plantilla.parse("15-06-2016");
        System.out.println(principal.tornarVaixellsLliures(dataLloguerDessitjatInici,dataLloguerDessitjatFi));
        } catch (ParseException ex) {
            System.out.println("error de parseig de data");
        }
         */
        //Probam el metode de setSouTotal() de venedor
//      
//        System.out.println(principal.tornaVenedor("111131153311").getLlistaVendes());
//        System.out.println(principal.tornaVenedor("111131153311").getSouTotal());
        // guardam tots els canvis
        //guardarFitxer();
    }

    public void guardarFitxer() {
        try (ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("./Boats.boa")))) {
            out.writeObject(principal);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void lletgirFitxer() {
        //si existeix un fitxer no s'executara el metode d'inicialitzacio i gestionarem les dades del fitxer directament
        try (ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream("./Boats.boa")))) {
            principal = (Boats) in.readObject();
            gestionarBoats();

        } catch (FileNotFoundException e) {
            //si no existeix el fitxer executarem la inicialitzacio
            inicialitzarBoats();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (VendaException ex) {
            System.out.println("Dades Venda incorrectes");

        }
    }

    /**
     * Comprova si tenim un fitxer dessat amb anterioritat i en cas de no
     * tenirlo s'inicialitzen els objectes per defecte. *
     */
    public static void main(String[] args) {
        Proves p = new Proves();
        //lectura de fitxer guardat
        //p.lletgirFitxer();
        p.inicialitzarBoats();
    }
}
