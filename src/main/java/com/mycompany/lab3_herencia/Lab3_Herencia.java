/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3_herencia;

import javax.swing.JOptionPane;

public class Lab3_Herencia {

    /**
     * *****************************
     */
    /**
     * *****************************
     */
    /**
     * *****************************
     */
//Constructor de la clase
    public Lab3_Herencia() {
// TODO Auto-generated constructor stub
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        /**
         * *****************************
         */
        //a determina que programa va a usar
        int a = 0;
        try {
            a = Integer.parseInt(JOptionPane.showInputDialog("¿Que programa desea usar?"
                    + "\n1. Programa Empleado\n2. Programa Estudiante\n3. Salir"));
            while (a < 1 || a > 3) {

                JOptionPane.showMessageDialog(null, "[ERROR] Digite nuevamente");
                a = Integer.parseInt(JOptionPane.showInputDialog("¿Que programa desea usar?"));

            }
        } catch (Exception errorMain) {
            errorMain.printStackTrace();
            JOptionPane.showMessageDialog(null, "[ERROR] Caracteres incorrectos.\nSaliendo del sistema...");
            System.exit(0);
        }
        if (a == 1) {
// TODO Auto-generated method stub
            int opcion = 0;
            Persona sistemaInformacion = new Persona();
            try {
//Usamos la herencia de la superclase para acceder a los
//métodos de lectura de datos
                do {
                    opcion = sistemaInformacion.leerDatoTipoEntero("Ingrese la opción 1 para procesar los datos "
                            + "del empleado, 3 para salir: ");
                    if (opcion == 1) {
                        JOptionPane.showMessageDialog(null, "Procesando datos del empleado");
                        Empleado manejadorEmpleado = new Empleado();
//Leemos los datos
                        manejadorEmpleado = manejadorEmpleado.ingresarDatosEmpleado();
//Mostramos el reporte de datos
                        manejadorEmpleado.imprimirReporteEstadoEmpleado();
                    } else {
                        if (opcion == 3) {
                            JOptionPane.showMessageDialog(null, "Saliendo del Sistema");
                            break;
                        } else {
                            JOptionPane.showMessageDialog(null, "Opción inválida");
                        }
                    }
                } while (opcion <= 1 || opcion >= 3);//fin del do-while
            } catch (Exception errorMain) {
                JOptionPane.showMessageDialog(null, "Error en la digitación: ");
                errorMain.printStackTrace();
            }
            /**
             * *****************************
             */
        }else{
            //Programa estudiante
            if (a == 2){
                Estudiante es = new Estudiante();
                es.ingresarDatosEstudiante();
                es.leerNotasEstudiante();
                es.imprimirReporteNotasEstudiante();
            }else{
              JOptionPane.showMessageDialog(null, "Saliendo del sistema...");
            }
        }
    }

    /**
     * *****************************
     */
    /**
     * *****************************
     */
}
