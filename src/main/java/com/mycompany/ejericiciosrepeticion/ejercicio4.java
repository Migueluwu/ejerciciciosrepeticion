/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejericiciosrepeticion;

/**
 *
 * @author miguel
 */
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero = 1;
        while (numero < 11) {
            System.out.println("Número: " + numero);
            numero++;
        }
        System.out.println(numero);
        do {
            System.out.println("Número: " + --numero);
        } while (numero > 1);

    }

}
