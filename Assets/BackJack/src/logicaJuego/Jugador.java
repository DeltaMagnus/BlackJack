package logicaJuego;

import java.util.ArrayList;
import logicaJuego.Carta;
/**
 * La clase jugador es la clase cual va a manejar las manos del juego. Aqui se verificar el total en mano de 
 * cada jugador. 
 * 
 *@author James Nun
 *@version 1.0
 */
public class Jugador {
  private String nombre;
  public ArrayList<Carta>mano;
  private Estado estado;
  private int totalEnMano;
  
  public Jugador(String nombre) {
    this.nombre = nombre;
    mano = new ArrayList<Carta>();
  }
  public void aniadirMano(Carta carta) {
    mano.add(carta);
    calcularTotal();
  }
  public void manoReseteo(Baraja maso) {
    while(mano.size()!=0){
      maso.retornarCartas(mano.get(0));
      mano.remove(0);
    }
  }
  
  /**
   * Metodo para contar el valor total de las cartas en mano
   * 
   * Si el jugador tiene varios AS en la mano este metodo los toma en cuenta, ya que 
   * verifica si la proxima suma con el valor primario de la carta hace que se pase de 21.
   * 
   * 
   * */
  public void calcularTotal(){
    totalEnMano = 0;
    TipoValor tempVerificador = TipoValor.AS;
    for (int i = 0; i < mano.size(); i++){
      if(mano.get(i).getValor() == tempVerificador){
        if(verificaAs(mano.get(i).getValor().getValorPrim())) {
          totalEnMano += mano.get(i).getValor().getValorSec();
        }else {
          totalEnMano += mano.get(i).getValor().getValorPrim();
        }
      }else {
        totalEnMano += mano.get(i).getValor().getValorPrim();
      }
    }
  }
  
  /**
   * Metodo para verificar si la proxima suma de As causa que se pase de 21
   * 
   * @param valorSumado Es el proximo valor a sumar al total de la mano.
   * @return Un valor verdadero o falso para la verificacion.  
   * */
  public boolean verificaAs(int valorSumado) {
    if(totalEnMano + valorSumado > 21) {
      return true;
    }else {
      return false;
    }
  }
  public String getNombre() {
    return nombre;
  }
  public Estado getEstado() {
    return estado;
  }
  public int getTotalEnMano() {
    return totalEnMano;
  }
  public String manoToString() {
    String mensj = "";
    for (int i = 0; i < mano.size(); i++) {
      mensj += mano.get(i).toString() +"\n";
    }
    return mensj;
  }
}
