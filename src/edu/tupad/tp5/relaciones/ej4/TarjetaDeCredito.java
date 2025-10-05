package edu.tupad.tp5.relaciones.ej4;

import java.time.LocalDate;

public class TarjetaDeCredito {
    private final String numero;
    private final LocalDate fechaVencimiento;
    private Banco banco;
    private Cliente cliente;

    public TarjetaDeCredito(String numero, LocalDate fechaVencimiento, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco;
    }

    public String getNumero() {
        return numero;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
