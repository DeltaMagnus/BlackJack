package logicaJuego;

public class main {

  public static void main(String[] args) {
    Player player1 = new Player("James");
    
    Deck deck = new Deck();
    deck.shuffleDeck();
    
    System.out.println("Indice de cartas al crearse : "+deck.availableIndex());
    Card card = deck.drawCard();
    Card carta1 = deck.drawCard();
    Card carta2 = deck.drawCard();
    //System.out.println(card.toString()+"\n");
    //System.out.println(card.getStringName()+"\n");
    //System.out.println(carta1.toString()+"\n");
    //System.out.println(carta1.getStringName()+"\n");
    //System.out.println(carta2.toString()+"\n");
    //System.out.println(carta2.getStringName());
    System.out.println("Indice de cartas al crear mano : "+deck.availableIndex());
    player1.addCard(card);
    player1.addCard(carta1);
    player1.addCard(carta2);
    System.out.println(player1.handToString());
    System.out.println("El total es: " + player1.getScore());
    player1.resetHand(deck);
    System.out.println("Indice de cartas al Retornalas : "+deck.availableIndex());
  }
 
}
