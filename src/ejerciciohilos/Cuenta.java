/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciohilos;

/**
 *
 * @author santi
 */
public class Cuenta {

    private double saldo = 500000;

    public Double getSaldo() {
        return saldo;
    }

    public void retirar(Double cantidad) {
        saldo -= cantidad;
    }
}
