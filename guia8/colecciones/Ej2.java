/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8.colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class Ej2 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList();
        for (int cont = 0; cont < 5; cont++) {
            numeros.add(cont);
        }

        HashSet<Integer> conteo = new HashSet();
        for (int cont = 0; cont < 5; cont++) {
            conteo.add(cont);
        }

        HashMap<Integer, String> persona = new HashMap();
        for (int cont = 0; cont < 5; cont++) {
            System.out.println("Ingrese el nombre y el dni.");
            String nombre = leer.next();
            int dni = leer.nextInt();

            persona.put(dni, nombre);
            
            if (cont == 4){
                System.out.println("Muchas gracias!");
            }
        }
        
        numeros.remove(2);
        conteo.remove(1);
        persona.remove(43484771);
        
        for (Map.Entry<Integer, String> entry : persona.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key);
            System.out.println(value);
        }

    }
}
