/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricas;

import componentes.Arma;
import componentes.ArmaHechicero;
import componentes.Cuerpo;
import componentes.CuerpoHechicero;
import componentes.Escudo;
import componentes.EscudoHechicero;
import componentes.Montura;
import componentes.MonturaHechicero;

/**
 *
 * @author JULIAN
 */
public class FabricaHechicero implements Fabrica{
    
    private static FabricaHechicero hechicero;   
    
    private FabricaHechicero(){
        
    }
    //Singleton
    public static FabricaHechicero getInstance(){
        if(hechicero==null){
            hechicero= new FabricaHechicero();
        }
        return hechicero;
    }
    
    @Override
    public Cuerpo crearCuerpo() {
        return (Cuerpo) new CuerpoHechicero();//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Arma crearArma() {
        return (Arma) new ArmaHechicero();//To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Escudo crearEscudo() {
        return (Escudo) new EscudoHechicero(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Montura crearMontura() {
        return (Montura) new MonturaHechicero(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
