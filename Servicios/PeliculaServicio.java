/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.PeliculaComparadores;
import Entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PeliculaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Pelicula> peliculas = new ArrayList();

    public Pelicula crearPelicula() {

        Pelicula peli = new Pelicula();
        String respuesta;

        do {
            System.out.println("Vamos a crear una película.");
            System.out.println("¿Cuál va a ser el título?");
            peli.setTitulo(leer.next());
            System.out.println("Indique el nombre del director.");
            peli.setDirector(leer.next());
            System.out.println("Y por último, la duración (min).");
            peli.setDuracion(leer.nextInt());

            peliculas.add(new Pelicula(peli.getTitulo(), peli.getDirector(), peli.getDuracion()));

            System.out.println("¿Te gustaría añadir otra película?");
            respuesta = leer.next();

        } while (respuesta.equals("si"));

        return peli;

    }

    public void mostrarLista() {

        for (Pelicula aux : peliculas) {
            System.out.println(aux);
        }
    }

    public void mostrarMas1Hr() {

        for (int cont = 0; cont < peliculas.size(); cont++) {
            if (peliculas.get(cont).getDuracion() > 60) {
                System.out.println(peliculas.get(cont).toString());
            }
        }
    }

    public void ordenarPorTitulo() {

        Collections.sort(peliculas, PeliculaComparadores.ordenarPorTitulo);
    }

    public void ordenarPorDirector() {

        Collections.sort(peliculas, PeliculaComparadores.ordenarPorDiretor);
    }

    public void ordenarPorDuracionAscendente() {

        Collections.sort(peliculas, PeliculaComparadores.ordenarPorDuracionAscendiente);
    }

    public void ordenarPorDuracionDescendiente() {

        Collections.sort(peliculas, PeliculaComparadores.ordenarPorDuracionDescendiente);
    }

}
