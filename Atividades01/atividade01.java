
public class atividade01 {
    public static void main(String[] args) {
        System.out.println("Printe os numeros de 150 a 300");
        /*
         * int num = 150;
         * while (num <= 300) {
         * System.out.println(num);
         * num++;
         * }
         */
        Interador();
    }

    public static void Interador() {
        int num = 150;
        if (num < 300) {
            System.out.println(num);
            num++;
            Interador();
        }


    }

}