/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricas;

import componentes.Cuerpo;
import componentes.CuerpoHumano;
import componentes.Escudo;
import componentes.EscudoHumano;
import componentes.Arma;
import componentes.ArmaHumano;
import componentes.Montura;
import componentes.MonturaHumano;

/**
 *
 * @author JULIAN
 */
public class FabricaHumano implements Fabrica {

    private static FabricaHumano human;   
        
    private FabricaHumano(){
        
    }
    //Singleton
    public static FabricaHumano getInstance(){
        if(human==null){
            human= new FabricaHumano();
        }
        return human;
    }
    
    @Override
    public Cuerpo crearCuerpo() {
        return new CuerpoHumano();//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Arma crearArma() {
        return new ArmaHumano();//To change body of generated methods, choose Tools | Templates.
    }

    
    @Override
    public Escudo crearEscudo() {
        return new EscudoHumano(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Montura crearMontura() {
        return new MonturaHumano(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
