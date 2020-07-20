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
public class Ecosport extends Camioneta{
    public Ecosport(Color color)
    {
        this.setMarca("Ford");
        this.setModelo("Ecosport");
        this.setTipo("Camioneta");
        this.setPuertas(5);
        this.setColor(color);
    }
}
