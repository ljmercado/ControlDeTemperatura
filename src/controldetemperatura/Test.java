/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controldetemperatura;

import java.io.File;
import java.io.IOException;
import net.sourceforge.jFuzzyLogic.FIS;

/**
 *
 * @author Usuario
 */
public class Test {
    public static void main(String[] args) throws IOException {
        String archivo = "control.fcl"; // Asegurate de que esté en la misma carpeta
        FIS fis = FIS.load(archivo, true);

        if (fis == null) {
            System.err.println("No se pudo cargar el archivo: " + archivo);
            return;
        }

        System.out.println("Archivo cargado correctamente.");
        System.out.println(new File("control.fcl").getPath());
        System.out.println(new File(archivo).getAbsolutePath());
        System.out.println(new File(archivo).getCanonicalPath());
        String ubicacion = System.getProperty("user.dir");
        System.out.println("Ubicación actual: " + ubicacion);
    }
}