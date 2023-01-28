public class atividade02 {
    public static void main(String[] args) {
        System.out.println("Soma de 1 até 1000");
        int soma = 1;

        for (int i = 1; i <= 1000; i++) {
            System.out.println(soma);
            soma+=i;
        }
        System.out.println(soma);
    }
}
