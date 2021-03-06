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
public class Procesador extends Partes implements Serializable {
    
    private int nucleos;
    private double velocidad;
        private static final long SerialVersionUID = 111l;


    public Procesador() {
    }

    public Procesador(int nucleos, double velocidad) {
        this.nucleos = nucleos;
        this.velocidad = velocidad;
    }

    public Procesador(int nucleos, double velocidad, int time) {
        super(time);
        this.nucleos = nucleos;
        this.velocidad = velocidad;
    }

    

    public int getNucleos() {
        return nucleos;
    }

    public void setNucleos(int nucleos) {
        this.nucleos = nucleos;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Procesador";
    }
    
    
    
}
