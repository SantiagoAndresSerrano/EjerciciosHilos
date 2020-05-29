/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

/**
 *
 * @author santi
 */
public class Ejercicio1H {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HiloImpar hi = new HiloImpar();
        HiloPar hp = new HiloPar();
        
        hi.setName(" Tarea Impar ");
        hp.setName(" Tarea Par ");
        
        hi.start();
        hp.start();
        
        
    }
    
}
