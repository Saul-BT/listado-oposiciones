/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectooposiciones;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dam102
 */
public class GestoraArchivos {

    public static final Persona[] LAS_PERSONAS = leerOpositores();
    private static final String ARCHIVO_NOTAS = "./archivos/Listado_Aprobados.csv";
    private static final String ARCHIVO_MERITOS = "./archivos/Listado_Meritos.csv";

    private static Persona[] leerOpositores() {
        BufferedReader lectorNotas = null;
        BufferedReader lectorMeritos = null;
        Persona[] opositores = null;
        try {
            lectorNotas = new BufferedReader(new FileReader(ARCHIVO_NOTAS));
            lectorMeritos = new BufferedReader(new FileReader(ARCHIVO_MERITOS));
            ArrayList<Persona> lasPersonasTemp = new ArrayList();
            String lineaNotas = lectorNotas.readLine();
            String lineaMeritos = lectorMeritos.readLine();

            while (lineaNotas != null) {
                String[] datosNotas = lineaNotas.split(";");
                String[] datosMeritos = lineaMeritos.split(";");

                int nOpo = Integer.parseInt(datosNotas[0]);
                String nombre = datosNotas[2];
                String dni = datosNotas[1];
                float experiencia = Float.parseFloat(datosMeritos[3]);
                float titulos = Float.parseFloat(datosMeritos[4]);                
                float otros = Float.parseFloat(datosMeritos[5]);
                float totalMeritos = experiencia + titulos + otros;
                float nota1 = Float.parseFloat(datosNotas[3]);
                float nota2 = Float.parseFloat(datosNotas[4]);
                float totalNota = nota1 + nota2;
                lasPersonasTemp.add(new Persona(nOpo, nombre, dni, experiencia, titulos, otros, totalMeritos, nota1, nota2, totalNota));

                lineaNotas = lectorNotas.readLine();
                lineaMeritos = lectorMeritos.readLine();
            }

            opositores = lasPersonasTemp.toArray(new Persona[lasPersonasTemp.size()]);

        } catch (IOException ex) {
            System.out.println("Meh");
        } finally {
            try {
                lectorNotas.close();
                lectorMeritos.close();
            } catch (IOException ex) {
                Logger.getLogger(GestoraArchivos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return opositores;
    }
}
