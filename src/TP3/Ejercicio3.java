/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP3;

/**
 *
 * @author met
 */
public class Ejercicio3 {
    public static class Libro {
        private final String titulo;
        private final String autor;
        private int anioPublicacion = 0;

        public Libro(String titulo, String autor, int anioPublicacion) {
            this.titulo = titulo;
            this.autor = autor;
            this.anioPublicacion = anioPublicacion;
        }

        public String getTitulo() {
            return this.titulo;
        }

        public String getAutor() {
            return this.autor;
        }

        public int getAnioPublicacion() {
            return this.anioPublicacion;
        }

        public String setAnioPublicacion(int anioPublicacion) {
            int currentYear = java.time.Year.now().getValue();

            if (anioPublicacion > currentYear) {
                return "Error: El año de publicación no puede ser futuro";
            }
            if (anioPublicacion < 1440) {
                return "Error: El año de publicación no puede ser anterior a 1440";
            }

            this.anioPublicacion = anioPublicacion;
            return "El año de publicación ha sido actualizado a " + this.anioPublicacion;
        }

        public static void main(String[] args) {
            Libro libro = new Libro("Don Quijote de la Mancha", "Miguel Cervantes", 1800);

            System.out.println(libro.setAnioPublicacion(2026));

            System.out.println(libro.setAnioPublicacion(1605));

        }
    }
}
