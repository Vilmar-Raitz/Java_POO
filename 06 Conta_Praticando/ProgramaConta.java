
public class ProgramaConta {
    
    public static void main (String[] args) {
        Conta2 minhaConta;
        minhaConta = new Conta2(1, "Vilmar ");
        System.out.println(minhaConta.getSaldo());
        System.out.println(minhaConta.numero);
        minhaConta.deposita(10);
        System.out.println(minhaConta.getSaldo());
        minhaConta.saca(-10);
        System.out.println(minhaConta.getSaldo());
        double saldoAtual = minhaConta.saca(10.0);
        System.out.println(saldoAtual);
        System.out.println(minhaConta.getSaldo());

    }
}
