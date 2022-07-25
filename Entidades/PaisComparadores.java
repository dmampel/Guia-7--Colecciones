/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Comparator;

public class PaisComparadores {
    
    public static Comparator<Pais> ordenarAlfabeticamente = new Comparator<Pais>(){
        @Override
        public int compare(Pais t, Pais t1) {
            return t.getNombre().compareTo(t1.getNombre());
        }
        
    
};
}
