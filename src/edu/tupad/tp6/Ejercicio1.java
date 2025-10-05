package edu.tupad.tp6;
import java.util.ArrayList;

public class Ejercicio1 {

    public enum CategoriaProducto {
        ALIMENTOS("Productos comestibles"),
        ELECTRONICA("Dispositivos electrónicos"),
        ROPA("Prendas de vestir"),
        HOGAR("Artículos para el hogar");

        private final String descripcion;

        CategoriaProducto(String descripcion) {
            this.descripcion = descripcion;
        }

        public String getDescripcion() {
            return descripcion;
        }
    }

    public static class Producto {
        private String Id;
        private String nombre;
        private double precio;
        private int cantidad;
        private CategoriaProducto categoria;

        public void mostrarInfo() {
            System.out.println("ID: " + this.Id);
            System.out.println("Nombre: " + this.nombre);
            System.out.println("Precio: " + this.precio);
            System.out.println("Cantidad: " + this.cantidad);
            System.out.println("Categoria: " + this.categoria);
        }

        public Producto(String Id, String nombre, double precio, int cantidad, CategoriaProducto categoria) {
            this.Id = Id;
            this.nombre = nombre;
            this.precio = precio;
            this.cantidad = cantidad;
            this.categoria = categoria;
        }
    }

    public static class Inventario {
        private ArrayList<Producto> productos;

        public Inventario() {
            this.productos = new ArrayList<>();
        }

        public void agregarProducto(Producto p) {
            this.productos.add(p);
        }

        public void listarProductos() {
            for (Producto p : this.productos) {
                p.mostrarInfo();
                System.out.println("---------------");
            }
        }

        public void buscarProductoPorId(String Id) {
            for (Producto p : this.productos) {
                if (p.Id.equals(Id)) {
                    p.mostrarInfo();
                    return;
                }
            }
            System.out.println("Producto con ID " + Id + " no encontrado.");
        }

        public void eliminarProducto(String Id) {
            Producto productoAEliminar = null;
            for (Producto p : this.productos) {
                if (p.Id.equals(Id)) {
                    productoAEliminar = p;
                    break;
                }
            }
            if (productoAEliminar != null) {
                this.productos.remove(productoAEliminar);
                System.out.println("Producto con ID " + Id + " eliminado.");
            } else {
                System.out.println("Producto con ID " + Id + " no encontrado.");
            }
        }

        public void actualizarStock(String Id, int nuevaCantidad) {
            for (Producto p : this.productos) {
                if (p.Id.equals(Id)) {
                    p.cantidad = nuevaCantidad;
                    System.out.println("Stock del producto con ID " + Id + " actualizado a " + nuevaCantidad);
                    return;
                }
            }
            System.out.println("Producto con ID " + Id + " no encontrado.");
        }

        public void filtrarPorCategoria(CategoriaProducto categoria) {
            for (Producto p : this.productos) {
                if (p.categoria == categoria) {
                    p.mostrarInfo();
                    System.out.println("---------------");
                }
            }
        }

        public void obtenerTotalStock() {
            int total = 0;
            for (Producto p : this.productos) {
                total += p.cantidad;
            }
            System.out.println("Total de productos en stock: " + total);
        }

        public void obtenerProductoConMayorStock() {
            if (this.productos.isEmpty()) {
                System.out.println("No hay productos en el inventario.");
                return;
            }
            Producto maxStockProducto = this.productos.get(0);
            for (Producto p : this.productos) {
                if (p.cantidad > maxStockProducto.cantidad) {
                    maxStockProducto = p;
                }
            }
            System.out.println("Producto con mayor stock:");
            maxStockProducto.mostrarInfo();
        }

        public void filtrarProductosPorPrecio(double min, double max) {
            for (Producto p : this.productos) {
                if (p.precio >= min && p.precio <= max) {
                    p.mostrarInfo();
                    System.out.println("---------------");
                }
            }
        }

        public void mostrarCategoriasDisponibles() {
            System.out.println("Categorías disponibles:");
            for (CategoriaProducto categoria : CategoriaProducto.values()) {
                System.out.println(categoria + ": " + categoria.getDescripcion());
            }
        }
    }

    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        Producto p1 = new Producto("001", "Manzanas", 1.5, 100, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("002", "Televisor", 300.0, 20, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("003", "Camisa", 25.0, 50, CategoriaProducto.ROPA);
        Producto p4 = new Producto("004", "Sofá", 500.0, 10, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("004", "Harina", 2.5, 200, CategoriaProducto.ALIMENTOS);

        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);

        System.out.println("Listado de productos:");
        inventario.listarProductos();

        System.out.println("Buscar producto por ID '002':");
        inventario.buscarProductoPorId("002");

        System.out.println("Actualizar stock del producto '003' a 60:");
        inventario.actualizarStock("003", 60);

        System.out.println("Filtrar productos por categoría ELECTRONICA:");
        inventario.filtrarPorCategoria(CategoriaProducto.ELECTRONICA);

        System.out.println("Total de productos en stock:");
        inventario.obtenerTotalStock();

        System.out.println("Producto con mayor stock:");
        inventario.obtenerProductoConMayorStock();

        System.out.println("Filtrar productos por precio entre 20 y 400:");
        inventario.filtrarProductosPorPrecio(20, 400);

        System.out.println("Mostrar categorías disponibles:");
        inventario.mostrarCategoriasDisponibles();

        System.out.println("Eliminar producto con ID '001':");
        inventario.eliminarProducto("001");
        inventario.listarProductos();

        System.out.println("Filtrar productos con precios entre $1000 y $3000: ");
        inventario.filtrarProductosPorPrecio(1000, 3000);

    }

}
