public class Atividade02 {
  public static void main(String[] args) {
    ContaPoupanca accountBankVilmar = new ContaPoupanca(
        new ContaAtividade01("Vilmar", "052.683.101-43", "Banco do brasil", "20/01/2023"), 0.1);
        accountBankVilmar.imprimirConta();

        accountBankVilmar.depositar(200);

        accountBankVilmar.aportar(100);
        accountBankVilmar.aportar(200);
    System.out.println(accountBankVilmar.saldo);
  }
}
