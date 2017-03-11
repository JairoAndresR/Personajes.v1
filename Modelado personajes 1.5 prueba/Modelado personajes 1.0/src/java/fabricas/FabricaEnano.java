/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricas;

import componentes.Arma;
import componentes.ArmaEnano;
import componentes.Cuerpo;
import componentes.CuerpoEnano;
import componentes.Escudo;
import componentes.EscudoEnano;
import componentes.Montura;
import componentes.MonturaEnano;

/**
 *
 * @author JULIAN
 */
public class FabricaEnano implements Fabrica {
    
    private static FabricaEnano enano;   
    
    private FabricaEnano(){
        
    }
    //Singleton
    public static FabricaEnano getInstance(){
        if(enano==null){
            enano= new FabricaEnano();
        }
        return enano;
    }
    @Override
    public Cuerpo crearCuerpo() {
        return (Cuerpo) new CuerpoEnano();//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Arma crearArma() {
        return (Arma) new ArmaEnano();//To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Escudo crearEscudo() {
        return (Escudo) new EscudoEnano(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Montura crearMontura() {
        return (Montura) new MonturaEnano(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
