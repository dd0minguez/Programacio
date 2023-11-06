/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba1;

/**
 *
 * @author alumne-DAM
 */
public class Prueba1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Tot lo que escrigui aqui dins se executara

        boolean aprovat = true;
        int dia = 5;
        double preu = 12.5;
        char etiqueta = 'P';
        String frase = "Hola soc en luc";
        String fraseAmbNumero = frase + " " + dia;
        
        System.out.println(fraseAmbNumero);
        System.out.println("Adeu");
        
        int b = 10;
        int resultat1 = (b/2) - 4;
        System.out.println("El resultat es: " + resultat1);
        
        int x = 1;
        int y = 2;
        int resultat2 = ((3*x*y) - (5*x) + (12*x) - 17);
        System.out.println("El resultat es: " + resultat2 );
        
        double radio = 4.5;
        double pi = Math.PI;
        double longitud = (2 * pi * radio);
        double area = (pi * radio * radio);
        System.out.println("La longitud es: " + longitud);
        System.out.println("El area es: " + area);
        
        int num = 2;
        if (num % 2 == 0) {
        System.out.println("Es parell");
    } if (num % 3 == 0) {
        
        System.out.println("Es imparell");
     }
    
}