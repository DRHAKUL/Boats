/*

 * To change this license header, choose License Headers in Project Properties.

 * To change this template file, choose Tools | Templates

 * and open the template in the editor.

 */
package cat.iespaucasesnoves.boats.api;

import org.junit.After;

import org.junit.AfterClass;

import org.junit.Before;

import org.junit.BeforeClass;

import org.junit.Test;

import static org.junit.Assert.*;

import cat.iespaucasesnoves.boats.api.*;

import cat.iespaucasesnoves.boats.exepcions.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.Assert;

/**
 *
 *
 *
 * @author jorge
 *
 */
public class BoatsTest {

    public BoatsTest() {

    }

    @BeforeClass

    public static void setUpBeforeClass() {

    }

    @Test // comprobaremos que se añada correctamente un barco a la lista de barcos.

    public void afegirVaixeill() throws ModelException, PersonaException {

        Boats trucar = new Boats();

        Iot model = new Iot(3, 450, 45.5, true, "133", "Hoover", "XV78", 24.5, 50.6, 13.5, 45999.99);

        Client propietari = new Client("Pepito", "Palotes", Document.DNI, "43186404T", "CarrerVent", "971786858", "juas@gmail.com");

        Vaixell vaixell = new Vaixell("X330", propietari, model);

        trucar.afegirVaixell(vaixell);

        if (trucar.getVaixells().containsValue(vaixell)) {

            System.out.println("S'ha afegit.");

        } else {

            System.err.println("No s'ha afegit.");

        }

    }

    @Test // comprobaremos que se haya eliminado correctamente un barco de la lista

    public void eliminarVaixell() throws ModelException, PersonaException,
            DadesIncorrectesException {

        Boats trucar = new Boats();

        Iot model = new Iot(3, 450, 45.5, true, "133", "Hoover", "XV78", 24.5, 50.6, 13.5, 45999.99);

        Client propietari = new Client("Pepito", "Palotes", Document.DNI, "43186404T", "CarrerVent", "971786858", "juas@gmail.com");

        Vaixell vaixell = new Vaixell("X330", propietari, model);

        trucar.afegirVaixell(vaixell);

        trucar.eliminarVaixell("X330");

        if (trucar.getVaixells().containsValue(vaixell)) {

            System.out.println("No s'ha eliminat.");

        } else {

            System.out.println("S'ha eliminat.");

        }

    }

    @Test // comprobaremos que nos devuelva el barco que nosotros le pedimos.

    public void tornaVaixell() throws ModelException, ClientException, PersonaException,
            DadesIncorrectesException {

        Boats trucar = new Boats();

        Iot model = new Iot(3, 450, 45.5, true, "133", "Hoover", "XV78", 24.5, 50.6, 13.5, 45999.99);

        Client propietari = new Client("Pepito", "Palotes", Document.DNI, "43186404T", "CarrerVent", "971786858", "juas@gmail.com");

        Vaixell vaixell = new Vaixell("X330", propietari, model);

        trucar.afegirVaixell(vaixell);

        trucar.tornaVaixell("X330");

        if (trucar.tornaVaixell("X330").equals(vaixell)) {

            System.out.println("Es mostra correctament.");

        } else {

            System.out.println("No es mostra correctament.");

        }

    }

    @Test(expected = DadesIncorrectesException.class)

    public void eliminarVaixellException() throws ModelException,
            PersonaException, DadesIncorrectesException {

        Boats trucar = new Boats();

        Iot model = new Iot(3, 450, 45.5, true, "133", "Hoover", "XV78", 24.5, 50.6, 13.5, 45999.99);

        Client propietari = new Client("Pepito", "Palotes", Document.DNI, "43186404T", "CarrerVent", "971786858", "juas@gmail.com");

        Vaixell vaixell = new Vaixell("X330", propietari, model);

        trucar.afegirVaixell(vaixell);

        trucar.eliminarVaixell("MatriculaInexsistent");

    }

// Comprobam altres mètodes: Referent a Model:
    @Test

    public void afegirModelCataleg() throws ModelException {

        Boats trucar = new Boats();

        Iot model = new Iot(3, 450, 45.5, true, "133", "Hoover", "XV78", 24.5, 50.6, 13.5, 45999.99);

        trucar.afegirModelCataleg(model);

        if (trucar.getModelsCataleg().containsKey(model)) {

            System.out.println("S'ha afegit.");

        } else {

            System.out.println("No s'ha afegit.");

        }

    }

    @Test

