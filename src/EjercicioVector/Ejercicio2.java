/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioVector;

/**
 *
 * @author santi
 */
public class Ejercicio2 {
    
    
    public static void main(String[] args) {
    Vector v1 = new Vector(12);
    Vector v2 = new Vector(23);
    
        System.out.println("Vector 1= " +v1.toString());
    System.out.println("Vector 2= "+v2.toString());
    
    Thread t1 = new Thread(v1,"Vector 1");
    Thread t2 = new Thread(v2,"Vector 2");
    
    t1.start();
    t2.start();
    
    }
    
    
    
    
}
