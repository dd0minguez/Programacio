/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba1;

/**
 *
 * @author alumne-DAM
 */
public class NewClass4 {
    public static void main(String[] args){
        int[][] numero = { {1,2,3}, {2,3,4} };
        int indicex = 0;
        int resultado = 0;
        while(indicex < numero.length){
            int indicey = 0;
            while (indicey < numero.length){
             resultado = resultado + (numero[indicey][indicex]);
            indicey = indicey + 1;   
            }
            indicex = indicex + 1;
        }
        System.out.println("El resultado es: " + resultado);
    }
}