    public void eliminarModelCataleg() throws ModelException, DadesIncorrectesException {

        Boats trucar = new Boats();

        Iot model = new Iot(3, 450, 45.5, true, "133", "Hoover", "XV78", 24.5, 50.6, 13.5, 45999.99);

        trucar.afegirModelCataleg(model);

        trucar.eliminarModelCataleg("133");

        if (trucar.getModelsCataleg().containsKey(model)) {

            System.out.println("No s'ha eliminat.");

        } else {

            System.err.println("s'ha eliminat");

        }

    }

    @Test

    public void tornaModelCataleg() throws ModelException, DadesIncorrectesException {

        Boats trucar = new Boats();

        Iot iot = new Iot(3, 450, 45.5, true, "133", "Hoover", "XV78", 24.5, 50.6, 13.5, 45999.99);

        trucar.afegirModelCataleg(iot);

        trucar.tornaModel("133");

        if (trucar.tornaModel("133").equals(iot)) {

            System.out.println("Es mostra correctament.");

        } else {

            System.out.println("No es mostra correctament.");

        }

    }

    @Test(expected = DadesIncorrectesException.class)

    public void eliminarModelCatalegException() throws ModelException,
            PersonaException, DadesIncorrectesException {

        Boats trucar = new Boats();

        Iot model = new Iot(3, 450, 45.5, true, "133", "Hoover", "XV78", 24.5, 50.6, 13.5, 45999.99);

        trucar.afegirModelCataleg(model);

        trucar.eliminarModelCataleg("referència inexistent");

    }

// Comprobam altres mètodes: Referent a Client:
    @Test

    public void afegirClient() throws ModelException, PersonaException {

        Boats trucar = new Boats();

        Client propietari = new Client("Pepito", "Palotes", Document.DNI, "43186404T", "CarrerVent", "971786858", "juas@gmail.com");

        trucar.afegirClient(propietari);

        if (trucar.getClients().containsKey(propietari)) {

            System.out.println("S'ha afegit.");

        } else {

            System.err.println("No s'ha afegit.");

        }

    }

    @Test

    public void eliminarClient() throws ModelException, PersonaException,
            DadesIncorrectesException {

        Boats trucar = new Boats();

        Client propietari = new Client("Pepito", "Palotes", Document.DNI, "43186404T", "CarrerVent", "971786858", "juas@gmail.com");

        trucar.afegirClient(propietari);

        trucar.eliminarClient("43186404T");

        if (trucar.getClients().containsKey(propietari)) {

            System.out.println("No s'ha eliminat.");

        } else {

            System.out.println("S'ha eliminat");

        }

    }

    @Test

    public void tornarClient() throws PersonaException, ClientException,
            DadesIncorrectesException {

        Boats trucar = new Boats();

        Client propietari = new Client("Pepito", "Palotes", Document.DNI, "43186404T", "CarrerVent", "971786858", "juas@gmail.com");

        trucar.afegirClient(propietari);

        trucar.tornaClient("43186404T");

        if (trucar.tornaClient("43186404T").equals(propietari)) {

            System.out.println("Es mostra correctament.");

        } else {

            System.out.println("No es mostra correctament.");

        }

    }

    @Test(expected = DadesIncorrectesException.class)

    public void eliminarClientException() throws ModelException,
            PersonaException, DadesIncorrectesException {

        Boats trucar = new Boats();

        Client propietari = new Client("Pepito", "Palotes", Document.DNI, "43186404T", "CarrerVent", "971786858", "juas@gmail.com");

        trucar.afegirClient(propietari);

        trucar.eliminarClient("Número de document inexistent");

    }

//Comprobam altres mètodes: Referent a Venedor:
    @Test

    public void afegirVenedor() throws DadesIncorrectesException, PersonaException,
            EmpleatException {

        Boats trucar = new Boats();

        java.util.Date data = new java.util.Date();

        Venedor empleat = new Venedor(3.5, "Antonio", "Machín", Document.NIE, "432898898",
                "Carrer Blanc", "971435261", "antonio@gmail.com", data, 1499.50);

        trucar.afegirVenedor(empleat);

        if (trucar.getLlistatVenedors().containsKey(empleat)) {

            System.out.println("S'ha afegit.");

        } else {

            System.out.println("No s'ha afegit.");

        }

    }

    @Test

