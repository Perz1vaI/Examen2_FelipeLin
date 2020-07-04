/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_felipelin;

import java.awt.Color;
import java.io.Serializable;

/**
 *
 * @author felipelinzhao
 */
public class Teclado extends Partes implements Serializable {

    private String material;
    private String color;
    private static final long SerialVersionUID = 333l;

    public Teclado() {
    }

    public Teclado(String material, String color) {
        this.material = material;
        this.color = color;
    }

    public Teclado(String material, String color, int time) {
        super(time);
        this.material = material;
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Teclado";
    }

}
