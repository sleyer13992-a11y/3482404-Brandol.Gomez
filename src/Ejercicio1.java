import javax.swing.*;

public class Ejercicio1 {
     public  static void main(String[] args) {
        int numIngresados = Integer.parseInt(JOptionPane.showInputDialog("Cuantos numero deseas ingresar?"));
        int [] numeros = new int [numIngresados];
        int pares = 0;
        int impares = 0;

        for (int i = 0; i < numIngresados; i++) {
            numeros = new int[]{Integer.parseInt(JOptionPane.showInputDialog("Ingrese los numeros"))};

            if (numeros[i] % 2 == 0) {
               numeros = new int[]{pares++};

            } else  {
                numeros= new int[]{impares++};
            }
        }

        JOptionPane.showMessageDialog(null, "pares:" + pares + "\n" + " impares:" + impares);
     }
}
