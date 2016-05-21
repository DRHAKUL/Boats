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
import java.util.HashMap;
import org.junit.Assert;

/**
 *
 * @author jorge
 */
public class BoatsTest {

    private HashMap<String, Vaixell> pruebaVaixells;

    public BoatsTest() {
    }

    @BeforeClass
    public static void setUpBeforeClass() {
        Boats trucar = new Boats();
    }
// Hacer los try y catch dentro de la propia clase.

    @Test
    public void afegirVaixeill() throws ModelException, PersonaException {
        Boats trucar = new Boats();
        Iot model = new Iot(3,450,45.5,true,"133","Hoover","XV78",24.5,50.6,13.5,45999.99);        
        Client propietari = new Client("Pepito", "Palotes", Document.DNI, "43186404T", "Carrer Vent", "971786858", "juas@gmail.com");
        Vaixell vaixell = new Vaixell("X330", propietari, model, true);
        Vaixell esperat = vaixell;
        trucar.afegirVaixell(vaixell);
        if (trucar.getVaixells().containsValue(vaixell)) {
            System.out.println("S'ha afegit.");
        } else {
            System.err.println("No s'ha afegit.");
        }
    }

    @Test
    public void eliminarVaixell() throws ModelException, PersonaException {
        Boats trucar = new Boats();
        Model model = new Model("1", "QuicSilver", "JK89", 3.3, 5.5, 6.5, 18999.99);
        Client propietari = new Client("Pepito", "Palotes", Document.DNI, "43186404T", "Carrer Vent", "971786858", "juas@gmail.com");
        Vaixell vaixell = new Vaixell("X330", propietari, model, true);
        Vaixell esperat = vaixell;
        trucar.eliminarVaixell("X330");
        if (trucar.getVaixells().containsValue(vaixell)) {
            System.out.println("No s'ha eliminat.");
        } else {
            System.out.println("S'ha eliminat.");
        }
    }

    
    @Test
    public void afegirModelCataleg() throws ModelException {
        Boats trucar = new Boats();
        Iot model = new Iot(3,450,45.5,true,"133","Hoover","XV78",24.5,50.6,13.5,45999.99);        
        trucar.afegirModelCataleg(model);
        if (trucar.getModelsCataleg().containsKey(model)) {
            System.out.println("S'ha afegit.");
        } else {
            System.out.println("No s'ha afegit.");
        }
    }

    @Test
    public void eliminarModelCataleg() throws ModelException {
        Boats trucar = new Boats();
        Iot model = new Iot(3,450,45.5,true,"133","Hoover","XV78",24.5,50.6,13.5,45999.99);        
        trucar.eliminarModelCataleg("133");
        if (trucar.getModelsCataleg().containsKey(model)) {
            System.out.println("No s'ha eliminat.");
        } else {
            System.err.println("s'ha eliminat");
        }
    }

    @Test
    public void afegirClient() throws ModelException, PersonaException {
        Boats trucar = new Boats();
        Iot model = new Iot(3,450,45.5,true,"133","Hoover","XV78",24.5,50.6,13.5,45999.99);        
        Client propietari = new Client("Pepito", "Palotes", Document.DNI, "43186404T", "Carrer Vent", "971786858", "juas@gmail.com");
        trucar.afegirClient(propietari);
        if (trucar.getClients().containsKey(propietari)) {
            System.out.println("S'ha afegit.");
        } else {
            System.err.println("No s'ha afegit.");
        }
    }

    @Test
    public void eliminarClient() throws ModelException, PersonaException {
        Boats trucar = new Boats();
        Iot model = new Iot(3,450,45.5,true,"133","Hoover","XV78",24.5,50.6,13.5,45999.99);        
        Client propietari = new Client("Pepito", "Palotes", Document.DNI, "43186404T", "Carrer Vent", "971786858", "juas@gmail.com");
        trucar.eliminarClient("43186404T");
        if (trucar.getClients().containsKey(propietari)) {
            System.out.println("No s'ha eliminat.");
        } else {
            System.out.println("S'ha eliminat");
        }
    }

    @Test
    public void afegirEmpleat() throws DadesIncorrectesException, PersonaException, EmpleatException {
        Boats trucar = new Boats();
        java.util.Date data = new java.util.Date();
        Venedor empleat = new Venedor(3.5,"Antonio", "Machín", Document.NIE, "432898898", "Carrer Blanc", "971435261", "antonio@gmail.com", data, 1499.50);
        trucar.afegirEmpleat(empleat);
        if (trucar.getEmpleats().containsKey(empleat)) {
            System.out.println("S'ha afegit.");
        } else {
            System.out.println("No s'ha afegit.");
        }
    }

    @Test
    public void eliminarEmpleat() throws DadesIncorrectesException, PersonaException, EmpleatException {
        Boats trucar = new Boats();
        java.util.Date data = new java.util.Date();
        Venedor empleat = new Venedor(3.5,"Antonio", "Machín", Document.NIE, "432898898", "Carrer Blanc", "971435261", "antonio@gmail.com", data, 1499.50);
        trucar.eliminarEmpleat("432898898");
        if (trucar.getEmpleats().containsKey(empleat)) {
            System.out.println("No s'ha eliminat.");
        } else {
            System.out.println("S'ha eliminat.");
        }
    }

