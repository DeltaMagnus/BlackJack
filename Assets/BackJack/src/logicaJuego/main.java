package logicaJuego;

public class main {

  public static void main(String[] args) {
    Jugador player1 = new Jugador("James");
    
    Baraja deck = new Baraja();
    deck.barajar();
    
    System.out.println("Indice de cartas al crearse : "+deck.indiceDisponible());
    Carta carta = deck.tomarCarta();
    Carta carta1 = deck.tomarCarta();
    Carta carta2 = deck.tomarCarta();
    System.out.println("Indice de cartas al crear mano : "+deck.indiceDisponible());
    player1.aniadirMano(carta);
    player1.aniadirMano(carta1);
    player1.aniadirMano(carta2);
    System.out.println(player1.manoToString());
    System.out.println("El total es: " + player1.getTotalEnMano());
    player1.manoReseteo(deck);
    System.out.println("Indice de cartas al Retornalas : "+deck.indiceDisponible());
  }
 
}
