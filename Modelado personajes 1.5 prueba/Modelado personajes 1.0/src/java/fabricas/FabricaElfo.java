/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricas;

import componentes.Arma;
import componentes.ArmaElfo;
import componentes.Cuerpo;
import componentes.CuerpoElfo;
import componentes.Escudo;
import componentes.EscudoElfo;
import componentes.Montura;
import componentes.MonturaElfo;

/**
 *
 * @author JULIAN
 */
public class FabricaElfo implements Fabrica {
    
    private static FabricaElfo elfo;   
    
    private FabricaElfo(){
        
    }
    //Singleton
    public static FabricaElfo getInstance(){
        if(elfo==null){
            elfo= new FabricaElfo();
        }
        return elfo;
    }
    @Override
    public Cuerpo crearCuerpo() {
        return (Cuerpo) new CuerpoElfo();//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Arma crearArma() {
        return (Arma) new ArmaElfo();//To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Escudo crearEscudo() {
        return (Escudo) new EscudoElfo(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Montura crearMontura() {
        return (Montura) new MonturaElfo(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
