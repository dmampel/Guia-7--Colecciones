/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8.colecciones;

import java.util.ArrayList;
import java.util.Iterator;

public class Ej4 {

    public static void main(String[] args) {

        ArrayList<String> bebidas = new ArrayList();

        bebidas.add("café");
        bebidas.add("té");
        Iterator<String> it = bebidas.iterator();

        while (it.hasNext()) {
            if (it.next().equals("café")) {
                it.remove();
            }
        }

    }
}
