/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progra.pkg1.ejercicio.pkg5;

/**
 *
 * @author Mayra Bardales
 */
public class NumerosPrimos {
       public static void main(String[] args) {
        System.out.println("Numeros primos entre 1 y 100:");

        for (int i = 2; i <= 100; i++) {
            int contadorDivisores = 0;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    contadorDivisores++;
                     
                }
            }

            if (contadorDivisores == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
    

