import java.util.Scanner;

public class atividade07 {
    public static void main(String[] args) {
        double num = 0.0;
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.print("Digite um numero:  ");
            num = teclado.nextDouble();
            System.out.println(Xnum(num));
        }

    }

    public static double Xnum(double num) {
        if (num % 2 == 0) {
            System.out.println("O numero digitado é par.");
            return num / 2;
        }
        System.out.println("O numero digitado é impar.");
        return (3 * num) + 1;

    }
}
