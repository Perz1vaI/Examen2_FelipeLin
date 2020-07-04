/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_felipelin;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author felipelinzhao
 */
public class HiloEnsamblar extends Thread {

    private OrdenDeEnsamblaje orden;
    private JTable tabla;
    private JProgressBar barra;
    private boolean avanzar = true;
    private ArrayList<Partes> lista = new ArrayList();

    public HiloEnsamblar() {
    }

    public HiloEnsamblar(OrdenDeEnsamblaje orden, JTable tabla, JProgressBar barra, ArrayList<Partes> lista) {
        this.orden = orden;
        this.tabla = tabla;
        this.barra = barra;
        this.lista = lista;
    }

    public OrdenDeEnsamblaje getOrden() {
        return orden;
    }

    public void setOrden(OrdenDeEnsamblaje orden) {
        this.orden = orden;
    }

    public JTable getTabla() {
        return tabla;
    }

    public void setTabla(JTable tabla) {
        this.tabla = tabla;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    @Override
    public void run() {
        while (avanzar) {
            int con = 0;
            DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
            for (int i = 0; i < lista.size(); i++) {
                try {
                    System.out.println(lista.get(i).getTime());

                    Thread.sleep(2000);

                } catch (InterruptedException ex) {
                    Logger.getLogger(HiloEnsamblar.class.getName()).log(Level.SEVERE, null, ex);
                }
                barra.setMaximum(lista.get(i).getTime());
                for (int j = 0; j < lista.get(i).getTime(); j++) {
                    barra.setValue(barra.getValue() + 1);
                    try {
                        Thread.sleep(lista.get(i).getTime());
                    } catch (InterruptedException ex) {
                        Logger.getLogger(HiloEnsamblar.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
                Object[] row = {lista.get(i).toString(), lista.get(i).getTime()};
                modelo.addRow(row);
                tabla.setModel(modelo);
                con++;
                if (con == 6) {
                    avanzar = false;
                    JOptionPane.showMessageDialog(null, "Ya termino de cargar las partes");
                }
            }

        }
    }

}
