/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

import Interfaz.TareaImpar;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author santi
 */
public class HiloPar extends Thread {
    
    
    
    
    
    public void imprimirPares(){
    
    for (int i = 1; i < 11; i++) {
             
             if(i%2==0){
                 
                 System.out.println(i+Thread.currentThread().getName());
                 try {
                     Thread.sleep(304);
                 } catch (InterruptedException ex) {
                 }
                 
             }
            
        }
    }
    
    
    @Override
    public void run(){
     
        imprimirPares();
    try {
            Thread.sleep(304);
        } catch (InterruptedException ex) {
        }
    }
    
}
