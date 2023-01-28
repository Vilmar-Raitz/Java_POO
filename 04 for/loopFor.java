public class loopFor {

    /*
     * importante Pré e Pós incremento:
     * Exemplo:
     * int i = 5;
     * int x = i++;
     * 
     * Nesse caso no primeiro loop ele vai ser 5 apos o segundo loop x vai receber i
     * + 1, ou seja, na proxima linha ele vai valer 6.
     * int i = 5;
     * int x = ++i;
     * Aqui nesse caso o já no primeiro loop o valor de x já vai ser 6, pois ele já
     * recebeu +1.
     */

    // Controlando Loops;
    public static void main(String[] args) {
        // Nesse caso obriguei o programa a sair do loop qaundo encontrase o valor 3.
        int idade = 5;
        for (idade = 1; idade < 5; idade++) {
            if (idade == 3) {

                System.out.println("A idade 3 foi encontrada!");
                break;
            } else {
                System.out.println("Idade 3 ainda nao foi encontrada.");
            }

        }
        // Da mesma forma podemos obrigar o a loop a continuar;
        for (int i = 0; i < 100; i++) {
            if (i > 50 && i < 60) {
                continue;
            }
            System.out.println(i);
        }

    }

}
