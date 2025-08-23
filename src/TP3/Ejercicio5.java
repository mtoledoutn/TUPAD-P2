/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP3;

/**
 *
 * @author met
 */
public class Ejercicio5 {
    public static class NaveEspacial {
        private String nombre;
        private int combustible = 0;
        private int combustibleMaximo = 100;

        public NaveEspacial(String nombre, int combustible) {
            this.nombre = nombre;
            this.combustible = combustible;
        }

        public String despegar() {
            if (this.combustible <= 10) {
                return "No hay combustible para despegar.";
            } else {
                this.combustible -= 10;
                return "La nave ha despegado.";
            }
        }

        public String avanzar(int distancia) {
            int consumo = distancia / 2;
            if (this.combustible >= consumo) {
                this.combustible -= consumo;
                return "La nave ha avanzado " + distancia + " unidades.";
            } else {
                return "No hay suficiente combustible para avanzar esa distancia.";
            }
        }

        public String recargarCombustible(int cantidad) {
            if (this.combustible + cantidad > this.combustibleMaximo) {
                this.combustible = this.combustibleMaximo;
                return "El combustible se ha recargado al máximo.";
            } else {
                this.combustible += cantidad;
                return "El combustible se ha recargado. Nivel actual: " + this.combustible;
            }
        }

        public String mostrarEstado() {
            return "Nave: " + this.nombre + ", Combustible: " + this.combustible + "/" + this.combustibleMaximo;
        }

        public static void main(String[] args) {
            NaveEspacial nave = new NaveEspacial("Halcon Milenario", 5);

            System.out.println(nave.avanzar(15));

            System.out.println(nave.recargarCombustible(50));

            System.out.println(nave.despegar());

            System.out.println(nave.avanzar(15));

            System.out.println(nave.mostrarEstado());

        }
    }
}
