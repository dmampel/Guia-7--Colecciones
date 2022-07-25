/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosFundamentales;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        ArrayList<String> perros = new ArrayList();
        String respuesta;
        

        System.out.println("Vamos a crear una lista de perros.");

        do {
            System.out.println("Inserte la raza.");
            String raza = leer.nextLine();
            perros.add(raza);

            System.out.println("Querés continuar con la lista?");
            respuesta = leer.nextLine();

        } while (respuesta.equals("si"));

        System.out.println("");
        System.out.println("La lista:");

        for (String perro : perros) {
            System.out.println(perro);
        }
        
        System.out.println("");

        System.out.println("Ingrese un perro cualquiera.");
        String request = leer.nextLine();

        Iterator<String> it = perros.iterator();

        while (it.hasNext()) {
            String aux = it.next();
            if (aux.equals(request)) {
                it.remove();
                System.out.println("Hemos eliminado al perro de la lista.");
            }
        }
        
        Collections.sort(perros);
        
        for (String perro : perros) {
            System.out.println(perro);
        }

    }

}
