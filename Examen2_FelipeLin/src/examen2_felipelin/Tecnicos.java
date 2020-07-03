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
public class Tecnicos {
    private int edad;
    private String nombre;
    private String genero;
    private int cantidad_compu=0;

    public Tecnicos() {
    }

    public Tecnicos(int edad, String nombre, String genero) {
        this.edad = edad;
        this.nombre = nombre;
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getCantidad_compu() {
        return cantidad_compu;
    }

    public void setCantidad_compu(int cantidad_compu) {
        this.cantidad_compu = cantidad_compu;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
    
}
