/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionario;

import Carro.Camioneta;
import Carro.Color;
import Carro.Coupe;
import Carro.Sedan;
import Carro.Serie5;
import Carro.X5;
import Carro.Z4;

/**
 *
 * @author jgale
 */
public class FabricaBMW extends FabricaModelos{

    @Override
    public Sedan crearSedan(Color color) {
        return new Serie5(color);
    }

    @Override
    public Coupe crearCoupe(Color color) {
        return new Z4(color);
    }

    @Override
    public Camioneta crearCamioneta(Color color) {
        return new X5(color);
    }
    
}
