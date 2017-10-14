/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficherosecuencial;

import java.io.*;

/**
 *
 * @author rojo5
 */
public class FicheroSecuencial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            leerDatos("mificherito.txt");
        } catch (Exception e) {
            System.out.println("FUNCION NO ENCONTRADA");
        }
    }

    public static void leerDatos(String archivo) {
        String texto = new String();
        try {
            
        FileReader fr = new FileReader(archivo);
        BufferedReader entrada = new BufferedReader(fr);
//        String s;
//
//            while ((s = entrada.readLine()) != null) {
//                texto += s + "\n";
//            }
//            System.out.println("\nDatos leidos del archivo con READLINE:\n"
//                    + texto + "tamaño del fichero: \n" + texto.length());

            System.out.print(entrada.read());
            entrada.close();
        } catch (java.io.FileNotFoundException fnfex) {
            System.out.println("Archivo no encontrado!!!" + fnfex);
        } catch (java.io.IOException ioex) {
        }

    }
}