    public void eliminarVenedor() throws DadesIncorrectesException, PersonaException,
            EmpleatException {

        Boats trucar = new Boats();

        java.util.Date data = new java.util.Date();

        Venedor empleat = new Venedor(3.5, "Antonio", "Machín", Document.NIE, "432898898",
                "Carrer Blanc", "971435261", "antonio@gmail.com", data, 1499.50);

        trucar.afegirVenedor(empleat);

        trucar.eliminarVenedor("432898898");

        if (trucar.getLlistatVenedors().containsKey(empleat)) {

            System.out.println("No s'ha eliminat.");

        } else {

            System.out.println("S'ha eliminat.");

        }

    }

    @Test

    public void tornarVenedor() throws DadesIncorrectesException, PersonaException,
            VenedorException, EmpleatException {

        Boats trucar = new Boats();

        java.util.Date data = new java.util.Date();

        Venedor empleat = new Venedor(3.5, "Antonio", "Machín", Document.NIE, "432898898",
                "Carrer Blanc", "971435261", "antonio@gmail.com", data, 1499.50);

        trucar.afegirVenedor(empleat);

        trucar.tornaVenedor("432898898");

        if (trucar.tornaVenedor("432898898").equals(empleat)) {

            System.out.println("Es mostra correctament.");

        } else {

            System.out.println("No es mostra correctament.");

        }

    }

    @Test(expected = DadesIncorrectesException.class)

    public void eliminarVenedorException() throws ModelException,
            PersonaException, DadesIncorrectesException {

        Boats trucar = new Boats();

        java.util.Date data = new java.util.Date();

        Venedor empleat = new Venedor(3.5, "Antonio", "Machín", Document.NIE, "432898898",
                "Carrer Blanc", "971435261", "antonio@gmail.com", data, 1499.50);

        trucar.afegirVenedor(empleat);

        trucar.eliminarVenedor("Número de document inexistent");

    }

// Comprobam altres mètodes: Referent a Lloguer:
    @Test

    public void afegirLloguer() throws ModelException, PersonaException, LloguerExeption {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Date d1;
        Date d2;
        try {
            d1 = sdf.parse("12/08/2016");
            d2 = sdf.parse("14/08/2016");
            Boats trucar = new Boats();

            java.util.Date dataInici = new java.util.Date();

            java.util.Date dataFi = new java.util.Date();

            Iot model = new Iot(3, 450, 45.5, true, "133", "Hoover", "XV78", 24.5, 50.6, 13.5, 45999.99);

            Client client = new Client("Pepito", "Palotes", Document.DNI, "43186404T", "Carrer Vent",
                    "971786858", "juas@gmail.com");

            Vaixell vaixell = new Vaixell("133", client, model);

            Lloguer lloguer = new Lloguer(d1, d2, client, vaixell, 349.90, Estat.TRAMITANT);

            trucar.afegirLloguer(lloguer);

            if (trucar.getLloguers().containsKey(lloguer.getId())) {

                System.out.println("S'ha afegit.");

            } else {

                System.out.println("No s'ha afegit.");

            }
        } catch (Exception ex) {
            System.out.println("Exepcio");
        }

    }

    @Test

