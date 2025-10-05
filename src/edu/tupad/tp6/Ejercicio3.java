package edu.tupad.tp6;

import java.util.ArrayList;

public class Ejercicio3 {

    public static class Profesor {
        public String id;
        public String nombre;
        public String especialidad;
        public ArrayList<Curso> cursos;

        public Profesor(String id, String nombre, String especialidad) {
            this.id = id;
            this.nombre = nombre;
            this.especialidad = especialidad;
            this.cursos = new ArrayList<>();
        }

        public void agregarCurso(Curso c) {
            if (!this.cursos.contains(c)) {
                this.cursos.add(c);
            }
        }

        public void eliminarCurso(Curso c) {
            this.cursos.remove(c);
        }

        public void listarCursos() {
            for (Curso c: this.cursos) {
                System.out.println("Curso: " + c.nombre + " (Código: " + c.codigo + ")");
            }
        }

        public void mostrarInfo() {
            System.out.println("ID: " + this.id);
            System.out.println("Nombre: " + this.nombre);
            System.out.println("Especialidad: " + this.especialidad);
            System.out.println("Cursos asignados:");
            listarCursos();
        } 
    }

    public static class Curso {
        public String codigo;
        public String nombre;
        public Profesor profesor;

        public Curso(String codigo, String nombre, Profesor profesor) {
            this.codigo = codigo;
            this.nombre = nombre;
            this.profesor = profesor;
        }

        public void setProfesor(Profesor profesor) {
            this.profesor = profesor;
        }

        public void mostrarInfo() {
            System.out.println("Código: " + this.codigo);
            System.out.println("Nombre: " + this.nombre);
            System.out.println("Profesor: " + (this.profesor != null ? this.profesor.nombre : "No asignado"));
        }
    }

    public static class Universidad {
        private String nombre;
        private ArrayList<Profesor> profesores;
        private ArrayList<Curso> cursos;

        public Universidad(String nombre) {
            this.nombre = nombre;
            this.profesores = new ArrayList<>();
            this.cursos = new ArrayList<>();
        }

        public void agregarProfesor(Profesor p) {
            this.profesores.add(p);
        }

        public void agregarCurso(Curso c) {
            this.cursos.add(c);
        }

        public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
            Curso curso = null;
            Profesor profesor = null;

            for (Curso c : cursos) {
                if (c.codigo.equals(codigoCurso)) {
                    curso = c;
                    break;
                }
            }

            for (Profesor p : profesores) {
                if (p.id.equals(idProfesor)) {
                    profesor = p;
                    break;
                }
            }

            if (curso != null && profesor != null) {
                if (curso.profesor != null && curso.profesor != profesor) {
                    curso.profesor.eliminarCurso(curso);
                }
                curso.setProfesor(profesor);
                if (profesor != null) {
                    profesor.agregarCurso(curso);
                }
            } else {
                System.out.println("Curso o Profesor no encontrado.");
            }
        }

        public void listarProfesores() {
            System.out.println("Profesores en la universidad " + this.nombre + ":");
            for (Profesor p : profesores) {
                p.mostrarInfo();
                System.out.println("---------------");
            }
        }

        public void listarCursos() {
            System.out.println("Cursos en la universidad " + this.nombre + ":");
            for (Curso c : cursos) {
                c.mostrarInfo();
                System.out.println("---------------");
            }
        }

        public void buscarProfesorPorId(String id) {
            for (Profesor p : profesores) {
                if (p.id.equals(id)) {
                    p.mostrarInfo();
                    return;
                }
            }
            System.out.println("Profesor con ID " + id + " no encontrado.");
        }

        public void buscarCursoporCodigo(String codigo) {
            for (Curso c : cursos) {
                if (c.codigo.equals(codigo)) {
                    c.mostrarInfo();
                    return;
                }
            }
            System.out.println("Curso con código " + codigo + " no encontrado.");
        }

        public void eliminarCurso(String codigo) {
            Curso cursoAEliminar = null;
            for (Curso c : this.cursos) {
                if (c.codigo.equals(codigo)) {
                    cursoAEliminar = c;
                    break;
                }
            }
            if (cursoAEliminar != null) {
                this.cursos.remove(cursoAEliminar);
                if (cursoAEliminar.profesor != null) {
                    cursoAEliminar.profesor.eliminarCurso(cursoAEliminar);
                }
                cursoAEliminar.setProfesor(null);
            } else {
                System.out.println("Curso con código " + codigo + " no encontrado.");
            }
        }

        public void eliminarProfesor(String id) {
            Profesor profesorAEliminar = null;
            for (Profesor p : this.profesores) {
                if (p.id.equals(id)) {
                    profesorAEliminar = p;
                    break;
                }
            }
            if (profesorAEliminar != null) {
                for (Curso c : new ArrayList<>(profesorAEliminar.cursos)) {
                    c.setProfesor(null);
                    profesorAEliminar.eliminarCurso(c);
                }
                this.profesores.remove(profesorAEliminar);
            } else {
                System.out.println("Profesor con ID " + id + " no encontrado.");
            }
        }

        public void mostrarReporteCursosPorProfesor() {
            System.out.println("Reporte de cursos por profesor:");
            for (Profesor profesor : profesores) {
                System.out.println(profesor.nombre + ": " + profesor.cursos.size() + " curso(s)");
            }
        }
    }

    public static void main(String[] args) {
        Universidad universidad = new Universidad("Universidad Nacional");

        Profesor profesor1 = new Profesor("P1", "Laura Gómez", "Matemática");
        Profesor profesor2 = new Profesor("P2", "Carlos Pérez", "Historia");
        Profesor profesor3 = new Profesor("P3", "Ana Torres", "Informática");

        universidad.agregarProfesor(profesor1);
        universidad.agregarProfesor(profesor2);
        universidad.agregarProfesor(profesor3);

        Curso curso1 = new Curso("C101", "Álgebra", null);
        Curso curso2 = new Curso("C102", "Historia Moderna", null);
        Curso curso3 = new Curso("C103", "Programación I", null);
        Curso curso4 = new Curso("C104", "Bases de Datos", null);
        Curso curso5 = new Curso("C105", "Estadística", null);

        universidad.agregarCurso(curso1);
        universidad.agregarCurso(curso2);
        universidad.agregarCurso(curso3);
        universidad.agregarCurso(curso4);
        universidad.agregarCurso(curso5);

        universidad.asignarProfesorACurso("C101", "P1");
        universidad.asignarProfesorACurso("C102", "P2");
        universidad.asignarProfesorACurso("C103", "P3");
        universidad.asignarProfesorACurso("C104", "P3");
        universidad.asignarProfesorACurso("C105", "P1");

        System.out.println("\n--- Listado inicial ---");
        universidad.listarCursos();
        universidad.listarProfesores();

        universidad.asignarProfesorACurso("C104", "P2");

        System.out.println("\n--- Después de reasignar curso C104 a P2 ---");
        universidad.listarCursos();
        universidad.listarProfesores();

        universidad.eliminarCurso("C105");
        System.out.println("\n--- Después de eliminar curso C105 ---");
        universidad.listarCursos();
        universidad.buscarProfesorPorId("P1");

        universidad.eliminarProfesor("P2");
        System.out.println("\n--- Después de eliminar profesor P2 ---");
        universidad.listarProfesores();
        universidad.listarCursos();

        System.out.println("\n--- Reporte final ---");
        universidad.mostrarReporteCursosPorProfesor();
    }

}
