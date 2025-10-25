package edu.tupad.tp8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio2 {

    static class EdadInvalidaException extends Exception {
        public EdadInvalidaException(String mensaje) {
            super(mensaje);
        }
    }

    public static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("La edad debe estar entre 0 y 99 años.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2 = scanner.nextInt();

        try {
            System.out.println(num1 / num2);
        } catch (ArithmeticException e) {
            System.err.println("El divisor no puede ser cero");
        }

        System.out.println("Ingrese el numero a convertir");
        scanner.nextLine();
        String cadena = scanner.nextLine();
        try {
            int convertido = Integer.parseInt(cadena);
            System.out.println(convertido);
        } catch (NumberFormatException e) {
            System.err.println("No es un numero valido");
        }

        File archivo = new File("archivo.txt");

        try (Scanner lector = new Scanner(archivo)) {

            while (lector.hasNextLine()) {
                String linea = lector.nextLine();
                System.out.println(linea);
            }

        } catch (FileNotFoundException e) {
            System.err.println("Error: el archivo no existe o no se pudo abrir.");
        }

        int edad = -5;

        try {
            validarEdad(edad);
            System.out.println("Edad válida: " + edad);
        } catch (EdadInvalidaException e) {
            System.err.println("Error: " + e.getMessage());
        }

        String rutaArchivo = "archivo.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

        } catch (IOException e) {
            System.err.println("No se pudo leer el archivo");
        }
    }
}