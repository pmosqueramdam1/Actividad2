/**
 * Simula el juego de Piedra, Papel o tijera
 */

package ende;

public class Juego 
{
    public static void main(String args[])
    {
        Jugador p1 = new Jugador();
        Jugador p2 = new Jugador();
        boolean finDeJuego=false;
        int rondasJugadas = 0;    // Número de rondas jugadas
        int ExitosJugador1 = p1.exitos;
        int ExitosJugador2 = p2.exitos;
        int Empates = 0;
        String opcionJugador1;
        String opcionJugador2;
        
        // Bucle de juego
        do
        {
            System.out.println("***** Ronda: " + rondasJugadas+" *********************\n");
            System.out.println("Numero de empates: "+ Empates + "\n");
            opcionJugador1 = p1.opcion_al_azar();
            System.out.println("Jugador 1: " + opcionJugador1+"\t Jugador 1 - Partidas ganadas: " + ExitosJugador1);
            opcionJugador2 = p2.opcion_al_azar();
            System.out.println("Jugador 2: " + opcionJugador2+"\t Jugador 2 - Partidas ganadas: " + ExitosJugador2);
            
            if((opcionJugador1.equals("piedra")) && (opcionJugador2.equals("papel")))
            {
                System.out.println("Jugador 2 GANA");
                ExitosJugador2 = ++p2.exitos;
                
            }
            else if((opcionJugador1.equals("papel")) && (opcionJugador2.equals("piedra")))
            {
            	ExitosJugador1 = ++p1.exitos;
                System.out.println("Jugador 1 GANA");
            }
            else if((opcionJugador1.equals("piedra")) && (opcionJugador2.equals("tijeras")))
            {
            	ExitosJugador1 = ++p1.exitos;
                System.out.println("Jugador 1 GANA");
            }
            else if((opcionJugador1.equals("tijeras")) && (opcionJugador2.equals("piedra")))
            {
            	ExitosJugador2 = ++p2.exitos;
                System.out.println("Jugador 2 GANA");
            }
            else if((opcionJugador1.equals("tijeras")) && (opcionJugador2.equals("papel")))
            {
            	ExitosJugador1 = ++p1.exitos;
                System.out.println("Jugador 1 GANA");
            }
            else if((opcionJugador1.equals("papel")) && (opcionJugador2.equals("tijeras")))
            {
            	ExitosJugador2 = ++p2.exitos;
                System.out.println("Jugador 2 GANA");
            }
            if(opcionJugador1==opcionJugador2)
            {
            	Empates++;
                System.out.println("\n\t\t\t Empate \n");
            }
            rondasJugadas++;
            if((p1.exitos >= 3) || (p2.exitos >= 3))
            {
            	finDeJuego=true;
                System.out.println("FIN DEL JUEGO!!");
            }
            System.out.println();
        }
        while(finDeJuego!=true);
    }
}
/**
 * Escoge piedra, papel o tijera al azar
 */
class Jugador{

    int exitos;      // número de partidas ganadas
    int winTotal;

    public void setExitos()
    {
        exitos++;
    }
    public int getExitos()
    {
        return(exitos);
    }
    public String opcion_al_azar()
    {
        String opcion="";
        Integer c = (int)(Math.random()*3);
        switch(c) {
            case 0:
            	opcion=("piedra");
                break;
            case 1:
            	opcion=("papel");
                break;
            case 2:
            	opcion=("tijeras");
        }
        return opcion;
    }
}
