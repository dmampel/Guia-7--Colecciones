/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Producto;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProductoServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    HashMap<String, Integer> listaProductos = new HashMap();

    public Producto crearProducto() {

        Producto p = new Producto();
        System.out.println("Crear producto.");
        System.out.println("Ingresá el nombre del producto.");
        p.setNombre(leer.next());
        System.out.println("Ingresá el precio.");
        p.setPrecio(leer.nextInt());

        return p;

    }

    public void agregarProductoALaLista(Producto p) {

        listaProductos.put(p.getNombre(), p.getPrecio());
    }

    public void mostrarLista() {

        System.out.println("Productos:");
        for (Map.Entry<String, Integer> aux : listaProductos.entrySet()) {
            System.out.println(aux);
        }
    }

    public void modificarPrecio() {

        System.out.println("Modificar precio.");
        System.out.println("Introducí el nombre del producto que queres modificar.");
        String key = leer.next();
        System.out.println("Ingresá el precio nuevo.");
        int newValue = leer.nextInt();

        for (Map.Entry<String, Integer> aux : listaProductos.entrySet()) {
            if (aux.getKey().equals(key)) {
                aux.setValue(newValue);
            }
        }
    }

    public void eliminarProducto() {

        System.out.println("Eliminar producto.");
        System.out.println("Introducí el nombre del prodcuto a eliminar.");
        String key = leer.next();

        listaProductos.remove(key);
    }

    public void menu() {

        System.out.println("Bienvenido.");
        int choice;

        do {
            System.out.println("1. Crear y añadir un nuevo producto.");
            System.out.println("2. Mostrar la lista.");
            System.out.println("3. Modificar el precio de un producto.");
            System.out.println("4. Eliminar un producto de la lista.");
            System.out.println("5. Salir.");
            choice = leer.nextInt();
            String respuesta;

            switch (choice) {
                case 1:
                    do {
                        Producto p = crearProducto();
                        agregarProductoALaLista(p);
                        System.out.println("Querés agregar otro producto?");
                        respuesta = leer.next();
                    } while (respuesta.equals("si"));
                    break;
                case 2:
                    mostrarLista();
                    break;
                case 3:
                    modificarPrecio();
                    break;
                case 4:
                    eliminarProducto();
                    break;
                case 5:
                    System.out.println("Saliendo....");
                    break;
                default:
                    System.out.println("No hay operaciones para esta respuesta.");
            }
        } while (choice != 5);
    }

}
