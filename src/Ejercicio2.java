import javax.swing.*;

public class Ejercicio2 {
    public static void main(String[] args) {

        int numEstudiantes = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos estudiantes desea ingresar?"));

        double[] notas = new double[numEstudiantes];
        int aprobados = 0;
        int reprobados = 0;
        double suma = 0;

        for (int i = 0; i < numEstudiantes; i++) {

            notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota del estudiante:"));

            suma += notas[i];
        }

        double promedio = suma / numEstudiantes;

        if (promedio >= 3.0) {
            JOptionPane.showMessageDialog(null, "Promedio del curso: " + promedio + "\nEl curso APROBÓ.");
        } else {
            JOptionPane.showMessageDialog(null, "Promedio del curso: " + promedio + "\nEl curso REPROBÓ.");
        }

    }
}