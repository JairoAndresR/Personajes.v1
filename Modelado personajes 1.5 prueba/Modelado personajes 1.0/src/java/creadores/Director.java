/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creadores;

import producto.Personaje;

/**
 *
 * @author Estudiantes
 */
public class Director {
    private Builder constructor;
    
    public void crearPersonaje(){
        constructor.crearPersonaje();
        constructor.crearCuerpo();
        constructor.crearArma();
        constructor.crearEscudo();
        constructor.crearMontura();
    }

    public void setBuilder(Builder modelo) {
        constructor = modelo;
    }
    
    //Metodo para acceder al personaje
    public Personaje getPersonaje(){
        return constructor.getPersonaje();
    }
}
