/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Pais;
import Entidades.PaisComparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class PaisServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    HashSet<Pais> paises = new HashSet();

    public Pais crearPais() {

        Pais p = new Pais();
        String respuesta;
        System.out.println("Vamos a hacer una lista de paises.");
       
        do {
            System.out.println("Ingrese el nombre del país.");
            p.setNombre(leer.next());

            paises.add(new Pais(p.getNombre()));

            System.out.println("Querés agregar otro pais a la lista?");
            respuesta = leer.next();
        
        } while (respuesta.equals("si"));
        
        
        
        return p;

    }
    
    public void mostrar(){
        for (Pais aux : paises) {
            System.out.println(aux);
        }
    }
    
    
    public void ordenarAlfabeticamente(){
        
        ArrayList<Pais> paisesArrayList = new ArrayList<Pais>(paises);
        Collections.sort(paisesArrayList, PaisComparadores.ordenarAlfabeticamente);
        
        for (Pais aux : paisesArrayList) {
            System.out.println(aux);
        }
    }
    
    public void buscarYEliminarPais(){
        
        System.out.println("Ingresá cualquier país.");
        Pais paisUsuario = new Pais(leer.next());
        
        Iterator<Pais> it = paises.iterator();
        
        while(it.hasNext()){
            if(it.next().equals(paisUsuario)){
                it.remove();
            }else{
                System.out.println("El pais no se encuentra en el conjunto");
            }
        }
        
        
    }
}
