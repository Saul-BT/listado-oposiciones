package proyectooposiciones;
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
    GestoraArchivos gestora = new GestoraArchivos();
    Persona[] lasPersonas = gestora.leerOpositores();
    
    public Persona buscaPersona(String nOpo, String dni, String nombre) {
        if(nOpo != null){
           for(Persona persona : lasPersonas){
               if(persona.getnOpo() == Integer.parseInt(nOpo)){
                   return persona;
               }
           }
            
        }
        if(dni != null){
            for(Persona persona : lasPersonas){
               if(persona.getDni()== dni){
                   return persona;
               }
           }
        }
        if(nombre != null){
            for(Persona persona : lasPersonas){
               if(persona.getNombre()== nombre){
                   return persona;
               }
           }
        
        }
        return null;

    }

    }