package logicaJuego;
/**
 * La clase Carta es la clase cual va a representar cada carta
 *
 *@author James Nun
 *@version 1.0
 */
public class Carta {
  private TipoCarta tipo;
  private TipoValor valor;
  
  
  public Carta(TipoCarta tipo, TipoValor valor) {
    this.tipo = tipo;
    this.valor = valor;  
  }

  public TipoCarta getTipo() {
    return tipo;
  }

  public TipoValor getValor() {
    return valor;
  }
  
  public String toString() {
    String mensaje = "Carta: "+ tipo + " : "+ valor;
    return mensaje;
  }
}
