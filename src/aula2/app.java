package aula2;
import java.util.Scanner;

// f(x) = ax + b
// ordem de entradas x>a>b
public class app {
    public static void main(String[] args) {
        int a, b, c,  x;

        try (Scanner file = new Scanner(System.in)) {
            System.out.print("x = ");
            x = file.nextInt();
            System.out.print("a = ");
            a = file.nextInt();
            System.out.print("b = ");
            b = file.nextInt();
            System.out.print("c = ");
            c = file.nextInt();
            System.out.printf("f(%d) = %d * %d + %d - %d\n", x, a, x, b, c);
            int  resultado = a*b+b-c;
            System.out.printf("f(%d) = %d ", x, resultado);
        }
    }
}
