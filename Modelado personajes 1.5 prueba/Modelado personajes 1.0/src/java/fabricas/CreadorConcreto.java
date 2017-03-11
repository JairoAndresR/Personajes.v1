/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricas;

import creadores.CreadorPersonaje;
import creadores.Director;
import javax.swing.JOptionPane;
import producto.Personaje;

/**
 *
 * @author Usuario
 */
public class CreadorConcreto extends CreadorAbstracto {

    @Override
    public Fabrica crearFabrica() {
        Fabrica fab = null;

        //Se eavlua el String (Raza) para generar la fabrica correspondiente
        switch (raza) {
            case "Humano":
                fab = FabricaHumano.getInstance();
                break;
            case "Elfo":
                fab = FabricaElfo.getInstance();
                break;
            case "Enano":
                fab = FabricaEnano.getInstance();
                break;
            case "Hechicero":
                fab = FabricaHechicero.getInstance();
                break;
            default:
                JOptionPane.showMessageDialog(null, "No se eligio personaje");
        }
        return fab;
    }

}
