import java.util.Random;
import java.util.Scanner;

public class MonkeyIsland {
    public static void main(String[] args) {
        // TODO code application logic here
        int partida = 0;
        int JugWin = 0;
        int OrdWin = 0;
        boolean jugadorInicial = true;
        while (JugWin < 3 && OrdWin<3) {
            if( jugadorInicial == true){
                String[] insultos = {
                    "¿Has dejado ya de usar pañales?",
                    "¡No hay palabras para describir lo asqueroso que eres!",
                    "¡He hablado con simios más educados que tú!",
                    "¡Eres como un dolor en la parte baja de la espalda!"
                };
                String[] contestaciones = {
                    "¿Por qué? ¿Acaso querías pedir uno prestado?",
                    "Si que las hay, sólo que nunca las has aprendido.",
                    "Me alegra que asistieras a tu reunión familiar diaria.",
                    "Ya te están fastidiando otra vez las almorranas, ¿Eh?"
                };
                System.out.println("Los insultos son:" + insultos[0]);
                System.out.println(insultos[1]);
                System.out.println(insultos[2]);
                System.out.println(insultos[3]);
                System.out.println("Las contestaciones son:" + contestaciones[0]);
                System.out.println(contestaciones[1]);
                System.out.println(contestaciones[2]);
                System.out.println(contestaciones[3]);
                System.out.println("Escribe tu opcion:");
                Scanner escaner = new Scanner(System.in);
                int respuestaJugador = escaner.nextInt();
                System.out.println("Tu opción es: " + insultos[respuestaJugador]);
                Random rand = new Random();
                int ordenador = rand.nextInt(4);
                System.out.println("El contrincante ha elegido: " + contestaciones[ordenador]);
                if (respuestaJugador == ordenador) {
                    System.out.println("Ha ganado el ordenador");
                    OrdWin++;
                } else {
                    System.out.println("Has ganado");
                    JugWin++;
                }
                jugadorInicial =false;
            } //jugadorInicial =false; 
            else {
                String[] insultos = {
                    "¿Has dejado ya de usar pañales?",
                    "¡No hay palabras para describir lo asqueroso que eres!",
                    "¡He hablado con simios más educados que tú!",
                    "¡Eres como un dolor en la parte baja de la espalda!"
                };
                String[] contestaciones = {
                    "¿Por qué? ¿Acaso querías pedir uno prestado?",
                    "Si que las hay, sólo que nunca las has aprendido.",
                    "Me alegra que asistieras a tu reunión familiar diaria.",
                    "Ya te están fastidiando otra vez las almorranas, ¿Eh?"
                };
                System.out.println("Los insultos son:" + insultos[0]);
                System.out.println(insultos[1]);
                System.out.println(insultos[2]);
                System.out.println(insultos[3]);
                System.out.println("Las contestaciones son:" + contestaciones[0]);
                System.out.println(contestaciones[1]);
                System.out.println(contestaciones[2]);
                System.out.println(contestaciones[3]);
                Random rand = new Random();
                int ordenador = rand.nextInt(4);
                System.out.println("El contrincante ha elegido: " + contestaciones[ordenador]);
                System.out.println("Escribe tu opcion:");
                Scanner escaner = new Scanner(System.in);
                int respuestaJugador = escaner.nextInt();
                System.out.println("Tu opción es: " + insultos[respuestaJugador]);
                if (ordenador == respuestaJugador) {
                    System.out.println("Has ganado");
                    JugWin++;
                } else {
                    System.out.println("Ha ganado el ordenador");
                    OrdWin++;
                }
            jugadorInicial =true;    
            }
            partida++;
        }
            if (JugWin == 3) {
                System.out.println("Has ganado");
            } else {
                System.out.println("Ha ganado el ordenador");
            }
    }
}
            
            //String[] insultos = {
              //  "¿Has dejado ya de usar pañales?",
                //"¡No hay palabras para describir lo asqueroso que eres!",
                //"¡He hablado con simios más educados que tú!",
                //"¡Eres como un dolor en la parte baja de la espalda!"
            //};
            //String[] contestaciones = {
              //  "¿Por qué? ¿Acaso querías pedir uno prestado?",
                //"Si que las hay, sólo que nunca las has aprendido.",
                //"Me alegra que asistieras a tu reunión familiar diaria.",
                //"Ya te están fastidiando otra vez las almorranas, ¿Eh?"
            //};
            //System.out.println("Los insultos son:" + insultos[0]);
            //System.out.println(insultos[1]);
            //System.out.println(insultos[2]);
            //System.out.println(insultos[3]);
            //System.out.println("Las contestaciones son:" + contestaciones[0]);
            //System.out.println(contestaciones[1]);
            //System.out.println(contestaciones[2]);
            //System.out.println(contestaciones[3]);
            //System.out.println("Escribe tu opcion:");
            //Scanner escaner = new Scanner(System.in);
            //int respuestaJugador = escaner.nextInt();
            //System.out.println("Tu opción es: " + insultos[respuestaJugador]);
            //Random rand = new Random();
            //int ordenador = rand.nextInt(4);
            //System.out.println("El contrincante ha elegido: " + contestaciones[ordenador]);
            //if (respuestaJugador == ordenador) {
            //    System.out.println("Ha ganado el ordenador");
             //   OrdWin++;
            //} else {
            //    System.out.println("Has ganado");
             //   JugWin++;
            //}
        //    partida++;
        //}
        //if (OrdWin == 3) {
         //   System.out.println("Ha ganado el ordenador");
     
   //     } else {
     //       System.out.println("Has ganado");
       // }
    //}
//}

