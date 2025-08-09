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
public class Ejercicio8 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese otro numero");
        int num2 = scanner.nextInt();
        
        System.out.println("Resultado:" + (double) num1 / num2);
        
    }
}
