/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioVector;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author santi
 */
public class Vector implements Runnable {

    private final int[] vector;

    public Vector(int tamanio) {

        vector = new int[tamanio];
        llenarVector();

    }

    public final void llenarVector() {

        for (int i = 0; i < vector.length; i++) {
            int numero = (int) (Math.random() * 78);
            vector[i] = numero;
        }
    }

    public int mostrarSuma() throws InterruptedException {

        int suma = 0;
        for (int i = 0; i < vector.length; i++) {
            suma += vector[i];
        }
        Thread.sleep(234);
        return suma;

    }

    public void mostrarSumaCuadrados() throws InterruptedException {
        int suma = 0;
        for (int i = 0; i < vector.length; i++) {
            suma += (vector[i] * vector[i]);
        }

        System.out.println("Suma cuadrados= "+suma + " " + Thread.currentThread().getName());
        Thread.sleep(234);
    }

    public int mostrarMedia() throws InterruptedException {
        Thread.sleep(234);
        return mostrarSuma() / vector.length;

    }

    @Override
    public void run() {

        try {
            System.out.println("Suma= "+ mostrarSuma() + " " + Thread.currentThread().getName());
            mostrarSumaCuadrados();
            System.out.println("Media= "+mostrarMedia() + " " + Thread.currentThread().getName());
            Thread.sleep(345);
        } catch (InterruptedException ex) {
            Logger.getLogger(Vector.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String toString() {

        return Arrays.toString(vector);
    }

}
