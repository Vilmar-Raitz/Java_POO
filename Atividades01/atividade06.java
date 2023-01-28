public class atividade06 {
    public static void main(String[] args) {
        System.out.println("Imprimir Seguencia de de Fiboncci ");
        for (int i = 0; i <= 12; i++) {
            System.out.println(Fiboncci(i));
        }
    }

    public static long Fiboncci(long num) {
        if (num == 0 || num == 1) return num;
        return Fiboncci(num - 1) + Fiboncci(num - 2);
    }
}
