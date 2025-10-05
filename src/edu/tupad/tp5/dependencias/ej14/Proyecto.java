package edu.tupad.tp5.dependencias.ej14;

public class Proyecto {
    private final String nombre;
    private final int duracionMin;

    public Proyecto(String nombre, int duracionMin) {
        this.nombre = nombre;
        this.duracionMin = duracionMin;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDuracionMin() {
        return duracionMin;
    }
}
