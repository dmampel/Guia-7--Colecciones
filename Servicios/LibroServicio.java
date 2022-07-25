/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.*;
import Entidades.Libro;
import java.util.Scanner;

public class LibroServicio {
    
    public Libro crearLibro(){
       
        Libro libroUno = new Libro();
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Introduzca el ISBN del libro.");
        libroUno.setIsbn(leer.nextInt());
        System.out.println("Introduzca el título.");
        libroUno.setTitulo(leer.next());
        System.out.println("Introduzca el nombre del autor.");
        libroUno.setAutor(leer.next());
        System.out.println("Por último, el número de páginas.");
        libroUno.setNumeroPaginas(leer.nextInt());
        
        return libroUno;
    }
    
    public void mostrarLibro(Libro libroUno){
        
        System.out.println("ISBN: " +libroUno.getIsbn());
        System.out.println("Título: " +libroUno.getTitulo());
        System.out.println("Autor: " +libroUno.getAutor());
        System.out.println("Cantidad de páginas: " +libroUno.getNumeroPaginas());
        
    
    }
    
}
