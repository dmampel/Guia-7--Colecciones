/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosFundamentales;

import Servicios.PaisServicio;

public class ejercicio5 {

    public static void main(String[] args) {
        
        PaisServicio servicio = new PaisServicio();
        servicio.crearPais();
        System.out.println("Lista original:");
        servicio.mostrar();
        
        System.out.println("");
        System.out.println("Lista ordenada por orden alfabético:");
        servicio.ordenarAlfabeticamente();
        
        System.out.println("");
        servicio.buscarYEliminarPais();
        
    }
    
}
