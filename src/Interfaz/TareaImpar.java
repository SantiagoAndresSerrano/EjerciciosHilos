/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author santi
 */
public class TareaImpar implements Runnable {

    /**
     * @param args the command line arguments
     */
    public void mostrarImpares() {
        for (int i = 1; i < 11; i++) {

            if (i % 2 != 0) {

                System.out.println(i+Thread.currentThread().getName());
 try {
            Thread.sleep(304);
        } catch (InterruptedException ex) {
            Logger.getLogger(TareaImpar.class.getName()).log(Level.SEVERE, null, ex);
        }
            }

        }

    }

    @Override
    public void run() {
        
        mostrarImpares();
        try {
            Thread.sleep(304);
        } catch (InterruptedException ex) {
            Logger.getLogger(TareaImpar.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }

}
