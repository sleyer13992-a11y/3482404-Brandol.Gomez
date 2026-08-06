import javax.swing.*;

public class Ejercicio6 {
    public static void main(String[] args) {

        int numeroVotos = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos votos se van a registrar?"));

        String[] votos = new String[numeroVotos];

        int votosA = 0;
        int votosB = 0;
        int votosC = 0;

        for (int i = 0; i < numeroVotos; i++) {
            votos[i] = JOptionPane.showInputDialog("Ingrese el voto " + (i + 1) + " (A, B o C)").toUpperCase();
        }

        for (int i = 0; i < numeroVotos; i++) {
            if (votos[i].equals("A")) {
                votosA++;
            } else if (votos[i].equals("B")) {
                votosB++;
            } else if (votos[i].equals("C")) {
                votosC++;
            }
        }

        String resultado = "Votos obtenidos:\n";
        resultado += "Candidato A: " + votosA + "\n";
        resultado += "Candidato B: " + votosB + "\n";
        resultado += "Candidato C: " + votosC + "\n";
    }
}