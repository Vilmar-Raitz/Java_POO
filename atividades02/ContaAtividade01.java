//A conta vai ter que depositar, sacar e calcular rendimento mensal.
public class ContaAtividade01 {
    String nome;
    String cpf;
    String agencia;
    private double saldo;
    String dataAbertura;

    // Construtor de classe:
    public ContaAtividade01(String nome, String cpf, String agencia, String dataAbertura) {
        this.nome = nome;
        this.cpf = cpf;
        this.agencia = agencia;
        this.dataAbertura = dataAbertura;
    }
    public double getSaldo(){
        return this.saldo;
    }

    public void imprimirConta() {
        System.out.println("\nTitular: " + this.nome + "\nCPF: " + this.cpf + "\nAgencia: " + this.agencia
                + "\nData de abertura: " + this.dataAbertura);
    }

    public void depositar(double valor) {
        if (valor > 0)
            this.saldo += valor;
        else
            System.out.println("O valor inserido não é valido, para depositar o valor deve ser maior que 0");

    }

    public void sacar(double valor) {
        if (valor > 0) {
            if (valor <= this.saldo)
                this.saldo -= valor;
        } else
            System.out.println("O valor do saque é invalido!");

    }

}
