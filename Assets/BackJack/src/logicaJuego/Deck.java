package logicaJuego;

import java.util.ArrayList;
import java.util.Collections;
import logicaJuego.Card;

/**
 * The Deck class is where all the playable cards are. 
 * 
 * @author James Nun
 * @version 20-Oct-2018
 * */
 
public class Deck {
  private ArrayList<Card> deck;
  
  public Deck(){
    deck = new ArrayList<Card>();
    for (TypeCard tipo : TypeCard.values()) {
      for (TypeValue valor : TypeValue.values()) {
        deck.add(new Card(tipo, valor));
      }
    }
  }
  
  /**
   * This method shuffles the deck
   * 
   * */
  public void shuffleDeck() {
    Collections.shuffle(deck);
  }
  
  /**
   * This method gets a card from the deck and deletes it from the deck, so that no duplicate cards are in play
   * 
   * @return The drawn card, while the deck is already shuffles it matters not what card gets drawn*/
  public Card drawCard(){
    Card cartaAdquirida = new Card(deck.get(0).getType(),deck.get(0).getValue());
    deck.remove(0);
    return cartaAdquirida;
  }
  
  /**
   * This method gives the current available index on the array of cards
   * 
   * @return the available index in the array*/
  public int availableIndex() {
    return deck.size();
  }
  
  public void shuffleCardToDeck(Card card) {
    deck.add(card);
    Collections.shuffle(deck);
  }
}
  
