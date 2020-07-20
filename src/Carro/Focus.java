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
public class Focus extends Sedan{
    public Focus(Color color)
    {
        this.setMarca("Ford");
        this.setModelo("Focus");
        this.setTipo("Sedan");
        this.setPuertas(5);
        this.setColor(color);
    }
}
