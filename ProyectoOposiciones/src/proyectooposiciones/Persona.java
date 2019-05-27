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
    int nOpo;
    String nombre;
    String dni;
    float experiencia;
    float titulos;
    float otros;
    float totalMeritos;
    float nota1;
    float nota2;
    float totalNota;

    public Persona(int nOpo, String nombre, String dni, float experiencia, float titulos, float otros, float totalMeritos, float nota1, float nota2, float totalNota) {
        this.nOpo = nOpo;
        this.nombre = nombre;
        this.dni = dni;
        this.experiencia = experiencia;
        this.titulos = titulos;
        this.otros = otros;
        this.totalMeritos = experiencia + titulos + otros;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.totalNota = nota1 + nota2;
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

    public float getExperiencia() {
        return experiencia;
    }

    public float getTitulos() {
        return titulos;
    }

    public float getOtros() {
        return otros;
    }

    public float getTotalMeritos() {
        return totalMeritos;
    }

    public float getTotal() {
        return 0.85F*getTotalNota()+0.15F*getTotalMeritos();
    }
    
    
}
