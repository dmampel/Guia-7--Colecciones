/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8.colecciones;

import java.util.HashMap;
import java.util.Map;

public class Ej3 {

    public static void main(String[] args) {

        HashMap<Integer, String> personas = new HashMap(); 
        
        int key = 001;
        String nombre = "vecna";
        
        personas.put(key, nombre);
        
        for (Map.Entry<Integer, String> entry : personas.entrySet()) {
            Integer key1 = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key: " +key1);
            System.out.println("Name: " +value);
        }
        
        
        

    }

}
