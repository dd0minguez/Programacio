/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package superheroes;

public class Superherores {
    
    public String nombre;
    public String descripcion;
    public String[] habilidades;
    public String rareza; //comun, epico, legendario
    public String tipo;
    public int fuerza; //De 0 a 10
    public int vida; //De 0 a 10
    
    /* COnstructor con parámetros base */
    public void Superheroes(String nombre, int fuerza, int vida){
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.vida = vida;
        this.rareza = "comun";
    }
    
    /* Constructor vacio */
    public void Superheroes(){
        this.rareza = "comun";
    }
    
    //Metodos de la classe superheroe:
    
    /**
     * Pinta el nombre del Superheroe y sus estadisticas
     */
    public void pintarInformacion(){
        System.out.println(nombre + " - " + descripcion);
        System.out.println("Fuerza: " + fuerza);
        System.out.println("Vida: " + vida);
    }
}