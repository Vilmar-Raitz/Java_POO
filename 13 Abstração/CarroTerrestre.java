public class CarroTerrestre implements IVeiculo, ICarro {

    private String marca;
    private boolean estaLigado;
    private double velocidade;
    private double velocidadeMaxima = 200;
    private boolean portaAberta;
    private boolean vidroAberto;

    public CarroTerrestre(String marca) {
        this.marca = marca;
    }

    private String boolToString(boolean valor) {
        if (valor)
            return "Sim!";
        else
            return "Não!";

    }

    public String getStatusCarro(){

        return String.format("Marca: %s\n Ligado: %s \nVidro aberto: %s \nPorta aberta: %s \nVelocidade: %.2f",this.marca,boolToString(estaLigado), boolToString(vidroAberto),boolToString(portaAberta),this.velocidade); 
    }

    @Override
    public void ligar() {

        if (estaLigado)
            System.out.println("Já esta ligado.");
        else {
            this.estaLigado = true;
            System.out.println("Ligado.");
        }

    }

    @Override
    public void desligar() {
        if (estaLigado) {
            this.estaLigado = false;
            System.out.println("Desligado.");
        } else
            System.out.println("Carro está desligado.");

    }

    @Override
    public void frear() {
        if (velocidade > 0) {
            this.velocidade = 0;
            System.out.println("Carro parando...");
        } else
            System.out.println("Carro parado!");
    }

    @Override
    public void virar(String direcao) {
        System.out.printf("Indo para %s: ", direcao);
    }

    @Override
    public void acelerar(double kmHora) {
        if (estaLigado && (velocidade += kmHora) < this.velocidadeMaxima) {
            this.velocidade += kmHora;
        } else {
            this.velocidade = velocidadeMaxima;
            System.out.println("Velocidade Maxima Atingida!");
        }

    }

    @Override
    public void abrirPorta() {
        if (this.portaAberta)
            System.out.println("Porta aberta!");

        else {
            this.portaAberta = true;
            System.out.println("A porta Abriu!!!");

        }

    }

    @Override
    public void fecharPorta() {
        if (this.portaAberta) {
            this.portaAberta = false;
            System.out.println("Porta Fechada!");
        } else
            System.out.println("A porta já está fechada");

    }

    @Override
    public void descerVidro() {

        if (this.vidroAberto)

            System.out.println("Vidro está aberto.");

        else {

            this.vidroAberto = true;
            System.out.println("Vidro foi aberto!");
        }

    }

    @Override
    public void subirVidro() {

        if (vidroAberto) {
            this.vidroAberto = false;
            System.out.println("Vidro fechado!");
        } else
            System.out.println("O  vidro já está fechado.");

    }

}
