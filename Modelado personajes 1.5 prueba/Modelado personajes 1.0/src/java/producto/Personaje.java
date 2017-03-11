/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package producto;

import componentes.Arma;
import componentes.Cuerpo;
import componentes.Escudo;
import componentes.Montura;

/**
 *
 * @author Estudiantes
 */
public class Personaje {
    //Atributos del personaje
    private Cuerpo cuerpo;
    private Arma arma;
    private Montura montura;
    private Escudo escudo;

    //Metodos get y set
    public Cuerpo getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(Cuerpo cuerpo) {
        this.cuerpo = cuerpo;
    }

    public Montura getMontura() {
        return montura;
    }

    public void setMontura(Montura montura) {
        this.montura = montura;
    }

    public Escudo getEscudo() {
        return escudo;
    }

    public void setEscudo(Escudo escudo) {
        this.escudo = escudo;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

   
   
    
    
}
