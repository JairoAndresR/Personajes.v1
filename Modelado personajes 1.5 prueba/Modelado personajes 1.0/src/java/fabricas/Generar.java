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
import creadores.CreadorPersonaje;
import creadores.Director;
import fabricas.Fabrica;
import fabricas.FabricaElfo;
import fabricas.FabricaEnano;
import fabricas.FabricaHechicero;
import fabricas.FabricaHumano;
import producto.Personaje;

/**
 *
 * @author Andres
 */
public class Generar {

    String personaje;
    Fabrica fabrica = null;
    Escudo escudo;
    Arma arma;
    Cuerpo cuerpo;
    Montura montura;
    protected String escudos;
    protected String cuerpos;
    protected String monturas;
    protected String armas;

    //Recibimos el string con el personaje seleccionado
    public Generar(String personaje) {
        this.personaje = personaje;
    }

    public void generador() {
        Personaje personajeFinal;
        CreadorConcreto creador = new CreadorConcreto();
        Director director = new Director();
        creador.raza = personaje;//Enviar el String con el personaje para generar la fabrica
        fabrica = creador.crearFabrica();//Generar la fabrica respectiva y almacenarla
        director.setBuilder(new CreadorPersonaje(fabrica));//Le enviamos la fabrica del personaje seleccionada al director
        director.crearPersonaje();//El director crea el personaje
        personajeFinal = director.getPersonaje();//Se almacena el personaje

        //Se asignan cada uno de sus atributos
        try {
            arma = personajeFinal.getArma();
            cuerpo = personajeFinal.getCuerpo();
            montura = personajeFinal.getMontura();
            escudo = personajeFinal.getEscudo();
            escudos = escudo.operacion();
            cuerpos = cuerpo.operacion();
            monturas = montura.operacion();
            armas = arma.operacion();

        } catch (Exception e) {
            System.out.println("no hizo la asignacion");
        }

    }

    //Metodos para acceder a los atributos del personaje
    public String getEscudos() {
        return escudos;
    }

    public String getCuerpos() {
        return cuerpos;
    }

    public String getMonturas() {
        return monturas;
    }

    public String getArmas() {
        return armas;
    }

}
