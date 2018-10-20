package logicaJuego;

import java.util.ArrayList;
import java.util.Collections;
import logicaJuego.Carta;

/**
 * La clase baraja es donde se encontraran todas las 52 cartas del juego
 * 
 * @author James Nun
 * @version 1.0
 * */
 
public class Baraja {
  private ArrayList<Carta> cartas;
  
  public Baraja(){
    cartas = new ArrayList<Carta>();
    for (TipoCarta tipo : TipoCarta.values()) {
      for (TipoValor valor : TipoValor.values()) {
        cartas.add(new Carta(tipo, valor));
      }
    }
  }
  /**
   * Este metodo es el que se encarga de barajar el deck
   * 
   * */
  public void barajar() {
    Collections.shuffle(cartas);
  }
  /**
   * Este metodo saca una carta del maso y borra la carta del maso para que no se vuelva a tomar
   * 
   * @return La carta que se tomo, la maso estar barajeado, se puede tomar una carta cualquiera del maso*/
  public Carta tomarCarta(){
    Carta cartaAdquirida = new Carta(cartas.get(0).getTipo(),cartas.get(0).getValor());
    cartas.remove(0);
    return cartaAdquirida;
  }
  /**
   * Este metodo da el indice del maso actual
   * 
   * @return El numero de indices disponibles*/
  public int indiceDisponible() {
    return cartas.size();
  }
  
  public void retornarCartas(Carta carta) {
    cartas.add(carta);
  }
}
  
