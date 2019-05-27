package proyectooposiciones;

import java.util.ArrayList;
import proyectooposiciones.GestoraArchivos;
import proyectooposiciones.Persona;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dam101
 */
public class GestoraPersona {

    Persona[] lasPersonas = GestoraArchivos.LAS_PERSONAS;

    public Persona[] buscaPersonas(String nOpoStr, String dni, String nombre) {
        int nOpo = Integer.parseInt(nOpoStr);
        ArrayList<Persona> buscadasTemp = new ArrayList();
        
        for (Persona persona : lasPersonas) {
            if (persona.getnumOpo() == nOpo) {
                buscadasTemp.add(persona);
            }
            if (persona.getDni().matches(dni)) {
                buscadasTemp.add(persona);
            }
            if (persona.getNombre().matches("^"+dni+".*")) {
                buscadasTemp.add(persona);
            }
        }
        
        return buscadasTemp.toArray(new Persona[buscadasTemp.size()]);
    }
}
