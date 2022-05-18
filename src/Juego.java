/**
 * Simula el juego de Piedra, Papel o tijera
 */

package ende;

public class Juego 
{
    public static void main(String args[])
    {
        Jugador p1=new Jugador();
        Jugador p2=new Jugador();
        boolean finDeJuego=false;
        Integer Rondasjugadas = 0;    // Número de rondas jugadas
        Integer EXITOSJugador1=p1.exitos;
        Integer EXITOSJugador2=p2.exitos;
        Integer Empates = 0;
        String opcionJUGADOR1;
        String opcionJUGADOR2;
        
        // Bucle de juego
        do
        {
            System.out.println("***** Ronda: " + Rondasjugadas+" *********************\n");
            System.out.println("Numero de empates: "+ Empates + "\n");
            opcionJUGADOR1=p1.opcion_al_azar();
            System.out.println("Jugador 1: " + opcionJUGADOR1+"\t Jugador 1 - Partidas ganadas: " + EXITOSJugador1);
            opcionJUGADOR2 = p2.opcion_al_azar();
            System.out.println("Jugador 2: " + opcionJUGADOR2+"\t Jugador 2 - Partidas ganadas: " + EXITOSJugador2);
            
            if((opcionJUGADOR1.equals("piedra"))&&(opcionJUGADOR2.equals("papel")))
            {
                System.out.println("Jugador 2 GANA");
                EXITOSJugador2 = ++p2.exitos;
                
            }
            else if((opcionJUGADOR1.equals("papel"))&&(opcionJUGADOR2.equals("piedra")))
            {
            	EXITOSJugador1 = ++p1.exitos;
                System.out.println("Jugador 1 GANA");
            }
            else if((opcionJUGADOR1.equals("piedra"))&&(opcionJUGADOR2.equals("tijeras")))
            {
            	EXITOSJugador1 = ++p1.exitos;
                System.out.println("Jugador 1 GANA");
            }
            else if((opcionJUGADOR1.equals("tijeras"))&&(opcionJUGADOR2.equals("piedra")))
            {
            	EXITOSJugador2 = ++p2.exitos;
                System.out.println("Jugador 2 GANA");
            }
            else if((opcionJUGADOR1.equals("tijeras"))&&(opcionJUGADOR2.equals("papel")))
            {
            	EXITOSJugador1 = ++p1.exitos;
                System.out.println("Jugador 1 GANA");
            }
            else if((opcionJUGADOR1.equals("papel"))&&(opcionJUGADOR2.equals("tijeras")))
            {
            	EXITOSJugador2 = ++p2.exitos;
                System.out.println("Jugador 2 GANA");
            }
            if(opcionJUGADOR1==opcionJUGADOR2)
            {
            	Empates++;
                System.out.println("\n\t\t\t Empate \n");
            }
            Rondasjugadas++;
            if((p1.exitos >=3)||(p2.exitos >=3))
            {
            	finDeJuego=true;
                System.out.println("FIN DEL JUEGO!!");
            }
            System.out.println();
        } while(finDeJuego!=true);
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
        switch(c){
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
