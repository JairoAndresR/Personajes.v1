/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricas;

import componentes.Arma;
import componentes.Cuerpo;
import componentes.Escudo;
import componentes.Montura;

/**
 *
 * @author JULIAN
 */
public interface Fabrica {
    
    public Cuerpo crearCuerpo();
    public Arma crearArma();
    public Escudo crearEscudo();
    public Montura crearMontura();
    
}
