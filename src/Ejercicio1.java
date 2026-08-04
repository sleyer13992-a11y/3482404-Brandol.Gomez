import javax.swing.*;

public class Ejercicio1 {
    public static void main(String[] args) {

        int numIngresados = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos números deseas ingresar?"));
        int[] numeros = new int[numIngresados];
        int pares = 0;
        int impares = 0;

        for (int i = 0; i < numIngresados; i++) {

            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));

            if (numeros[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        JOptionPane.showMessageDialog(null,
                "Pares: " + pares +
                        "\nImpares: " + impares);
    }
}