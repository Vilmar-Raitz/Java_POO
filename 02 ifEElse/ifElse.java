
public class ifElse {
    /*
     * Sintaxe do if em java:
     * if(condiçãoBoleana){
     * codigo;
     * }
     *
     * Uma condição booleana é qualquer expressão que retorne true ou false. para
     * isso pode-se usar os operadores <, >, <=, >= e outros.
     * Exemplo:
     */
    public static void main(String[] args) {
        int idade = 15;
        if (idade < 18) {
            System.out.println("Não pode entrar");
        } else {
            System.out.println("Pode entrar");
        }
        // Pode-se concatenar expressões booleanas por meio dos operadores lógicos "E" e
        // "OU". "E" representado por && e "OU" por ||.

        int ida = 15;
        boolean amigo = true;
        if (ida < 18 && amigo == false) {
            System.out.println("Não pode entrar");
        } else {
            System.out.println("Pode entrar");
        }

        // Esse codigo poderia ficar ainda mais legível, utilizando o operador de
        // negação, o !. Esse operador trasnforma o resultado de uma expressão booleana
        // de false em true, e vice-versa.

        int idad = 15;
        boolean amigoDoDono = true;
        if (idad < 18 && !amigoDoDono) {
            System.out.println("Não pode entrar");
        } else {
            System.out.println("Pode entrar.");
        }
    }
}