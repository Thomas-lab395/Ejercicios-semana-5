/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package progra.pkg1.ejercicio.pkg5;

import java.util.Scanner;


public class Progra1Ejercicio5 {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el numero de ventas: ");
        int numVentas = scanner.nextInt();
        int sumaVentas = 0;

        for (int i = 1; i <= numVentas; i++) {
            System.out.print("Ingrese el valor de la venta " + i + ": ");
            int venta = scanner.nextInt();
            sumaVentas += venta;
        }
        
        System.out.println("La suma total de las ventas es: " + sumaVentas);
        
        
    }
}



    
    

