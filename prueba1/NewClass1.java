/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba1;

/**
 *
 * @author alumne-DAM
 */
public class NewClass1 {
    
      public static void main(String[] args) {
            String frase = "Hola mundo";
            char[] array = frase.toCharArray();
            int contador = 0;
            int espais = 0;
            while (contador < array.length){
                if (array[contador] == ' '){
                 espais = espais +1;
                }
            contador = contador + 1;
            }
            System.out.println("Hi ha " + espais  + " espais");
        }
}