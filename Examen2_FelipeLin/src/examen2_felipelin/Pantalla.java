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
public class Pantalla extends Partes implements Serializable {

    private String tactil;
    private String tipo;
    private static final long SerialVersionUID = 999l;

    public Pantalla() {
    }

    public Pantalla(String tactil, String tipo) {
        this.tactil = tactil;
        this.tipo = tipo;
    }

    public Pantalla(String tactil, String tipo, int time) {
        super(time);
        this.tactil = tactil;
        this.tipo = tipo;
    }

    public String getTactil() {
        return tactil;
    }

    public void setTactil(String tactil) {
        this.tactil = tactil;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Pantalla";
    }

}
