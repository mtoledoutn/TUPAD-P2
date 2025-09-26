/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP3;

/**
 *
 * @author met
 */
public class Ejercicio2 {
    public static class Mascota {
        private final String nombre;
        private final String especie;
        private int edad = 0;
        
        public Mascota(String nombre, String especie, int edad)
        {
            this.nombre = nombre;
            this.especie = especie;
            this.edad = edad;
        }
        
        public String mostrarInfo()
        {
            return "Nombre de la mascota: " + this.nombre +  "\n" + "Especie: " + this.especie + "\n" + "Edad: " + this.edad + " años";
        }
        
        public int cumplirAnios()
        {
            this.edad += 1;
            return this.edad;
        }
    
    }
    
    public static void main(String[] args) {
        Mascota mascota = new Mascota("Chirola", "Perro", 3);
        
        System.out.println(mascota.mostrarInfo());
        System.out.println("La mascota cumplio años, ahora tiene " + mascota.cumplirAnios() + " años");
    
    }
    
}
