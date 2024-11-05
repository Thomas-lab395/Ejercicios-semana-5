/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progra.pkg1.ejercicio.pkg5;

import java.util.Scanner;

/**
 *
 * @author Mayra Bardales
 */
public class Dialaboral {

   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un dia de la semana: ");
        String dia = scanner.nextLine().toLowerCase();

        switch (dia) {
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
                System.out.println("Es un dia laboral.");
                break;
            case "sabado":
            case "domingo":
                System.out.println("No es un dia laboral.");
                break;
            default:
                System.out.println("Dia no valido.");
                break;
        }
    }
}
