package proyectooposiciones;

import java.util.ArrayList;

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
        ArrayList<Persona> buscadasTemp = new ArrayList();
        
        for (Persona persona : lasPersonas) {
            if (nOpoStr.equals("") && persona.getnumOpo() == Integer.parseInt(nOpoStr)) {
                buscadasTemp.add(persona);
            }
            else if (dni.equals("") && persona.getDni().matches(dni)) {
                buscadasTemp.add(persona);
            }
            else if (nombre.equals("") && persona.getNombre().matches("^"+nombre+".*")) {
                buscadasTemp.add(persona);
            }
        }
        
        return buscadasTemp.toArray(new Persona[buscadasTemp.size()]);
    }
}
