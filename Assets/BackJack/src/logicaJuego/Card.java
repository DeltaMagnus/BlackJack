package logicaJuego;
/**
 * The Card class is the representation of each card.
 *
 *@author James Nun
 *@version 1.0
 */
public class Card implements java.io.Serializable{
  private TypeCard type;
  private TypeValue value;
  
  
  public Card(TypeCard type, TypeValue value)  {
    this.type = type;
    this.value = value;  
  }

  public TypeCard getType() {
    return type;
  }

  public TypeValue getValue() {
    return value;
  }
  
  public String toString() {
    String msg = "Card: "+ type + " : "+ value;
    return msg;
  }
  public String getStringName() {
    TypeValue verifyer = null;
    String msg = "";
    if(this.getValue() == verifyer.JACK || this.getValue() == verifyer.QUEEN || this.getValue() == verifyer.KING || this.getValue() == verifyer.ACE){
      msg += "card"+"_"+this.getValue().getValueSec()+"_"+this.getType().getCardName();
    }else {
      msg += "card"+"_"+this.getValue().getValuePrim()+"_"+this.getType().getCardName();
    }
    return msg;
  }
}
