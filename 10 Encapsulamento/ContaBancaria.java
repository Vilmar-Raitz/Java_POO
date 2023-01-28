// ENCAPSULAMENTO
// -Esconder detalhes de implementação e mostrar apenas o necessário para o usuário.
// -É uma forma de proteger os dados de um objeto.
// -É uma forma de controlar o acesso aos atributos e métodos de um objeto.
// -É uma forma de garantir que os dados de um objeto não sejam modificados por código externo.

public class ContaBancaria {
    private String numeroConta;
    private String nomeTitular;
    private double saldo;

    public ContaBancaria(String nomeTitular, String numeroConta) {
        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta;
    }

    public String toString() {
        return String.format("\nTitular: %s.\nNumero: %s.\nSaldo: %.2f", nomeTitular, numeroConta, saldo);
    }

    public void depositar(double valor) {
        if (valor > 0)
            this.saldo = valor;
        else
            System.out.println("Valor Invalido!");
    }

    public boolean sacar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public void transferir(ContaBancaria contaDestino, double valor) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

}
