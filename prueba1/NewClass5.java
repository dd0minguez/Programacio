/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba1;

/**
 *
 * @author alumne-DAM
 */
public class NewClass5 {
    public static void main(String[] args){
        int [][] tabla = { {1,1,1}, {1,1,1}, {1,1,1} }; 
        int indicex = 0;
        int total = 0;
        while (indicex < tabla.length){
            int indicey = 0;
            while (indicey < tabla[indicex].length){
                total = total + (tabla [indicey][indicex]);
                indicey = indicey + 1 ;
                
            }
            indicex = indicex + 1 ;
        }
        System.out.println("La suma es: " + total);
    }
}
