/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricas;

import producto.Personaje;

/**
 *
 * @author Andres
 */
public abstract class CreadorAbstracto {
    protected String raza;

    public void setPersonaje(String raza) {
        this.raza = raza;
    }
    
    public abstract Fabrica crearFabrica();     
   
}

