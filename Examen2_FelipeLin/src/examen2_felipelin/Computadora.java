
package examen2_felipelin;

import java.awt.Color;

/**
 *
 * @author felipelinzhao
 */
public class Computadora {
    private String numero_serie;
    private String year;
    private Color color;
    private String material;
    private RAM ram;
    private DiscoDuro disco;
    private Bateria bateria;
    private Teclado teclado;
    private Pantalla pantalla;
    private Procesador procesador;

    public Computadora() {
    }

    public Computadora(String numero_serie, String year, Color color, String material, RAM ram, DiscoDuro disco, Bateria bateria, Teclado teclado, Pantalla pantalla, Procesador procesador) {
        this.numero_serie = numero_serie;
        this.year = year;
        this.color = color;
        this.material = material;
        this.ram = ram;
        this.disco = disco;
        this.bateria = bateria;
        this.teclado = teclado;
        this.pantalla = pantalla;
        this.procesador = procesador;
    }

    public String getNumero_serie() {
        return numero_serie;
    }

    public void setNumero_serie(String numero_serie) {
        this.numero_serie = numero_serie;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public DiscoDuro getDisco() {
        return disco;
    }

    public void setDisco(DiscoDuro disco) {
        this.disco = disco;
    }

    public Bateria getBateria() {
        return bateria;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Pantalla getPantalla() {
        return pantalla;
    }

    public void setPantalla(Pantalla pantalla) {
        this.pantalla = pantalla;
    }

    public Procesador getProcesador() {
        return procesador;
    }

    public void setProcesador(Procesador procesador) {
        this.procesador = procesador;
    }

    @Override
    public String toString() {
        return "Computadora{" + "numero_serie=" + numero_serie + ", year=" + year + ", color=" + color + ", material=" + material + ", ram=" + ram + ", disco=" + disco + ", bateria=" + bateria + ", teclado=" + teclado + ", pantalla=" + pantalla + ", procesador=" + procesador + '}';
    }
    
    
    
    
    
    
}
