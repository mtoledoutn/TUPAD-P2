/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP3;

/**
 *
 * @author met
 */
public class Ejercicio1 {
    
    public static class Estudiante {
        private String nombre;
        private String apellido;
        private String curso;
        private double calificacion = 0;
        
        public Estudiante(String nombre, String apellido, String curso, double calificacion)
        {
            this.nombre = nombre;
            this.apellido = apellido;
            this.curso = curso;
            this.calificacion = calificacion;
        }
        
        public String mostrarInfo()
        {
            return "Nombre del alumno: " + this.nombre + " " + this.apellido + "\n" + "Curso: " + this.curso + "\n" + "Calificacion: " + this.calificacion;
        }
        
        public double subirCalificacion(int puntos)
        {
            this.calificacion += puntos;
            return this.calificacion;
        }
        
        public double bajarCalificacion(int puntos)
        {
            this.calificacion -= puntos;
            if (this.calificacion < 0) {
                this.calificacion = 0;            
            }
            
            return this.calificacion;
        }
    
    }
    
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Martin", "Toledo", "Programacion II", 8);
        
        System.out.println(estudiante.mostrarInfo());
        System.out.println("Nueva calificacion " + estudiante.subirCalificacion(2));
        System.out.println("Nueva calificacion " + estudiante.bajarCalificacion(2));
    
    }
}
