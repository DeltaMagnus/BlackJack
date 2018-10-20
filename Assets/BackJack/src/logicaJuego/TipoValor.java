package logicaJuego;

public enum TipoValor{
  AS(11,1), DOS(2,0), TRES(3,0), CUATRO(4,0), CINCO(5,0), SEIS(6,0), SIETE(7,0), OCHO(8,0), NUEVE(9,0), JACK(10,10), REINA(10,11), REY(10,12);
  
  private int valorNum;
  private int valorNumSec;
  
  TipoValor(int valorNum1, int valorNum2){
    this.valorNum= valorNum1;
    this.valorNumSec= valorNum2;
  }
  public int getValorPrim() {
    return valorNum;
  }
  public int getValorSec() {
    return valorNumSec;
  }
}