/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejericiciosrepeticion;

/**
 *
 * @author miguel
 */
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 1;
//cuando x vale mas de 100 no repite el bucle
        while (x <= 100) {
            System.out.print(x);
            System.out.print(" - ");
            x = x + 1;
            //En el ultimo bucle al principio vale 100 pero al terminar vale 101
        }
        System.out.println("");
        System.out.println(x);

    }

}
