package aula2;
import java.util.Scanner;
public class att2 {
    public static void main(String[] args) {
        double n1, n2, media, soma;
        try (Scanner file = new Scanner(System.in)){
            System.out.print("Digite o valor de N1: ");
            n1 = file.nextDouble();
            System.out.print("Digite o valor de N2: ");
            n2 = file.nextDouble();
            media = n1+n2;
            soma = media / 2;
            System.out.println("O resultado é: "+soma);
        }
        }
}