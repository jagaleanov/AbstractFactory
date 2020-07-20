/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Carro;

/**
 *
 * @author jgale
 */
public class Strada extends Camioneta{
    public Strada(Color color)
    {
        this.setMarca("Fiat");
        this.setModelo("Strada");
        this.setTipo("Camioneta");
        this.setPuertas(3);
        this.setColor(color);
    }
    
}
