/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP1;

import java.util.Scanner;

/**
 *
 * @author martin
 */
public class Ejercicio4 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese su edad");
        int edad = scanner.nextInt();
        
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad " + edad);
        
    }
    
}
