/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package superheroes;

public class Cartas {
    
    public static void main(String[] args) {
        //Inicializamos nuestra coleccion de heroes:
        Coleccion marvel = crearColeccionMarvel();
        
        //Pintamos todos los Superheroes de nuestra coleccion:
        marvel.pintarInfColeccion();
        
        //Per fer:
        //Crida a un metode dins Coleccio, que pinti amb un println()
        //quina es la major força dins la nostra coleccio
        
        //Per fer:
        //Crida a un metode dins Coleccio, que pinti amb un println()
        //quin es el superheroe amb major vida i quin valor te vida

        
    }
    
    /**
     * Inicializa nuestra coleccion de superheroes de marvel
     * @return 
     */
    public static Coleccion crearColeccionMarvel(){
        //Creamos los Superheroes:
        Superheroes spiderman = new Superheroes(null, 0, 0);
        spiderman.nombre = "Spiderman";
        spiderman.descripcion = "Tu amigo y vecino Spiderman";
        spiderman.vida = 7;
        spiderman.fuerza = 5;
        String[] habilidadesSpiderman = {"Sentido arácnido", "Telarañas"};
        spiderman.habilidades = habilidadesSpiderman;

        Superheroes ironman = new Superheroes("Ironman", 7, 7);
        ironman.descripcion = "Tecnologia Stark";
        ironman.rareza = "epico";
        ironman.habilidades = new String[]{"Volar", "Super fuerza"};
        
        Superheroes thor = new Superheroes("Thor", 7, 8);
        thor.descripcion = "Thor, hijo de Odín";
        thor.rareza = "legendario";
        thor.habilidades = new String[]{"Volar", "Super fuerza", "Martillo"};
        
        //Creamos la Coleccion con los superheroes anteriores:
        Coleccion coleccion = new Coleccion();
        coleccion.Superheroes = new Superheroes[]{spiderman, ironman, thor};
        return coleccion;
    }
    
}