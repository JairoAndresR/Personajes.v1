/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creadores;

import componentes.Arma;
import componentes.Cuerpo;
import componentes.Escudo;
import componentes.Montura;
import fabricas.CreadorConcreto;
import fabricas.Fabrica;
import fabricas.FabricaElfo;
import fabricas.FabricaHumano;

/**
 *
 * @author Estudiantes
 */
public class CreadorPersonaje extends Builder{
    
    Fabrica fabrica;
    CreadorConcreto objeto=new CreadorConcreto();
    
    //Se recibe la fabrica para  armar el personaje
    public CreadorPersonaje(Fabrica fabrica){
        this.fabrica=fabrica;
    }
    
    //Se agregan los elementos al esqueleto del personaje
    @Override
    public void crearArma() {
        personaje.setArma((Arma) fabrica.crearArma());
    }

    @Override
    public void crearEscudo() {
        personaje.setEscudo((Escudo) fabrica.crearEscudo());
    }

    @Override
    public void crearMontura() {
        personaje.setMontura((Montura) fabrica.crearMontura());
    }

    @Override
    public void crearCuerpo() {
        personaje.setCuerpo((Cuerpo) fabrica.crearCuerpo());
    }
    
}
