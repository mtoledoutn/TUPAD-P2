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
public class Ejercicio4 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();

        System.out.print("Ingrese la categoría del producto (A, B o C): ");
        String categoria = scanner.next().toUpperCase();

        double descuento = 0;

        switch (categoria) {
            case "A":
                descuento = 0.10;
                break;
            case "B":
                descuento = 0.15;
                break;
            case "C":
                descuento = 0.20;
                break;
            default:
                System.out.println("Categoría no válida. No se aplica descuento.");
                break;
        }

        if (descuento > 0) {
            double montoDescuento = precio * descuento;
            double precioFinal = precio - montoDescuento;

            System.out.println("Precio original: " + precio);
            System.out.println("Descuento aplicado: " + (int)(descuento * 100) + "%");
            System.out.println("Precio final: " + precioFinal);
        }
    }
}
