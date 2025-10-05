package edu.tupad.tp5.dependencias.ej13;

public class GeneradorQR {
    public void generar(String valor, Usuario usuario) {
        new CodigoQR(valor, usuario);
    }
}
