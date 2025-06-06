/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controldetemperatura;

import net.sourceforge.jFuzzyLogic.FIS;
import net.sourceforge.jFuzzyLogic.rule.Variable;

public class ControlDeTemperatura {
    public static void main(String[] args) {
        // Cargar archivo FCL
        String fileName = "control.fcl";
        FIS fis = FIS.load(fileName, true);

        if (fis == null) {
            System.err.println("No se pudo cargar el archivo: " + fileName);
            return;
        }

        // Setear la entrada
        fis.setVariable("temperatura", 40);

        // Evaluar
        fis.evaluate();

        // Obtener la salida
        Variable ventilador = fis.getVariable("ventilador");

        // Mostrar resultados
        System.out.println("Resultado del ventilador: " + ventilador.getValue());

        // (Opcional) mostrar gráficamente
        //ventilador.chart(true);
       
    }
}