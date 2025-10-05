package edu.tupad.tp5.relaciones.ej1;

import java.time.LocalDate;

public class Pasaporte {
    private final String numero;
    private final LocalDate fechaEmision;
    private final Foto foto;
    private Titular titular;

    public Pasaporte(String numero, LocalDate fechaEmision, String imagen, String formato) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto(imagen, formato);
    }

    public String getNumero() {
        return numero;
    }

    public LocalDate getFechaEmision() {
        return fechaEmision;
    }

    public Foto getFoto() {
        return foto;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }
}
