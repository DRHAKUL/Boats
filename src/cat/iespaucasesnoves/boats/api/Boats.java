/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iespaucasesnoves.boats.api;

import java.util.HashMap;
import java.util.Iterator;
import cat.iespaucasesnoves.boats.exepcions.DadesIncorrectesException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Carlos
 */
public class Boats implements Serializable {

    private HashMap<String, Model> modelsCataleg;
    private HashMap<String, Vaixell> vaixells;
    private HashMap<String, Client> clients;
    private HashMap<String, Venedor> llistatVenedors;
    private HashMap<String, Mecanic> llistatMecanics;
    private HashMap<String, Patro> llistatPatrons;
    private HashMap<Integer, Reparacio> reparacions;
    private HashMap<Integer, Venda> vendes;
    private HashMap<Integer, Lloguer> lloguers;

    public Boats() {

        modelsCataleg = new HashMap<>();
        vaixells = new HashMap<>();
        clients = new HashMap<>();
        llistatVenedors = new HashMap<>();
        llistatMecanics = new HashMap<>();
        llistatPatrons = new HashMap<>();
        reparacions = new HashMap<>();
        vendes = new HashMap<>();
        lloguers = new HashMap<>();
    }

    public HashMap<String, Model> getModelsCataleg() {
        return modelsCataleg;
    }

    public HashMap<String, Vaixell> getVaixells() {
        return vaixells;
    }

    public HashMap<String, Client> getClients() {
        return clients;
    }

    public HashMap<String, Venedor> getLlistatVenedors() {
        return llistatVenedors;
    }

    public HashMap<String, Mecanic> getLlistatMecanics() {
        return llistatMecanics;
    }

    public HashMap<String, Patro> getLlistatPatrons() {
        return llistatPatrons;
    }

    public HashMap<Integer, Reparacio> getReparacions() {
        return reparacions;
    }

    public HashMap<Integer, Venda> getVendes() {
        return vendes;
    }

    public HashMap<Integer, Lloguer> getLloguers() {
        return lloguers;
    }

    public void afegirModelCataleg(Model model) {
        modelsCataleg.put(model.getReferencia(), model);
    }

    public void eliminarModelCataleg(String referencia) throws DadesIncorrectesException {
        if (modelsCataleg.remove(referencia) == null) {
            throw new DadesIncorrectesException();
        }
    }

    public void afegirVaixell(Vaixell vaixell) {
        vaixells.put(vaixell.getMatricula(), vaixell);

    }

    public void eliminarVaixell(String matricula) throws DadesIncorrectesException {
        if (vaixells.remove(matricula) == null) {
            throw new DadesIncorrectesException();
        }
    }

    public void afegirClient(Client client) {
        clients.put(client.getNumeroDocument(), client);
    }

    public void eliminarClient(String numeroDocument) throws DadesIncorrectesException {
        if (clients.remove(numeroDocument) == null) {
            throw new DadesIncorrectesException();
        }
    }

    public void afegirVenedor(Venedor v) {
        llistatVenedors.put(v.getNumeroDocument(), v);

    }

    public void eliminarVenedor(String numeroDocument) throws DadesIncorrectesException {
        if (llistatVenedors.remove(numeroDocument) == null) {
            throw new DadesIncorrectesException();
        }
    }

    public void afegirMecanic(Mecanic m) {
        llistatMecanics.put(m.getNumeroDocument(), m);

    }

    public void eliminarMecanic(String numeroDocument) throws DadesIncorrectesException {
        if (llistatMecanics.remove(numeroDocument) == null) {
            throw new DadesIncorrectesException();
        }
    }

    public void afegirPatro(Patro p) {
        llistatPatrons.put(p.getNumeroDocument(), p);

    }

    public void eliminarPatro(String numeroDocument) throws DadesIncorrectesException {
        if (llistatPatrons.remove(numeroDocument) == null) {
            throw new DadesIncorrectesException();
        }
    }

    public void afegirLloguer(Lloguer lloguer) {
        lloguers.put(lloguer.getId(), lloguer);
        lloguer.getPatro().afegirLloguer(lloguer);
    }

    public void eliminarLloguer(int idOperacio) throws DadesIncorrectesException {
        if (lloguers.remove(idOperacio) == null) {
            throw new DadesIncorrectesException();
        }
    }

    public void afegirVenda(Venda venda) {
        vendes.put(venda.getId(), venda);

    }

    public void eliminarVenda(int idOperacio) throws DadesIncorrectesException {
        if (vendes.remove(idOperacio) == null) {
            throw new DadesIncorrectesException();
        }
    }

    public void afegirReparacio(Reparacio reparacio) {
        reparacions.put(reparacio.getId(), reparacio);

    }

    public void eliminarReparacio(int idOperacio) throws DadesIncorrectesException {
        if (reparacions.remove(idOperacio) == null) {
            throw new DadesIncorrectesException();
        }
    }

    /*
    Per el catàleg web necessitam tornar una llista amb tots els models que tenim disponible, 
    una altra filtrada per tipus d'embarcació i un altre per interval de preu.

     */
    public HashMap<String, Model> llistarModelsDisponibles() {
        return this.modelsCataleg;
    }

    public HashMap<String, Model> llistarPerTipusEmbarcacio(String tipus) {

        HashMap<String, Model> filtrats = new HashMap<>();

        Iterator it = modelsCataleg.values().iterator();
        while (it.hasNext()) {
            Model nou = (Model) it.next();
            if (nou.getTipus().equals(tipus)) {
                filtrats.put(nou.getReferencia(), nou);
            }
        }
        return filtrats;
    }

