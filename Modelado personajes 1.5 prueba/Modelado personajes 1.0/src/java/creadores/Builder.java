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
public abstract class Builder {
    protected Personaje personaje;

    public Personaje getPersonaje() {
        return personaje;
    }
    
    public void crearPersonaje(){
        personaje= new Personaje();
    }
    
    
    public abstract void crearArma();
    public abstract void crearEscudo();
    public abstract void crearMontura();
    public abstract void crearCuerpo();
}
