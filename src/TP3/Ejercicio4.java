/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP3;

/**
 *
 * @author met
 */
public class Ejercicio4 {
    public static class Gallina {
        private final int id;
        private int edad;
        private int huevosPuestos;

        public Gallina(int id, int edad, int huevosPuestos) {
            this.id = id;
            this.edad = edad;
            this.huevosPuestos = huevosPuestos;
        }

        public int ponerHuevo() {
            this.huevosPuestos += 1;
            return this.huevosPuestos;
        }

        public int envejecer() {
            this.edad += 1;
            return this.edad;
        }

        public String mostrarEstado() {
            return "Gallina ID: " + this.id + ", Edad: " + this.edad + " años, Huevos puestos: " + this.huevosPuestos;
        }
        

        public static void main(String[] args) {
            Gallina gallina = new Gallina(1, 4, 6);

            System.out.println("La gallina puso un huevo. Nuevo numero de huevos puestos: " + gallina.ponerHuevo());

            System.out.println("La gallina envejecio. Ahora tiene " + gallina.envejecer() + " años.");

            System.out.println(gallina.mostrarEstado());

        }
    }
}
