import java.text.SimpleDateFormat;
import java.util.Date;

public class Carro {
    String marca;
    private String _numeroDeSerie;
    String cor;
    private Date _dataFabricacao;
    double valor;
    double velocidadeAtual;
    double velocidadeMaxima;
    boolean estaLigado;

    public Carro(String numeroDeSerie, Date date, double velocidadeMaxima) {
        this._numeroDeSerie = numeroDeSerie;
        this._dataFabricacao = date;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public String numeroDeSerie() {
        return this._numeroDeSerie;

    }

    public String dataFabricacao() {
        return new SimpleDateFormat("dd/MM/yyyy HH:mm").format(this._dataFabricacao);

    }

    public void ligarDesligar() {
        this.estaLigado = !this.estaLigado;
        if (this.estaLigado)
            System.out.println("Ligado!");
        else {
            desacelerar(this.velocidadeAtual);
            System.out.println("Desligado!");
        }
    }

    public void acelerar(double velocidade) {
        if (estaLigado) {
            if (velocidade > 0) {
                if ((this.velocidadeAtual += velocidade) <= this.velocidadeMaxima) {
                    this.velocidadeAtual += velocidade;
                    System.out.println("\nVelocidade atual: " + this.velocidadeAtual);
                } else {
                    this.velocidadeAtual = this.velocidadeMaxima;
                    System.out.println("Cuidado!!! Velocidade máxima atingida");
                }
            } else
                System.out.println("Aceleração deve ser maior que Zero!");
        } else
            System.out.println("O carro encontra-se desligado.");
    }

    public void desacelerar(double desacelerar) {
        if (desacelerar >= 0) {
            for (double i = desacelerar; i > 0; i-=5) {
                this.velocidadeAtual--;
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.print("Velocidade atual: " + this.velocidadeAtual);
                if (this.velocidadeAtual == 0)
                    return;

            }
        } else
            System.out.println((this.velocidadeAtual -= desacelerar));

    }
}
