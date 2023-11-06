/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba1;

/**
 *
 * @author alumne-DAM
 */
public class NewClass2 {
    public static void main(String[] args){
        String frase= "erore";
        char[] array = frase.toCharArray();
        int inicio = 0;
        boolean esCapicua= true;
        int fin = array.length -1;
        while (inicio < array.length && esCapicua == true){
            if (array[inicio] == array[fin]){
                esCapicua = true;
            } else {
                esCapicua = false;
            }
            inicio = inicio + 1;
            fin = fin - 1;
        }
        System.out.println("Es Capicua? " + esCapicua);
    }
    
}
