import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        int r1, r2, r3, r4;
        int r_total;
        try (Scanner file = new Scanner(System.in)) {
            System.out.print("Digite o valor de R1: ");
            r1 = file.nextInt();
            System.out.print("Digite o valor de R2: ");
            r2 = file.nextInt();
            System.out.print("Digite o valor de R3: ");
            r3 = file.nextInt();
            System.out.print("Digite o valor de R4: ");
            r4 = file.nextInt();
        }
        r_total = r1+r2+r3+4+r4;
        System.out.println("R_toral " + r_total);
    }
}