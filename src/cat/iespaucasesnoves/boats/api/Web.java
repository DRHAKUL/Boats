/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iespaucasesnoves.boats.api;

import cat.iespaucasesnoves.boats.exepcions.DadesIncorrectesException;
import java.util.logging.Level;
import java.util.logging.Logger;

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

        } catch (DadesIncorrectesException ex) {
            Logger.getLogger(Web.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}