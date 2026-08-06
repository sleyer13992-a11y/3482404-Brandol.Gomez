import javax.swing.*;

public class Ejercicio5 {
    public static void main(String[] args) {

        int CantidadNumeros = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de números que desea ingresar"));
        int[] Numeros = new int[CantidadNumeros];

        for (int i = 0; i < CantidadNumeros; i++) {
            Numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese número " + (i + 1)));
        }

        int buscar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número que desea buscar"));

        boolean existe = false;
        String resultado = "";

        for (int i = 0; i < CantidadNumeros; i++) {
            if (Numeros[i] == buscar) {
                existe = true;
                resultado += "El número: " + buscar + " se encontró en la posición: " + i + "\n";
            }
        }

        if (existe) {
            JOptionPane.showMessageDialog(null, resultado);
        } else {
            JOptionPane.showMessageDialog(null, "El número " + buscar + " no fue encontrado en el array.");
        }
    }
}