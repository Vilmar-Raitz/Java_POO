public class ContaPoupanca extends ContaAtividade01 {
    private double rendimento;
    double saldo;

    public ContaPoupanca(ContaAtividade01 conta, double rendimento) {
        super(conta.nome, conta.cpf, conta.agencia, conta.dataAbertura);
        this.rendimento = rendimento;
    }

    public String getConta(){
        return super.agencia;
    }

    public void aportar(double valor){
        super.sacar(valor);
        this.saldo +=valor;
    }
    

}
