/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionario;

import Carro.Camioneta;
import Carro.Color;
import Carro.Coupe;
import Carro.Ecosport;
import Carro.Fiesta;
import Carro.Focus;
import Carro.Sedan;

/**
 *
 * @author jgale
 */
public class FabricaFord extends FabricaModelos{

    @Override
    public Sedan crearSedan(Color color) {
        return new Focus(color);
    }

    @Override
    public Coupe crearCoupe(Color color) {
        return new Fiesta(color);
    }

    @Override
    public Camioneta crearCamioneta(Color color) {
        return new Ecosport(color);
    }
    
}
