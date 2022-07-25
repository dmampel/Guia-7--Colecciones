/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AlumnoServicio {

    ArrayList<Integer> notas = new ArrayList();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Alumno crearAlumno() {

        Alumno al = new Alumno();

        System.out.println("Vamos a añadir a un alumno.");

        System.out.println("Ingrese el nombre.");
        al.setNombre(leer.next());
        
        System.out.println("Ahora ingrese las notas.");
        for (int cont = 0; cont < 3; cont++) {
            System.out.println("Nota " + (cont + 1) + ": ");
            notas.add(leer.nextInt());
        }

        
        return new Alumno(al.getNombre(), notas); 

    }

    public void notaFinal(ArrayList<Alumno> alumnos) {

        

    }

}
