package edu.tupad.tp8;

import java.util.ArrayList;

public class Ejercicio1 {

    public interface Notificable {
        void notificar(String msg);
    }

    public interface Pagable {
        double calcularTotal();
    }

    public interface Pago {
        void procesarPago(double monto);
    }

    public interface PagoConDescuento extends Pago {
        double aplicarDescuento(double monto);
    }

    public class TarjetaDeCredito implements PagoConDescuento {
        @Override
        public double aplicarDescuento(double monto) {
            return monto * 0.90;
        }

        @Override
        public void procesarPago(double monto) {
            System.out.println("Pagado " + monto);
        }
    }

    public class Cliente implements Notificable {
        @Override
        public void notificar(String msg) {
            System.out.println(msg);
        }
    }

    public class PayPal implements Pago {
        @Override
        public void procesarPago(double monto) {
            System.out.println("Pagado " + monto);
        }
    }

    public static class Producto implements Pagable {
        private String nombre;
        private double precio;

        public Producto(String nombre, double precio) {
            this.nombre = nombre;
            this.precio = precio;
        }

        public void setPrecio(double precio)
        {
            this.precio = precio;
        }

        public double getPrecio()
        {
            return this.precio;
        }

        public void setNombre(String nombre)
        {
            this.nombre = nombre;
        }

        public String getNombre()
        {
            return this.nombre;
        }

        @Override
        public double calcularTotal() {
            return this.precio;
        }
    }

    public class Pedido implements Pagable
    {
        private ArrayList<Producto> productos;
        private Cliente cliente;

        public Pedido(ArrayList<Producto> productos, Cliente cliente)
        {
            this.productos = productos;
            this.cliente = cliente;
        }

        public ArrayList<Producto> getProductos()
        {
            return this.productos;
        }

        public void addProducto(Producto producto)
        {
            this.productos.add(producto);
            this.cliente.notificar("Producto agregado");
        }

        @Override
        public double calcularTotal() {
            double total = 0;
            for (Producto p : productos) {
                total += p.getPrecio();
            }
            return total;
        }
    }
}
