/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_felipelin;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author felipelinzhao
 */
public class AdminCompu {

    private ArrayList<Computadora> lista = new ArrayList();
    private File archivo = null;

    public AdminCompu() {
    }

    public AdminCompu(String path) {
        archivo = new File(path);
    }

    public ArrayList<Computadora> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Computadora> lista) {
        this.lista = lista;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void setComputadora(Computadora p) {
        this.lista.add(p);
    }

    @Override
    public String toString() {
        return "adminArchivo{" + "lista=" + lista + ", archivo=" + archivo + '}';
    }

    public void cargarArchivo() {
        try {
            lista = new ArrayList();
            Computadora temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Computadora) objeto.readObject()) != null) {
                        lista.add(temp);
                    }
                } catch (Exception e) {
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Computadora t : lista) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception e) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {
            }

        }
    }

}
