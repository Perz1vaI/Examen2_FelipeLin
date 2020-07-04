/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_felipelin;

import java.io.Serializable;

/**
 *
 * @author felipelinzhao
 */
public class RAM extends Partes implements Serializable { 
    
    private double size;
    private String marca;
        private static final long SerialVersionUID = 222l;


    public RAM() {
    }

    public RAM(double size, String marca) {
        this.size = size;
        this.marca = marca;
    }

    public RAM(double size, String marca, int time) {
        super(time);
        this.size = size;
        this.marca = marca;
    }

    

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "RAM" ;
    }
    
    
    
}
