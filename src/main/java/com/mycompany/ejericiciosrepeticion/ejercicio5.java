/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejericiciosrepeticion;

import java.util.Scanner;

/**
 *
 * @author miguel
 */
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Scanner teclado = new Scanner(System.in);
        int n, x;
        System.out.println("Ingrese el valor final:");
        n = teclado.nextInt();
        x = 1;
        //repite el bucle hasta que x es mayor que n
        do {
            System.out.print(x);
            System.out.print(" - ");
            x = x + 1;
        }while(x<=n);
        //cuando salga del bucle x vale 1 mas que n
        System.out.println(x);
    }
    
}
