package edu.tupad.tp5.relaciones.ej3;

public class Editorial {
    private final String nombre;
    private final String direccion;

    public Editorial(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }
}
