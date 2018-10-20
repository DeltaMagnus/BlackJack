package logicaJuego;

import java.util.ArrayList;
import logicaJuego.Card;
/**
 * This class is going to manage the player, his current hand, score and state.
 * 
 *@author James Nun
 *@version 1.0
 */
public class Player {
  private String username ;
  public ArrayList<Card>hand;
  private Status state;
  private int score;
  
  public Player(String username ) {
    this.username  = username ;
    hand = new ArrayList<Card>();
  }
  public void addCard(Card card) {
    hand.add(card);
    addScore();
  }
  public void resetHand(Deck maso) {
    while(hand.size()!=0){
      maso.shuffleCardToDeck(hand.get(0));
      hand.remove(0);
    }
  }
  
  /**
   * Method to evaluate the score on the hand
   * 
   * If the player happens to have various ace's on hand this method also values this so that it doesn't get past 
   * The some of 21 for the game of BlackJack.
   * 
   * */
  public void addScore(){
    score = 0;
    TypeValue tempVerificador = TypeValue.ACE;
    for (int i = 0; i < hand.size(); i++){
      if(hand.get(i).getValue() == tempVerificador){
        if(verificaAs(hand.get(i).getValue().getValuePrim())) {
          score += hand.get(i).getValue().getValueSec();
        }else {
          score += hand.get(i).getValue().getValuePrim();
        }
      }else {
        score += hand.get(i).getValue().getValuePrim();
      }
    }
  }
  
  /**
   * This method is to verify if the next sum makes the score go over 21
   * 
   * @param addedValue The next value to be added.
   * @return A Boolean value to determine if it goes past 21.  
   * */
  public boolean verificaAs(int addedValue) {
    if(score + addedValue > 21) {
      return true;
    }else {
      return false;
    }
  }
  
  public String getUsername () {
    return username ;
  }
  
  public Status getEstado() {
    return state;
  }
  
  public int getScore() {
    return score;
  }
  
  public String handToString() {
    String mensj = "";
    for (int i = 0; i < hand.size(); i++) {
      mensj += hand.get(i).toString() +"\n";
    }
    return mensj;
  }
}
