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

    }

    @Test // comprobaremos que se añada correctamente un barco a la lista de barcos.
    public void afegirVaixeill() throws ModelException, PersonaException {
        Boats trucar = new Boats();
        Iot model = new Iot(3, 450, 45.5, true, "133", "Hoover", "XV78", 24.5, 50.6, 13.5, 45999.99);
        Client propietari = new Client("Pepito", "Palotes", Document.DNI, "43186404T", "Carrer Vent", "971786858", "juas@gmail.com");
        Vaixell vaixell = new Vaixell("X330", propietari, model);
        trucar.afegirVaixell(vaixell);

        if (trucar.getVaixells().containsValue(vaixell)) {
            System.out.println("S'ha afegit.");
        } else {
            System.err.println("No s'ha afegit.");
        }
    }

    @Test // comprobaremos que se haya eliminado correctamente un barco de la lista
    public void eliminarVaixell() throws ModelException, PersonaException, DadesIncorrectesException {
        Boats trucar = new Boats();
        Iot model = new Iot(3, 450, 45.5, true, "133", "Hoover", "XV78", 24.5, 50.6, 13.5, 45999.99);
        Client propietari = new Client("Pepito", "Palotes", Document.DNI, "43186404T", "Carrer Vent", "971786858", "juas@gmail.com");
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
    public void tornaVaixell() throws ModelException, ClientException, PersonaException, DadesIncorrectesException {
        Boats trucar = new Boats();
        Iot model = new Iot(3, 450, 45.5, true, "133", "Hoover", "XV78", 24.5, 50.6, 13.5, 45999.99);
        Client propietari = new Client("Pepito", "Palotes", Document.DNI, "43186404T", "Carrer Vent", "971786858", "juas@gmail.com");
        Vaixell vaixell = new Vaixell("X330", propietari, model);
        trucar.afegirVaixell(vaixell);
        trucar.tornaVaixell("X330");

        if (trucar.tornaVaixell("X330").equals(vaixell)) {
            System.out.println("Es mostra correctament.");
        } else {
            System.out.println("No es mostra correctament.");
        }
    }
}
