/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionario;

import Carro.Azul;
import Carro.Color;
import Carro.Rojo;
import Carro.Verde;

/**
 *
 * @author jgale
 */
public class FabricaColor {
        
    public Color getFabricaColor(String color)
    {
        
        if(color.equals("Rojo"))
        {
            Color col = new Rojo();
            return col;
        }
        if(color.equals("Azul"))
        {
            Color col = new Azul();
            return col;
        }
        if(color.equals("Verde"))
        {
            Color col = new Verde();
            return col;
        }
        else
        {
            return null;
        }
    }
}
