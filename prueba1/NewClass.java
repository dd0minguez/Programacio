/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */package prueba1;
import java.util.Scanner;

/**
 *
 * @author alumne-DAM
 */
public class NewClass {
   public static void main(String[] args) {
       Scanner consola = new Scanner(System.in);

   //boolean numero = true ;
    int numeroCompt = 0;
    while (numeroCompt < 20) {
        System.out.println(numeroCompt);
        numeroCompt = numeroCompt + 2;
    }
    System.out.println("S'ha sumat 1 i ara es: " + numeroCompt);
    
       System.out.print("Escriu una frase: ");
    String fraseUsuaio = "Hola mundo";
    System.out.println("Has escrit: " + fraseUsuaio);
    }
}