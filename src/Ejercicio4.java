import javax.swing.*;

public class Ejercicio4 {
    public static void main (String[] args){

        int NumeroTemperatura = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas temperaturas desea registrar?"));
        double[] temperaturas = new double[NumeroTemperatura];
        String resultado = "Clasificación de temperaturas:\n";

        for (int i = 0; i < NumeroTemperatura; i++) {
            temperaturas[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la temperatura " + (i + 1) + " en °C:"));
        }


        for (int i = 0; i < NumeroTemperatura; i++) {
            if (temperaturas[i] < 10) {
                resultado += temperaturas[i] + " °C -> Frío\n";
            } else if (temperaturas[i] >= 10 && temperaturas[i] <= 25) {
                resultado += temperaturas[i] + " °C -> Templado\n";
            } else {
                resultado += temperaturas[i] + " °C -> Calor\n";
            }
        }
        JOptionPane.showMessageDialog(null, resultado);
    }
}