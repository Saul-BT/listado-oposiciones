/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectooposiciones;

import javax.swing.JComponent;

/**
 *
 * @author dam102
 */
public class MiExcepcion extends Exception {
    JComponent componente;
    String mensaje;

    public MiExcepcion(JComponent componente, String mensaje) {
        super(mensaje);
        this.componente = componente;
    }

    public JComponent getComponente() {
        return componente;
    }
}
