/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionario;

import Carro.Camioneta;
import Carro.Color;
import Carro.Coupe;
import Carro.Focus;
import Carro.Palio;
import Carro.Sedan;
import Carro.Siena;
import Carro.Strada;

/**
 *
 * @author jgale
 */
public class FabricaFiat extends FabricaModelos{

    @Override
    public Sedan crearSedan(Color color) {
        return new Siena(color);
    }

    @Override
    public Coupe crearCoupe(Color color) {
        return new Palio(color);
    }

    @Override
    public Camioneta crearCamioneta(Color color) {
        return new Strada(color);
    }
    
}
