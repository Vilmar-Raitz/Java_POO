class Conta2 {
    int numero;
    String titular;
    private double saldo;
    
    public double getSaldo(){
        return this.saldo;
    }

    public Conta2(int numero, String titular) {
        if (numero > 0)
            this.numero = numero;
        else
            System.out.println("O numero da Conta não pode ser menor ou igual 0");

        if (!titular.isEmpty())
            this.titular = titular;
        else
            System.out.println("O numero da Conta não pode ser menor ou igual 0");

    }

    double saca(double quantidade) {
        if (quantidade > 0) {
            double novoSaldo = this.saldo - quantidade;
            this.saldo = novoSaldo;

        } else
            System.out.println("O valor de saque precisa ser maior que R$ 0.00");
        return this.saldo;
        // Como declaramos agora o tipo do metodo como Double devemos declarar return
        // para quem instanciar a classe para usar esse metodo.
    }

    void deposita(double quantidade) {
        if (quantidade > 0)
            this.saldo += quantidade;
        else
            System.out.println("Valor de deposito não pode ser menor que R$ 0.00");
    }
}