package edu.tupad.tp6;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {
    public static class Autor {
        private String id;
        private String nombre;
        private String nacionalidad;

        public Autor(String id, String nombre, String nacionalidad) {
            this.id = id;
            this.nombre = nombre;
            this.nacionalidad = nacionalidad;
        }

        public void mostrarInfo() {
            System.out.println("ID: " + this.id);
            System.out.println("Nombre: " + this.nombre);
            System.out.println("Nacionalidad: " + this.nacionalidad);
        }
    }

    public static class Biblioteca {
        private String nombre;
        private boolean activa;
        List<Libro> libros;

        public Biblioteca(String nombre) {
            this.nombre = nombre;
            this.libros = new ArrayList<>();
            this.activa = true;
        }

        private class Libro {
            private String isbn;
            private String titulo;
            private int anioPublicacion;
            private Autor autor;

            private Libro(String isbn, String titulo, int anioPublicacion, Autor autor) {
                this.isbn = isbn;
                this.titulo = titulo;
                this.anioPublicacion = anioPublicacion;
                this.autor = autor;
            }

            private void mostrarInfo() {
                System.out.println("ISBN: " + this.isbn);
                System.out.println("Titulo: " + this.titulo);
                System.out.println("Año de Publicación: " + this.anioPublicacion);
                System.out.println("Autor: ");
                this.autor.mostrarInfo();
            }
        }

        public void listarLibros() {
            System.out.println("Libros en la biblioteca " + this.nombre + ":");
            for (Libro libro : libros) {
                libro.mostrarInfo();
                System.out.println("-----");
            }
        }

        public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
            Libro nuevoLibro = new Libro(isbn, titulo, anioPublicacion, autor);
            this.libros.add(nuevoLibro);
        }

        public void buscarLibroPorIsbn(String isbn) {
            for (Libro libro : libros) {
                if (libro.isbn.equals(isbn)) {
                    libro.mostrarInfo();
                    return;
                }
            }
            System.out.println("Libro con ISBN " + isbn + " no encontrado.");
        }

        public void eliminarLibro(String isbn) {
            libros.removeIf(libro -> libro.isbn.equals(isbn));
        }

        public void obtenerCantidadLibros() {
            System.out.println("Cantidad total de libros: " + this.libros.size());
        }

        public void filtrarLibrosPorAnio(int anio) {
            System.out.println("Libros publicados en el año " + anio + ":");
            for (Libro libro : libros) {
                if (libro.anioPublicacion == anio) {
                    libro.mostrarInfo();
                    System.out.println("-----");
                }
            }
        }

        public void mostrarAutoresDisponibles() {
            System.out.println("Autores disponibles en la biblioteca:");
            for (Libro libro : libros) {
                libro.autor.mostrarInfo();
                System.out.println("-----");
            }
        }

        public void eliminarBiblioteca() {
            System.out.println("Eliminando biblioteca " + this.nombre + " y sus " + libros.size() + " libros asociados.");
            libros.clear();
            activa = false;
        }
    }

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Nueva Biblioteca");

        Autor autor1 = new Autor("A1", "Gabriel García Márquez", "Colombiano");
        Autor autor2 = new Autor("A2", "Isabel Allende", "Chilena");
        Autor autor3 = new Autor("A3", "Mario Vargas Llosa", "Peruano");

        biblioteca.agregarLibro("123456884984", "Cien Años de Soledad", 1967, autor1);
        biblioteca.agregarLibro("321321654654", "La Casa de los Espíritus", 1982, autor2);
        biblioteca.agregarLibro("12321654684684", "La Ciudad y los Perros", 1963, autor3);
        biblioteca.agregarLibro("345345345435", "El Amor en los Tiempos del Cólera", 1985, autor1);
        biblioteca.agregarLibro("345345345345", "Eva Luna", 1987, autor2);

        biblioteca.listarLibros();

        biblioteca.buscarLibroPorIsbn("123456884984");

        biblioteca.filtrarLibrosPorAnio(1982);

        biblioteca.eliminarLibro("12321654684684");

        biblioteca.listarLibros();

        biblioteca.obtenerCantidadLibros();

        biblioteca.mostrarAutoresDisponibles();
    }

}
