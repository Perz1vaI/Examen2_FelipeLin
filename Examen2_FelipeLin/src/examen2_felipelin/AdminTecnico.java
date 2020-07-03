/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_felipelin;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author felipelinzhao
 */
public class AdminTecnico {
    
    private ArrayList<Tecnicos> lista = new ArrayList();
    private File archivo = null;
    
    public AdminTecnico() {
    }
    
    public AdminTecnico(String path) {
        archivo = new File(path);
        
    }
    
    public ArrayList<Tecnicos> getLista() {
        return lista;
    }
    
    public void setLista(ArrayList<Tecnicos> lista) {
        this.lista = lista;
    }
    
    public File getArchivo() {
        return archivo;
    }
    
    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setTecnicos(Tecnicos p) {
        this.lista.add(p);
    }
    
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Tecnicos t : lista) {
                bw.write(t.getNombre() + ",");
                bw.write(t.getEdad() + ",");
                bw.write(t.getGenero() + ",");
                bw.write(t.getCantidad_compu() + ",");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }
    
    public void cargarArchivo() {
        Scanner sc = null;
        lista = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(",");
                while (sc.hasNext()) {
                    lista.add(new Tecnicos(sc.nextInt(), sc.next(), sc.next()));
                    
                }
            } catch (Exception ex) {
            }
            sc.close();
        }
    }
}
