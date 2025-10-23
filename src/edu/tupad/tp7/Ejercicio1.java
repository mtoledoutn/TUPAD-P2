package edu.tupad.tp7;

public class Ejercicio1 {
    public static class Vehiculo {
        private final String marca;
        private final String modelo;

        public Vehiculo(String marca, String modelo) {
            this.marca = marca;
            this.modelo = modelo;
        }

        public void mostrarInfo() {
            System.out.println("Marca: " + marca);
            System.out.println("Modelo: " + modelo);
        }
    }

    public static class Auto extends Vehiculo {
        private final int cantidadPuertas;

        public Auto(String marca, String modelo, int cantidadPuertas) {
            super(marca, modelo);
            this.cantidadPuertas = cantidadPuertas;
        }

        @Override
        public void mostrarInfo() {
            super.mostrarInfo();
            System.out.println("Cantidad de puertas: " + cantidadPuertas);
        }
    }

    public static void main(String[] args) {
        Auto auto = new Auto("Toyota", "Corolla", 4);
        auto.mostrarInfo();
    }
}
