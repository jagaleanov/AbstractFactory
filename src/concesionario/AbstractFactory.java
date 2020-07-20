/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionario;

import Carro.Camioneta;
import Carro.Carro;
import Carro.Color;
import Carro.Coupe;
import Carro.Sedan;

/**
 *
 * @author jgale
 */
public class AbstractFactory {

    public Carro crearCarro(String marca, String tipo, Color color) {
        
        FabricaModelos fab;
        Sedan s;
        Coupe c;
        Camioneta k;
        
        switch (marca) {
            case "Ford":
                fab = new FabricaFord();
                break;
            case "Fiat":
                fab = new FabricaFiat();
                break;
            case "BMW":
                fab = new FabricaBMW();
                break;
            default:
                fab = null;
        }
        
        s = fab.crearSedan(color);
        c = fab.crearCoupe(color);
        k = fab.crearCamioneta(color);
        
        switch (tipo) {
            case "Sedan":
                return s;
            case "Coupe":
                return c;
            case "Camioneta":
                return k;
            default:
                return null;
        }
    }
}
