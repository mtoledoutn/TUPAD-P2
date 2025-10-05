package edu.tupad.tp5.relaciones.ej1;

public class Foto {
    private final String imagen;
    private final String formato;

    public Foto(String imagen, String formato) {
        this.imagen = imagen;
        this.formato = formato;
    }

    public String getImagen() {
        return imagen;
    }

    public String getFormato() {
        return formato;
    }
}
