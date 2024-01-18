package aula2;
import java.util.Scanner;
public class att03 {
    public static void main(String[] args) {
        double a,b,c,d,e,f, resultado;
        try (Scanner file = new Scanner(System.in)){
        System.out.print("Insira o valor de A: ");
        a = file.nextDouble();
        System.out.print("Insira o valor de B: ");
        b = file.nextDouble();
        System.out.print("Insira o valor de C: ");
        c = file.nextDouble();
        System.out.print("Insira o valor de D: ");
        d = file.nextDouble();
        System.out.print("Insira o valor de E: ");
        e = file.nextDouble();
        System.out.print("Insira o valor de F: ");
        f = file.nextDouble();
        resultado = ((a*f)-(c*d)/(a*e)-(b*d));
        System.out.print("Resuldado de Y, é: "+ resultado);;
     }

}
}