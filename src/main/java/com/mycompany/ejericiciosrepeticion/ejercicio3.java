/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejericiciosrepeticion;

/**
 *
 * @author miguel
 */
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 15;
        int bucle=1;
//cuando x vale mas de 100 no repite el bucle
        while (bucle <= 25) {
            System.out.println(x+" blucle numero"+bucle);
            x=x*2;
            bucle++;
            //En el ultimo bucle al principio vale 100 pero al terminar vale 101
        }
    
    }
    
}
