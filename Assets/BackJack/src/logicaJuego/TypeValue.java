package logicaJuego;

public enum TypeValue{
  /**
   * The Ace value of 1 or 11.
   * */
  ACE(11,1),
  
  /**
   * The two value.
   * */
  TWO(2,0),
  
  /**
   * The three value.
   * */
  THREE(3,0),
  
  /**
   * The four value.
   * */
  FOUR(4,0),
  
  /**
   * The five value.
   * */
  FIVE(5,0),
  
  /**
   * The six value.
   * */
  SIX(6,0),
  
  /**
   * The seven value.
   * */
  SEVEN(7,0),
  
  /**
   * The eight value.
   * */
  EIGHT(8,0),
  
  /**
   * The nine value.
   * */
  NINE(9,0),
  
  /**
   * The Royal Jack.
   * */
  JACK(10,11),
  
  /**
   * The Royal Queen.
   * */
  QUEEN(10,12),
  
  /**
   * The Royal King.
   * */
  KING(10,13);
  
  private int valueNum;
  private int valueNumSec;
  
  /**
   * An enum constructor to have 2 possible values of values when verifying for ace, jacks, queens and kings.
   * */
  TypeValue(int valorNum1, int valorNum2){
    this.valueNum= valorNum1;
    this.valueNumSec= valorNum2;
  }
  
  public int getValuePrim() {
    return valueNum;
  }
  
  public int getValueSec() {
    return valueNumSec;
  }
}