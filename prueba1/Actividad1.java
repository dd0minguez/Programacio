/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba1;

/**
 *
 * @author alumne-DAM
 */
public class Actividad1 {
     public static void main(String[] args) {
         String frase = "Hola";
         char[] frase1 = frase.toCharArray();
         int contador = 0;
         while (contador < frase1.length){
             System.out.println(frase1[contador]);
             contador = contador + 1;
         }
     }
}
