/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_arreglos;

/**
 *
 * @author Victoria
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        double[] calificaciones_programacion = {18, 19, 15, 16, 17, 10};
        double[] calificaciones_bd = {10, 12, 13, 20, 17, 10};
        double[] promedios = new double[6];
        String cadena = "";
        int estudiantes = 0;
        for (int contador = 0; contador < calificaciones_bd.length; contador++) {
            double suma = calificaciones_programacion[contador] + calificaciones_bd[contador];
            double promedio = suma / 2;
            //System.out.println("Estudiante %d\t%f\%f\%f", contador,);
            promedios[contador] = promedio;

        }
        for (int contador = 0; contador < calificaciones_programacion.length; contador++) {
            estudiantes = estudiantes + 1;
            cadena = String.format("%s%s %-15d%-15.2f%-15.2f%.2f\n", cadena, "Estudiante", estudiantes, calificaciones_programacion[contador],
                    calificaciones_bd[contador], promedios[contador]);

        }
        System.out.println(cadena);
    }
}
