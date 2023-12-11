/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package superheroes;

public class Coleccion {
    
    public Superheroes[] superheroes;
    public String propietario;
    public String fecha;
    Superheroes[] Superheroes;
    
    /* Constructor vacio */
    public Coleccion(){
    }
    
    //Metodos de nuestra coleccion:
    
    /**
     * Pinta la info de todos los heroes.
     */
    public void pintarInfColeccion(){
        int i = 0;
        while(i < superheroes.length){
            superheroes[i].pintarInformacion();
            i++;
        }
    }
    
    /**
     * Pinta la info de todos los heroes con mas 
     * fuerza que el valor de @fuerza.
     * @param fuerza 
     */
    public void pintarInfColeccion(int fuerza){
        int i = 0;
        while(i < superheroes.length){
            if(superheroes[i].fuerza > fuerza){
                superheroes[i].pintarInformacion();
            }
            
            i++;
        }
    }
}