/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosFundamentales;

import Entidades.Pelicula;
import Servicios.PeliculaServicio;

public class ejercicio4 {

    public static void main(String[] args) {
        
        PeliculaServicio servicio = new PeliculaServicio();
        servicio.crearPelicula();
        
        System.out.println("Todas las películas:");
        servicio.mostrarLista();
        
        System.out.println("");
        System.out.println("Peliculas que duran más de una hora:");
        servicio.mostrarMas1Hr();
        
        System.out.println("");
        System.out.println("Lista ordenada por Titulo.");
        servicio.ordenarPorTitulo();
        servicio.mostrarLista();
        
        System.out.println("");
        System.out.println("Lista ordenada por Director.");
        servicio.ordenarPorDirector();
        servicio.mostrarLista();
        
        System.out.println("");
        System.out.println("Lista ordenada por Duracion Ascendente.");
        servicio.ordenarPorDuracionAscendente();
        servicio.mostrarLista();
        
        System.out.println("");
        System.out.println("Lista ordenada por Duracion Descendiente.");
        servicio.ordenarPorDuracionDescendiente();
        servicio.mostrarLista();
        
    }
    
}
