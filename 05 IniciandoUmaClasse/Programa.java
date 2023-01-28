import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {

            Conta1 conta = new Conta1();
            System.out.print("Nome: ");
            conta.nome = teclado.nextLine();
            conta.numero = 1;
            conta.tipo = Tipo.Corrente;
            System.out.println("Bem Vindo ao Banco Filho da Mãe!!!");
            System.out.printf("Sua Conta é %s, Nome: %s, Numero: %d, Saldo: %.2f, Limite: %.2f", conta.tipo, conta.nome,
                    conta.numero, conta.saldo, conta.limite);
            System.out.print("Deposito inicial: ");
            conta.Depositar(teclado.nextDouble());
            System.out.printf("Seu novo Saldo é %.2f:", conta.saldo);
        }

    }
}

class Conta1 {
    int numero;
    Tipo tipo;
    String nome;
    double saldo;
    double limite;

    public Conta1() {
        this.limite = 10.0;
    }

    public void Depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.printf("Deposito no valor de %.2f efetuado com sucesso!!!", this.saldo);
            return;
        }
        System.out.println("Valor invalido!!!");
    }

}

enum Tipo {
    Corrente, Poupança
}
