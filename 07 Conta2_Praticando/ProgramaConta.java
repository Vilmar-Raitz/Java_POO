public class ProgramaConta {
    static Cliente vilmar;
    static Cliente paulo;
    static Conta contaVilmar;
    static Conta contaPaulo;

    public static void main(String[] args) {

        try {
            vilmar = new Cliente("vilmar", "Raitz", "05268310137");
            contaVilmar = new Conta(vilmar, 1);
            contaVilmar.imprimirConta();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {

            paulo = new Cliente("Paulo", "Raitz", "05682974152");
            contaPaulo = new Conta(paulo, 2);
            contaPaulo.imprimirConta();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        if (contaVilmar != null && contaPaulo != null) {
            contaVilmar.depositar(200);
            contaVilmar.trasferir(contaPaulo, 200);
    
        }

    }

}
