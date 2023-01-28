public class atividade04 {
    public static void main(String[] args) {
        System.out.println("Imprima os fatoriais de 1 até 10");
        for (int i = 0; i <= 10; i++) {
            System.out.println(CalcFatorial(i));
        }
    }

    public static int CalcFatorial(int num) {
        
        if (num == 0 || num == 1) {
            return 1;
        }
        else{
            return num * CalcFatorial(num - 1);
        }
        
    }
}
