public class Conta {
    public Cliente cliente;
    private int _numeroConta;
    private double _saldo;

    public Conta(Cliente cliente, int numeroConta) { // Metodo construtor
        this.cliente = cliente;
        this._numeroConta = numeroConta;
    }

    public void imprimirConta() {
        System.out.printf(
                "\nTitular: " + this.cliente.nome + " " + this.cliente.sobrenome + "\nCPF:" + this.cliente.cpf
                        + "\nConta: " + this._numeroConta + "\nSaldo: " + this._saldo);
    }

    public void depositar(double valor) {

        if (valor > 0)
            this._saldo += valor;
        else
            System.out.println("O deposito tem que ser maior que zero!");
    }

    public void sacar(double valor) {
        if (valor > 0)

            if (valor <= this._saldo)
                this._saldo -= valor;
            else
                System.out.println("\nSaldo insuficiente.");

        else
            System.out.println("O valor do saque deve ser maior que zero!");
    }

    public void trasferir(Conta destino, double valor) {
        this.sacar(valor);
        destino.depositar(valor);
    }

}
