public class atividade05 {
    public static void main(String[] args) {
        System.out.println("Imprima os fatoriais de 1 até 10");
        for (int i = 0; i <= 10; i++) {
            System.out.println(CalcFatorial(i));

        }
        System.out.println("\nImprima os fatoriais de 11 até 20");
        for (int i = 11; i <= 20; i++) {
            System.out.println(CalcFatorial(i));
        }
        System.out.println("\nImprima os fatoriais de 21 até 30");
        for (int i = 21; i <= 30; i++) {
            System.out.println(CalcFatorial(i));
        }
        System.out.println("\nImprima os fatoriais de 31 até 40");
        for (int i = 31; i <= 40; i++) {
            System.out.println(CalcFatorial(i));
        }
    }

    public static long CalcFatorial(long num) {
        
        if (num == 0 || num == 1) {
            return 1;
        }
        else{
            return num * CalcFatorial(num - 1);
        }
        
    }
}
