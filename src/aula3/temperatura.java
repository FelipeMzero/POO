package aula3;
import java.util.Scanner;

public class temperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de dias: ");
        int quantidadeDias = scanner.nextInt();
        double[] temperaturas = new double[quantidadeDias];
        for (int i = 0; i < quantidadeDias; i++) {
            System.out.print("Digite a temperatura para o dia " + (i + 1) + ": ");
            temperaturas[i] = scanner.nextDouble();
                }
        double media = calcularMedia(temperaturas);
        int diasAcimaDaMedia = contarDiasAcimaDaMedia(temperaturas, media);
        System.out.println("A média da temperatura é: " + media);
        System.out.println("Dias acima da média: " + diasAcimaDaMedia);
        scanner.close();
    }
    private static double calcularMedia(double[] temperaturas) {
        double soma = 0;
        for (double temperatura : temperaturas) {
            soma += temperatura;
        }
        return soma / temperaturas.length;
    }
    private static int contarDiasAcimaDaMedia(double[] temperaturas, double media) {
        int count = 0;
        for (double temperatura : temperaturas) {
            if (temperatura > media) {
                count++;
            }
        }
        return count;
    }
}