    @Test
    public void afegirLloguer() throws ModelException, PersonaException, LloguerExeption {
        Boats trucar = new Boats();
        java.util.Date dataInici = new java.util.Date();
        java.util.Date dataFi = new java.util.Date();
        Iot model = new Iot(3,450,45.5,true,"133","Hoover","XV78",24.5,50.6,13.5,45999.99);        
        Client client = new Client("Pepito", "Palotes", Document.DNI, "43186404T", "Carrer Vent", "971786858", "juas@gmail.com");
        Vaixell vaixell = new Vaixell("X330", client, model, true);
        Lloguer lloguer = new Lloguer(dataInici, dataFi, client, vaixell, 349.90, Estat.TRAMITANT);
        trucar.afegirLloguer(lloguer);
        if (trucar.getLloguers().containsKey(lloguer)) {
            System.out.println("S'ha afegit.");
        } else {
            System.out.println("No s'ha afegit.");
        }
    }

    @Test
    public void eliminarLloguer() throws ModelException, PersonaException, LloguerExeption {
        Boats trucar = new Boats();
        java.util.Date dataInici = new java.util.Date();
        java.util.Date dataFi = new java.util.Date();
        Iot model = new Iot(3,450,45.5,true,"133","Hoover","XV78",24.5,50.6,13.5,45999.99);        
        Client client = new Client("Pepito", "Palotes", Document.DNI, "43186404T", "Carrer Vent", "971786858", "juas@gmail.com");
        Vaixell vaixell = new Vaixell("X330", client, model, true);
        Lloguer lloguer = new Lloguer(dataInici, dataFi, client, vaixell, 349.90, Estat.TRAMITANT);
        trucar.eliminarLloguer(1);
        if (trucar.getLloguers().containsKey(lloguer)) {
            System.out.println("No s'ha eliminat.");
        } else {
            System.out.println("S'ha eliminat.");
        }
    }

    @Test
    public void afegirVenda() throws ModelException, DadesIncorrectesException, VenedorException, PersonaException, VendaException {
        Boats trucar = new Boats();
        java.util.Date dataVenda = new java.util.Date();
        java.util.Date dataAlta = new java.util.Date();
        Iot model = new Iot(3,450,45.5,true,"133","Hoover","XV78",24.5,50.6,13.5,45999.99);        
        Client comprador = new Client("Pepito", "Palotes", Document.DNI, "43186404T", "Carrer Vent", "971786858", "juas@gmail.com");
        Vaixell vaixell = new Vaixell("X330", comprador, model, true);
        Venedor venedor = new Venedor(4.5, "Miguel", "Hernandez", Document.DNI, "43176453T", "Avinguda Palou", "971546347", "miguel@gmail.com", dataAlta, 1358.37);
        Venda venda = new Venda(vaixell, dataVenda, 45979.99, comprador, venedor, Estat.TRAMITANT);
        trucar.afegirVenda(venda);
        if (trucar.getVendes().containsKey(venda)) {
            System.out.println("S'ha afegit.");
        } else {
            System.out.println("No s'ha afegit.");
        }
    }

    @Test
    public void eliminarVenda() throws ModelException, DadesIncorrectesException, VenedorException, PersonaException, VendaException {
        Boats trucar = new Boats();
        java.util.Date dataVenda = new java.util.Date();
        java.util.Date dataAlta = new java.util.Date();
        Iot model = new Iot(3,450,45.5,true,"133","Hoover","XV78",24.5,50.6,13.5,45999.99);        
        Client comprador = new Client("Pepito", "Palotes", Document.DNI, "43186404T", "Carrer Vent", "971786858", "juas@gmail.com");
        Vaixell vaixell = new Vaixell("X330", comprador, model, true);
        Venedor venedor = new Venedor(4.5, "Miguel", "Hernandez", Document.DNI, "43176453T", "Avinguda Palou", "971546347", "miguel@gmail.com", dataAlta, 1358.37);
        Venda venda = new Venda(vaixell, dataVenda, 45979.99, comprador, venedor, Estat.TRAMITANT);
        trucar.eliminarVenda(1);
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
        Iot model = new Iot(3,450,45.5,true,"133","Hoover","XV78",24.5,50.6,13.5,45999.99);        
        Client client = new Client("Pepito", "Palotes", Document.DNI, "43186404T", "Carrer Vent", "971786858", "juas@gmail.com");
        Vaixell vaixell = new Vaixell("X330", client, model, true);
        Reparacio reparacio = new Reparacio(client, vaixell, "Hangar 5", dataInici, dataPrevFinal, "Falla motor", 1499.99, Estat.FINALITZAT);
        trucar.afegirReparacio(reparacio);
        if (trucar.getReparacions().containsKey(reparacio)) {
            System.out.println("S'ha afegit.");
        } else {
            System.out.println("No s'ha afegit.");
        }
    }

    @Test
    public void eliminarReparacio() throws ModelException, PersonaException, ReparacioException {
        Boats trucar = new Boats();
        java.util.Date dataInici = new java.util.Date();
        java.util.Date dataPrevFinal = new java.util.Date();
        Iot model = new Iot(3,450,45.5,true,"133","Hoover","XV78",24.5,50.6,13.5,45999.99);        
        Client client = new Client("Pepito", "Palotes", Document.DNI, "43186404T", "Carrer Vent", "971786858", "juas@gmail.com");
        Vaixell vaixell = new Vaixell("X330", client, model, true);
        Reparacio reparacio = new Reparacio(client, vaixell, "Hangar 5", dataInici, dataPrevFinal, "Falla motor", 1499.99, Estat.FINALITZAT);
        trucar.eliminarReparacio(1);
        if (trucar.getReparacions().containsKey(reparacio)) {
            System.out.println("No s'ha eliminat.");
        } else {
            System.out.println("'ha eliminat.");
        }
    }

}
