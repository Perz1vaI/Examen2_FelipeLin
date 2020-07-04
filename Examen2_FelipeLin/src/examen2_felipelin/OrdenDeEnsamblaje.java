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
public class OrdenDeEnsamblaje {
    
    private Computadora compu;
    private Tecnicos tecnico;

    public OrdenDeEnsamblaje() {
    }

    public OrdenDeEnsamblaje(Computadora compu, Tecnicos tecnico) {
        this.compu = compu;
        this.tecnico = tecnico;
    }

    public Computadora getCompu() {
        return compu;
    }

    public void setCompu(Computadora compu) {
        this.compu = compu;
    }

    public Tecnicos getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnicos tecnico) {
        this.tecnico = tecnico;
    }

    @Override
    public String toString() {
        return "OrdenDeEnsamblaje{" + "compu=" + compu + ", tecnico=" + tecnico + '}';
    }
    
    
    
}
