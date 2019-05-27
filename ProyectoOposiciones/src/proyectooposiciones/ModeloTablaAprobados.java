/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectooposiciones;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dam102
 */
public class ModeloTablaAprobados extends DefaultTableModel {
    private Persona[] lasPersonas;

    public ModeloTablaAprobados(Persona[] lasPersonas) {
        this.lasPersonas = lasPersonas;
    }
    
    @Override
    public int getRowCount() {
        return lasPersonas == null ? 0 : lasPersonas.length;
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String[] nombres = {
            "Nº Opo.",
            "NIF",
            "Apellidos y Nombre",
            "Ejer Parte I",
            "Ejer Parte II",
            "Total"
        };
        return nombres[columnIndex];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        Class<?>[] clases = {
            Integer.class,
            String.class,
            String.class,
            Float.class,
            Float.class,
            Float.class
        };
        return clases[columnIndex];
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Persona persona = lasPersonas[rowIndex];
        if (persona == null) return null;
        Object[] informacionPersona = {
            this.lasPersonas[rowIndex].getnumOpo(),
            this.lasPersonas[rowIndex].getDni(),
            this.lasPersonas[rowIndex].getNombre(),
            this.lasPersonas[rowIndex].getNota1(),
            this.lasPersonas[rowIndex].getNota2(),
            this.lasPersonas[rowIndex].getTotalNota(),
            
        };
        return informacionPersona[columnIndex];
    }
    
}
