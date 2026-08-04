import javax.swing.*;

public class Ejercicio3 {
    public static void main(String[] args) {

        int numero = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos números desea ingresar?"));

        int[] numeros = new int[numero];

        for (int i = 0; i < numero; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número:"));
        }

        int mayor = numeros[0];
        int menor = numeros[0];

    }
}