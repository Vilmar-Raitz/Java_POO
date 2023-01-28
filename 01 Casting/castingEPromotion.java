public class castingEPromotion {
    public static void main(String[] args) {
        
        /*
         * O Casting explicito ocorre quando precisamos armazenar um valor maior em um
         * tipo menor já o casting implicito ou promoção é quando um tipo menor vai ser
         * alocado em um tipo maior, nesse caso não precisa ser especificado.
         * Exemplos:
         */

        // double d = 3.1415;
        // int i = d; Não vai compilar pois o tipo double não é compativel com com
        // inteiro para isso devemos fazer um casting:

        double d = 3.1415;
        int i = (int) d;
        System.out.format("O valor da variavel i é: %d \n", i);

        // Outro exemplo:

        double e = 5;
        float f = 3;
        float x = f + (float) e;
        System.out.printf("O valor da variavel i é: %.2f", x);

    }

}
