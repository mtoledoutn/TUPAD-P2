/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP2;
import java.util.Scanner;
/**
 *
 * @author met
 */
public class Ejercicio5 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int suma = 0;
        int numero;

        System.out.print("Ingrese un numero o 0 para salir: ");
        numero = scanner.nextInt();

        while (numero != 0) {
            if (numero % 2 == 0) {
                suma += numero;
            }
            System.out.print("Ingrese un numero o 0 para salir): ");
            numero = scanner.nextInt();
        }

        System.out.println("La suma de los numeros es: " + suma);
    }
}
