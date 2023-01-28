import java.util.Date;

public class ProgramaCarro {
    public static void main(String[] args) {
        Carro carro = new Carro("A2023",new Date(), 250.0);
        System.out.println(carro.dataFabricacao());
        carro.acelerar(0);
        carro.ligarDesligar();
        
        carro.acelerar(10);
        carro.acelerar(260);
        System.out.println(carro.velocidadeAtual);
        carro.desacelerar(20);
       // carro.ligarDesligar();
    }
}
