package edu.tupad.tp5.relaciones.ej8;

public class Documento {
    private final String titulo;
    private final String contenido;
    private final FirmaDigital firmaDigital;

    public Documento(String titulo, String contenido, String codigoHash, String fecha, Usuario usuario) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firmaDigital = new FirmaDigital(codigoHash, fecha, usuario);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public FirmaDigital getFirmaDigital() {
        return firmaDigital;
    }
}
