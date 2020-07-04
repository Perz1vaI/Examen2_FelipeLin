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
public class Bateria extends Partes implements Serializable {

    private double horas;
    private String material;
    private static final long SerialVersionUID = 888l;

    public Bateria() {
    }

    public Bateria(double horas, String material) {
        this.horas = horas;
        this.material = material;
    }

    public Bateria(double horas, String material, int time) {
        super(time);
        this.horas = horas;
        this.material = material;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Bateria";
    }

}
