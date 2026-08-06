import javax.swing.*;

public class Ejercicio4 {
    public static void main (String[] args){

        int NumeroTemperatura = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas temperaturas desea registrar?"));

        double[] temperaturas = new double[NumeroTemperatura];

        for (int i = 0; i < NumeroTemperatura; i++) {
            temperaturas[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la temperatura " + (i + 1) + " en °C:"));
        }

        String resultado = "Clasificación de temperaturas:";

    }
}