/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iespaucasesnoves.boats.api;

import java.util.HashMap;
import java.util.Iterator;
import cat.iespaucasesnoves.boats.exepcions.DadesIncorrectesException;

/**
 *
 * @author Carlos
 */
public class Boats {
    
    private HashMap<String, Model> modelsCataleg;
    private HashMap<String, Vaixell> vaixells;
    private HashMap<String, Client> clients;
    private HashMap<String, Empleat> empleats;
    private HashMap<Integer, Reparacio> reparacions;
    private HashMap<Integer, Venda> vendes;
    private HashMap<Integer, Lloguer> lloguers;
    
    public Boats() {
        
        this.modelsCataleg = new HashMap<>();
        this.vaixells = new HashMap<>();
        this.clients = new HashMap<>();
        this.empleats = new HashMap<>();
        this.reparacions = new HashMap<>();
        this.vendes = new HashMap<>();
        this.lloguers = new HashMap<>();
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
    
    public HashMap<String, Empleat> getEmpleats() {
        return empleats;
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
    
    public void afegirEmpleat(Empleat empleat) {
        empleats.put(empleat.getNumeroDocument(), empleat);
        
    }
    
    public void eliminarEmpleat(String numeroDocument) throws DadesIncorrectesException {
        if (empleats.remove(numeroDocument) == null) {
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
    
    public HashMap<String, Model> llistarModelsDisponibles() {
        return this.modelsCataleg;
    }
    
    public HashMap<String, Model> llistarPerTipusEmbarcacio(String tipus) {
        
        HashMap<String, Model> filtrats = new HashMap<>();
        
        Iterator it = modelsCataleg.entrySet().iterator();
        while (it.hasNext()) {
            Model nou = (Model) it.next();
            if (nou.getTipus().equals(tipus)) {
                filtrats.put(nou.getReferencia(), nou);
            }
        }
        return filtrats;
    }
    
    public HashMap<String, Model> llistarEmbarcacionsPreu(double minim, double maxim) {
        
        HashMap<String, Model> filtrats = new HashMap<>();
        
        Iterator it = modelsCataleg.entrySet().iterator();
        while (it.hasNext()) {
            Model nou = (Model) it.next();
            if (nou.getPreu() >= minim && nou.getPreu() <= maxim) {
                filtrats.put(nou.getReferencia(), nou);
            }
        }
        return filtrats;
    }
    
    public Model tornaModel(String referencia) throws DadesIncorrectesException {
        if (modelsCataleg.containsKey(referencia)) {
            throw new DadesIncorrectesException();
        }
        return modelsCataleg.get(referencia);
        
    }
    
    public Vaixell tornaVaixell(String matricula) {
        
        return vaixells.get(matricula);
        
    }
    
    public Client tornaClient(String numeroDocument) {
        
        return clients.get(numeroDocument);
        
    }
    
    public Empleat tornaEmpleat(String numeroDocument) {
        
        return empleats.get(numeroDocument);
        
    }
    
    public Reparacio tornaReparacio(int id) {
        
        return reparacions.get(id);
        
    }
    
    public Lloguer tornaLloguer(int id) {
        
        return lloguers.get(id);
        
    }
    
    public Venda tornaVenda(int id) {
        
        return vendes.get(id);
        
    }
    
}
