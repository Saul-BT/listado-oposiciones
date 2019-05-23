/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectooposiciones;

/**
 *
 * @author dam101
 */
public class Persona {
    String nombre;
    String apellido1;
    String apellido2;
    String dni;
    int numero_opo;

    public Persona(String nombre, String apellido1, String apellido2, String dni, int numero_opo) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.dni = dni;
        this.numero_opo = numero_opo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public String getDni() {
        return dni;
    }

    public int getNumero_opo() {
        return numero_opo;
    }
    
}
