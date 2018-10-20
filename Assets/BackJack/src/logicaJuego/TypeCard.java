package logicaJuego;

/**
 * Types of cards that can be within a deck.
 * 
 * */
public enum TypeCard{
  /**
   * The Diamond card.
   * */
  DIAMOND("diamond"),
  
  /**
   * The Heart card.
   * */
  HEART("heart"),
  
  /**
   * The Clover card
   * */
  CLOVER("clover"),
  
  /**
   * The Spade card.
   * */
  SPADE("spade");
  
  String cardName;
  
  /**
   * This constructor was made in order to find the appropriate images in a file.
   * */
  TypeCard(String name){
    this.cardName = name;
  }
  
  public String getCardName() {
    return cardName;
  }
}
