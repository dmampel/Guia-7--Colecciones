/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8.colecciones;

import Entidades.Libro;
import java.util.ArrayList;

public class Ej5 {

    public static void main(String[] args) {
        
        ArrayList<Libro> books = new ArrayList();
        
        Libro libro = new Libro(1111, "las moscas en casa", "julio el feo", 2);
        books.add(libro);
        Libro libro2 = new Libro(222, "vuelan los ciegos", "tu jefe antonio", 77);
        books.add(libro2);
        
        for (Libro book : books) {
            System.out.println(book);
        }
    }
    
}