    public HashMap llistarEmbarcacionsPreu(double minim, double maxim) {

        HashMap<String, Model> filtrats = new HashMap<>();
        for (Model f : modelsCataleg.values()) {
            if (f.getPreu() >= minim && f.getPreu() <= maxim) {
                filtrats.put(f.getReferencia(), f);
            }
        }

        return filtrats;
    }

    /*
    Per a la gestió del taller ha de poder tornar una llista de les reparacions pendents, 
    una altra de les que estan aturades per qualsevol motiu i finalment un històric de 
    les reparacions que ha sofert una determinada embarcació.
     */
    public ArrayList tornarLlistaReparacionsPendents() {
        ArrayList<Reparacio> pendents = new ArrayList<>();
        Iterator it = reparacions.entrySet().iterator();
        while (it.hasNext()) {
            Reparacio nova = (Reparacio) it.next();
            if (nova.getEstat().equals(Estat.TRAMITANT)) {
                pendents.add(nova);
            }
        }
        return pendents;
    }

    public ArrayList tornarLlistaReparacionsAturades() {
        ArrayList<Reparacio> aturades = new ArrayList<>();
        Iterator it = reparacions.entrySet().iterator();
        while (it.hasNext()) {
            Reparacio nova = (Reparacio) it.next();
            if (!nova.getEstat().equals(Estat.FINALITZAT)) {
                aturades.add(nova);
            }
        }
        return aturades;
    }

    public ArrayList tornarLlistaReparacionsVaixell(Vaixell v) {
        ArrayList<Reparacio> reparacionsVaixell = new ArrayList<>();
        Iterator it = reparacions.entrySet().iterator();
        while (it.hasNext()) {
            Reparacio nova = (Reparacio) it.next();
            if (nova.getVaixell().equals(v)) {
                reparacionsVaixell.add(nova);
            }
        }
        return reparacionsVaixell;
    }

    /*
    Per els lloguers necessitam que el sistema ens torni les embarcacions 
    disponibles entre unes determinades dates.
     */
 /*
    * Aixo retorna un array amb els dies entre dues dates.
     */
    public ArrayList diesEntreDates(Date data1, Date data2) {
        ArrayList<Date> rangDies = new ArrayList<>();
        Calendar inici = Calendar.getInstance();
        inici.setTime(data1);
        Calendar fi = Calendar.getInstance();
        fi.setTime(data2);

        while (!inici.after(fi)) {
            Date d = inici.getTime();
            inici.add(Calendar.DATE, 1);
            rangDies.add(d);
        }

        return rangDies;
    }

    /*
    Ficam els dies de cada lloguer a un array i el comparam amb l'array de dies demanats.
    Si algun dia coincideix, el vaixell d'aquests lloger no el tornam a la llista de vaixells lliures.
     */
    public ArrayList embarcacionsDisponiblesDates(Date dia1, Date dia2) {
        ArrayList<Date> diesDemanats = new ArrayList<>();
        ArrayList<Date> diesLlogat = new ArrayList<>();
        ArrayList<Vaixell> ocupats = new ArrayList<>();
        ArrayList<Vaixell> lliures = new ArrayList<>();
        diesDemanats = diesEntreDates(dia1, dia2);
        for (Lloguer l : lloguers.values()) {
            diesLlogat = (diesEntreDates(l.getIniciLloguer(), l.getFiLloguer()));
            // comparam els dos arrays
            for (Date d : diesLlogat) {

                for (Date d2 : diesDemanats) {
                    if (d.equals(d2)) {
                        ocupats.add(l.getVaixell());
                    }
                }
            }
        }
        // Comparam ocupats amb lliures.
        for (Vaixell v : vaixells.values()) {
            for (Vaixell o : ocupats) {
                if (v.equals(o)) {
                    lliures.add(o);
                }
            }
        }
        return lliures;
    }

    public Model tornaModel(String referencia) throws DadesIncorrectesException {
        if (modelsCataleg.containsKey(referencia) == false) {
            throw new DadesIncorrectesException();
        }
        return modelsCataleg.get(referencia);

    }

    public Vaixell tornaVaixell(String matricula) throws DadesIncorrectesException {
        if (vaixells.containsKey(matricula) == false) {
            throw new DadesIncorrectesException();
        }
        return vaixells.get(matricula);

    }

    public Client tornaClient(String numeroDocument) throws DadesIncorrectesException {
        if (clients.containsKey(numeroDocument) == false) {
            throw new DadesIncorrectesException();
        }
        return clients.get(numeroDocument);

    }

    public Venedor tornaVenedor(String numeroDocument) {

        return llistatVenedors.get(numeroDocument);

    }

    public Mecanic tornaMecanic(String numeroDocument) {

        return llistatMecanics.get(numeroDocument);

    }

    public Patro tornaPatro(String numeroDocument) {

        return llistatPatrons.get(numeroDocument);

    }

    public Reparacio tornaReparacio(int id) throws DadesIncorrectesException {
        if (reparacions.containsKey(id) == false) {
            throw new DadesIncorrectesException();
        }
        return reparacions.get(id);

    }

    public Lloguer tornaLloguer(int id) throws DadesIncorrectesException {
        if (lloguers.containsKey(id) == false) {
            throw new DadesIncorrectesException();
        }
        return lloguers.get(id);

    }

    public Venda tornaVenda(int id) throws DadesIncorrectesException {
        if (vendes.containsKey(id) == false) {
            throw new DadesIncorrectesException();
        }
        return vendes.get(id);

    }

}
