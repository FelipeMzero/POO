    package aula1;
    import java.util.Scanner;

    public class app2 {

        public static void main(String[] args) {
            int r1, r2, r3, r4;
            double r_total = 0.0;
            
            try (Scanner file = new Scanner(System.in)) {
                System.out.print("Digite o valor de R1: ");
                r1 = file.nextInt();
                System.out.print("Digite o valor de R2: ");
                r2 = file.nextInt();
                System.out.print("Digite o valor de R3: ");
                r3 = file.nextInt();
                System.out.print("Digite o valor de R4: ");
                r4 = file.nextInt();

                System.out.println("Estes dois estão em:\nSerie (S)\nParalelo (P)\n");
                String tipo = file.next();
                
                if (tipo.equals("S")){
                    r_total = r1 + r2 + r3 + r4;
                    System.out.println("Série (S)");
                } else {
                    r_total = 1.0 / ((1.0 / r1) + (1.0 / r2) + (1.0 / r3) + (1.0 / r4));
                    System.out.println("Paralelo (P)");
                }
                
                System.out.println("R_total: " + r_total);
            }
        }
    }
