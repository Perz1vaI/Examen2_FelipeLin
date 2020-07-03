/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_felipelin;

/**
 *
 * @author felipelinzhao
 */
public class DiscoDuro {

    private String marca;
    private double size;

    public DiscoDuro() {
    }

    public DiscoDuro(String marca, double size) {
        this.marca = marca;
        this.size = size;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "DiscoDuro{" + "marca=" + marca + ", size=" + size + '}';
    }

}
