package ex01mcs.ejercicios.ejercicio1;
import java.util.HashMap;
import java.util.Scanner;

public class HashMapDiccionario {
  
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    HashMap<String, String> diccionario = new HashMap();
    
    //_Añadir datos al diccionario
    diccionario.put("Raspberry" , "frambuesa");
    diccionario.put("House" , "casa");
    diccionario.put("Car" , "coche");
    diccionario.put("Apple" , "manzana");
    diccionario.put("Green" , "verde");
    diccionario.put("Wardrobe" , "armario");
    diccionario.put("Water" , "agua");
    diccionario.put("Hello" , "hola");
    
    //_Declaración de variables
    int contador = 5;
    int respuestasCorrectas = 0;
    String input;
    int numIngles;
    int numEspanol;
    String palabraIngles = null;
    String palabraEspanol = null;
    
    //_Array Respuestas Incorrectas (Máximo respuestas incorrectas = 5)
    String[] respuestasIncorrectas = new String[5];
    int numArray = 0;
    int numRespuestasIncorrectas = 0;

    //_Traducir 1º número a palabra inglesa y 2º número a palabra española
    do {
      numIngles = (int) (Math.random()*(8) + 1);
      numEspanol = (int) (Math.random()*(8) + 1);
      
      //_Palabras Inglés
      if (numIngles == 1){
        palabraIngles = "Raspberry";    
      }
      if (numIngles == 2){
        palabraIngles = "House";    
      }
      if (numIngles == 3){
        palabraIngles = "Car";    
      }
      if (numIngles == 4){
        palabraIngles = "Apple";    
      }
      if (numIngles == 5){
        palabraIngles = "Green";    
      }
      if (numIngles == 6){
        palabraIngles = "Wardrobe";    
      }
      if (numIngles == 7){
        palabraIngles = "Water";    
      }
      if (numIngles == 8){
        palabraIngles = "Hello";    
      }
      
      //_Palabras Español (Obtiene la palabra registrada junto a la inglesa)
      if (numEspanol == 1){
        palabraEspanol = diccionario.get("Raspberry");    
      }
      if (numEspanol == 2){
        palabraEspanol = diccionario.get("House");    
      }
      if (numEspanol == 3){
        palabraEspanol = diccionario.get("Car");    
      }
      if (numEspanol == 4){
        palabraEspanol = diccionario.get("Apple");    
      }
      if (numEspanol == 5){
        palabraEspanol = diccionario.get("Green");    
      }
      if (numEspanol == 6){
        palabraEspanol = diccionario.get("Wardrobe");    
      }
      if (numEspanol == 7){
        palabraEspanol = diccionario.get("Water");    
      }
      if (numEspanol == 8){
        palabraEspanol = diccionario.get("Hello");    
      }
      
      //_Pregunta
      System.out.print("¿" + palabraIngles + " es " + palabraEspanol + "? Conteste (s/n): ");
      input = (s.nextLine());
      
      //_Si S y respuesta es correcta +1
      if ((input.equals("s")) && (diccionario.get(palabraIngles).equals(palabraEspanol)) ){
        respuestasCorrectas++;
        
        //_Si S y respuesta es incorrecta Registrar en Array
      } else if (input.equals("s")) {
        respuestasIncorrectas[numArray] = palabraIngles + " : " + diccionario.get(palabraIngles);
        numArray++;
        numRespuestasIncorrectas++;
        
      }
      
      //_Si N y respuesta es incorrecta Registrar en Array
      if ((input.equals("n")) && (diccionario.get(palabraIngles).equals(palabraEspanol)) ){
        respuestasIncorrectas[numArray] = palabraIngles + " : " + diccionario.get(palabraIngles);
        numArray++;
        numRespuestasIncorrectas++;
        
        //_Si N y respuesta es correcta +1
      } else if(input.equals("n")) {
        respuestasCorrectas++;
        
      }
      
      contador--;
      
    } while (contador > 0);  

    System.out.println();
    System.out.print("Respuestas acertadas: " + respuestasCorrectas);
    System.out.println();
    System.out.println();
    System.out.println("Revisa las siguientes palabras:");
    
    //_Imprime Array respuestas incorrectas
    for (int i = 0; i < numRespuestasIncorrectas; i++) {
      System.out.println(respuestasIncorrectas[i]); 
    }

    
  }
  
}
