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
import cat.iespaucasesnoves.boats.api.Boats;
import cat.iespaucasesnoves.boats.api.Model;
import cat.iespaucasesnoves.boats.api.Client;
import cat.iespaucasesnoves.boats.api.Vaixell;
import cat.iespaucasesnoves.boats.api.Document;
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
        Boats llamada = new Boats();
    }

    /*@Test
    public void afegirVaixeill() {
        Boats llamada = new Boats();
        Model model = new Model("1", "QuicSilver", "JK89", 3.3, 5.5, 6.5, 18999.99);
        Client propietari = new Client("Pepito", "Palotes", Document.DNI, "43186404T", "Carrer Vent", "971786858", "juas@gmail.com");
        Vaixell objecteVaixell = new Vaixell("X330", propietari, model, true);
        Vaixell esperat = objecteVaixell;
        llamada.afegirVaixell(objecteVaixell);
        if (llamada.getVaixells().containsValue(objecteVaixell)) {
            System.out.println("Lo contiene");
        } else {
            System.err.println("No lo contiene");
        }
    }

    @Test
    public void eliminarVaixell() {
        Boats llamada = new Boats();
        Model model = new Model("1", "QuicSilver", "JK89", 3.3, 5.5, 6.5, 18999.99);
        Client propietari = new Client("Pepito", "Palotes", Document.DNI, "43186404T", "Carrer Vent", "971786858", "juas@gmail.com");
        Vaixell objecteVaixell = new Vaixell("X330", propietari, model, true);
        Vaixell esperat = objecteVaixell;
        llamada.eliminarVaixell("X330");
        if (llamada.getVaixells().containsValue(objecteVaixell)) {
            System.out.println("No se ha eliminado");
        } else {
            System.out.println("Se ha eliminado");
        }
    }
*/    
    @Test
    public void llistarTipusEmbarcacio(){
        
    
}
}
