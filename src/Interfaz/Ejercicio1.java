/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

/**
 *
 * @author santi
 */
public class Ejercicio1 {

    /**
     * 
     * 
     * Implemente un programa en java que
     * use hilos independientes. Un hilo imprime números pares del 1 al 10, y
     * otro hilo imprime números impares del 1 al 10. Cree dos instancias
     * (hilos) de cada uno y muestre la salida. Realice el programa utilizando
     * herencia y otro con la interfaz.
     * 
     * @param args
     */
    public static void main(String[] args) {
        
        
       TareaImpar ti = new TareaImpar();
       TareaPar tp = new TareaPar();
       
       Thread hilo1= new Thread(ti," Tarea Impar ");
       Thread hilo2= new Thread(tp," Tarea Par ");
       
       hilo1.start();
       hilo2.start();
        
    }

}