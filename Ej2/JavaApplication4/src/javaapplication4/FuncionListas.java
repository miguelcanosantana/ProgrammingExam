
package javaapplication4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FuncionListas {

    public static void main(String[] args) {
      ArrayList<Integer> lista1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
      ArrayList<Integer> lista2 = new ArrayList<>(Arrays.asList(77, 88, 99));
      ArrayList<Integer> lista3 = new ArrayList<>();

      System.out.println(mezclaListas(lista1, lista2));
      System.out.println(mezclaListas(lista2, lista1));
      System.out.println(mezclaListas(lista1, lista3));
      System.out.println(mezclaListas(lista2, lista3));
    }

    
   public static ArrayList<Integer> mezclaListas(ArrayList<Integer> a1, ArrayList<Integer> a2) {
     ArrayList<Integer> listaMezclada = new ArrayList<>();
     int pos = 0;
     
     if ((a1.size() == 0) || (a2.size() == 0)) {
       if (a1.size() == 0){
         return a2;
       }
       if (a2.size() == 0){
         return a1;
       }
       
     } else {
       
       for ( int i=0; i < a1.size(); i++ ) {
         listaMezclada.add(a1.get(i));
         
         if (pos < a2.size()){
           for ( int k=0; k < 1; k++ ) {
             listaMezclada.add(a2.get(k + pos));
           }
           
         }
         
         pos++;
       }
       
     }
     
     
     return listaMezclada;
   }
   
   
   
   
   
   
   
   
}

