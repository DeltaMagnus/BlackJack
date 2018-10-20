package logicaJuego;

public class main {

  public static void main(String[] args) {
    Jugador player1 = new Jugador("James");
    
    Baraja deck = new Baraja();
    deck.barajar();
    
    
    Carta carta = deck.tomarCarta();
    Carta carta1 = deck.tomarCarta();
    Carta carta2 = deck.tomarCarta();
    player1.aniadirMano(carta);
    player1.aniadirMano(carta1);
    player1.aniadirMano(carta2);
    System.out.println(player1.mano.get(0).toString());
    System.out.println(player1.mano.get(1).toString());
    System.out.println(player1.mano.get(2).toString());
    System.out.println("El total es: " + player1.getTotalEnMano());
  }

}
