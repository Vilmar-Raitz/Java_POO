import java.util.Scanner;

public class atividade08 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.print("Digite o total de linhas: "); 
            Num(teclado.nextInt());
        } catch (Exception e) {
            System.out.print("Digite um numero valido."); 
        }

    }

    public static void Num(int linha) {
        if(linha == 0) System.out.println(1);
        for (int i = 1; i <= linha; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf(" %d ", i * j);
            }
            System.out.println();
        }
    }

}
