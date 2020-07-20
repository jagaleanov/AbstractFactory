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
public class Palio extends Coupe{
    public Palio(Color color)
    {
        this.setMarca("Fiat");
        this.setModelo("Palio");
        this.setTipo("Coupe");
        this.setPuertas(3);
        this.setColor(color);
    }
}