    public void eliminarLloguer() throws ModelException, PersonaException, LloguerExeption,
            DadesIncorrectesException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Date d1;
        Date d2;
        try {
            d1 = sdf.parse("12/08/2016");
            d2 = sdf.parse("14/08/2016");
            Boats trucar = new Boats();

            java.util.Date dataInici = new java.util.Date();

            java.util.Date dataFi = new java.util.Date();

            Iot model = new Iot(3, 450, 45.5, true, "133", "Hoover", "XV78", 24.5, 50.6, 13.5, 45999.99);

            Client client = new Client("Pepito", "Palotes", Document.DNI, "43186404T", "Carrer Vent",
                    "971786858", "juas@gmail.com");

            Vaixell vaixell = new Vaixell("133", client, model);

            Lloguer lloguer = new Lloguer(d1, d2, client, vaixell, 349.90, Estat.TRAMITANT);

            trucar.afegirLloguer(lloguer);

            trucar.eliminarLloguer(lloguer.id);

            if (trucar.getLloguers().containsKey(lloguer.id)) {

                System.out.println("No s'ha eliminat.");

            } else {

                System.out.println("S'ha eliminat.");

            }
        } catch (Exception ex) {
            System.out.println("Bota excepcio");
        }

    }

    @Test

    public void afegirVenda() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Date d1;
        try {
            d1 = sdf.parse("12/08/2016");

            Boats trucar = new Boats();

            java.util.Date dataVenda = new java.util.Date();

            java.util.Date dataAlta = new java.util.Date();

            Iot model = new Iot(3, 450, 45.5, true, "133", "Hoover", "XV78", 24.5, 50.6, 13.5, 45999.99);

            Client comprador = new Client("Pepito", "Palotes", Document.DNI, "43186404T", "CarrerVent", "971786858", "juas@gmail.com");

            Vaixell vaixell = new Vaixell("X330", comprador, model);

            Venedor venedor = new Venedor(4.5, "Miguel", "Hernandez", Document.DNI, "43176453T",
                    "Avinguda Palou", "971546347", "miguel@gmail.com", dataAlta, 1358.37);

            Venda venda = new Venda(vaixell, d1, 45979.99, comprador, venedor,
                    Estat.TRAMITANT);

            trucar.afegirVenda(venda);

            if (trucar.getVendes().containsKey(venda)) {

                System.out.println("S'ha afegit.");

            } else {

                System.out.println("No s'ha afegit.");

            }
        } catch (Exception ex) {
            Logger.getLogger(BoatsTest.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Test

    public void eliminarVenda() throws ModelException, DadesIncorrectesException,
            VenedorException, PersonaException, VendaException {

        Boats trucar = new Boats();

        java.util.Date dataVenda = new java.util.Date();

        java.util.Date dataAlta = new java.util.Date();

        Iot model = new Iot(3, 450, 45.5, true, "133", "Hoover", "XV78", 24.5, 50.6, 13.5, 45999.99);

        Client comprador = new Client("Pepito", "Palotes", Document.DNI, "43186404T", "CarrerVent", "971786858", "juas@gmail.com");

        Vaixell vaixell = new Vaixell("143X", comprador, model);

        Venedor venedor = new Venedor(4.5, "Miguel", "Hernandez", Document.DNI, "43176453T",
                "Avinguda Palou", "971546347", "miguel@gmail.com", dataAlta, 1358.37);

        Venda venda = new Venda(vaixell, dataVenda, 45979.99, comprador, venedor, Estat.TRAMITANT);
        trucar.afegirVenda(venda);
        trucar.eliminarVenda(venda.id);

        if (trucar.getVendes().containsKey(venda)) {

            System.out.println("No s'ha eliminat.");

        } else {

            System.out.println("S'ha eliminat.");

        }

    }

    @Test

    public void afegirReparacio() throws ModelException, PersonaException, ReparacioException {

        Boats trucar = new Boats();

        java.util.Date dataInici = new java.util.Date();

        java.util.Date dataPrevFinal = new java.util.Date();

        Iot model = new Iot(3, 450, 45.5, true, "133", "Hoover", "XV78", 24.5, 50.6, 13.5, 45999.99);

        Client client = new Client("Pepito", "Palotes", Document.DNI, "43186404T", "Carrer Vent",
                "971786858", "juas@gmail.com");

        Vaixell vaixell = new Vaixell("X330", client, model);

        Reparacio reparacio = new Reparacio(client, vaixell, "Hangar 5", dataInici, dataPrevFinal,
                "Falla motor", 1499.99, Estat.FINALITZAT);

        trucar.afegirReparacio(reparacio);

        if (trucar.getReparacions().containsKey(reparacio)) {

            System.out.println("S'ha afegit.");

        } else {

            System.out.println("No s'ha afegit.");

        }

    }

    @Test

    public void eliminarReparacio() throws ModelException, PersonaException,
            ReparacioException, DadesIncorrectesException {

        Boats trucar = new Boats();

        java.util.Date dataInici = new java.util.Date();

        java.util.Date dataPrevFinal = new java.util.Date();

        Iot model = new Iot(3, 450, 45.5, true, "133", "Hoover", "XV78", 24.5, 50.6, 13.5, 45999.99);

        Client client = new Client("Pepito", "Palotes", Document.DNI, "43186404T", "Carrer Vent",
                "971786858", "juas@gmail.com");

        Vaixell vaixell = new Vaixell("X330", client, model);

        Reparacio reparacio = new Reparacio(client, vaixell, "Hangar 5", dataInici, dataPrevFinal,
                "Falla motor", 1499.99, Estat.FINALITZAT);
        trucar.afegirReparacio(reparacio);
        trucar.eliminarReparacio(reparacio.id);

        if (trucar.getReparacions().containsKey(reparacio)) {

            System.out.println("No s'ha eliminat.");

        } else {

            System.out.println("'ha eliminat.");

        }

    }

}
