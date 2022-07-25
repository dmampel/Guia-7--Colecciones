/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosFundamentales;

import Entidades.Alumno;
import Servicios.AlumnoServicio;
import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {
        
        AlumnoServicio servicio = new AlumnoServicio();
        ArrayList <Alumno> alumnos = new ArrayList();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        String respuesta;
        
        do{
            alumnos.add(servicio.crearAlumno());
            System.out.println("Querés agregar a otro alumno?");
            respuesta = leer.next();
        
        }while (respuesta.equals("si"));
        
        for (Alumno aux : alumnos) {
            System.out.println(aux);
            
        }
        
    }
    
}
