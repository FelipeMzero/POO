package aula2;
import java.util.Scanner;

public class att4 {
    public static void main(String[] args) {
        double cos, valor;
        
        try (Scanner arquivo = new Scanner(System.in)) {
            System.out.println("Informe a faixa de consumo em M³:");
            cos = arquivo.nextDouble();
        }

        if (cos <= 10){
            valor = 7;
        } else if (cos <= 30){
            valor = 7 + (cos - 10) * 1;
        } else if (cos <= 100){
            valor = 7 + 20 + ((cos - 30) * 2);
        } else {
            valor = 7 + 20 + 140 + ((cos - 100) * 5);
        }

        System.out.println("O custo é: R$" + valor);
    }
}
