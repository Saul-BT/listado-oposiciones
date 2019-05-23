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
    String dni;
    float nota1;
    float nota2;
    float totalNota;
    int nOpo;

    public Persona(String nombre, String dni, float nota1, float nota2, float totalNota, int nOpo) {
        this.nombre = nombre;
        this.dni = dni;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.totalNota = nota1 + nota2;
        this.nOpo = nOpo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public int getnOpo() {
        return nOpo;
    }
    
    public float getNota1() {
        return nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public float getTotalNota() {
        return totalNota;
    }
}
