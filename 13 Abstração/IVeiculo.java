// ABSTRAÇÃO
// - A abstração é a capacidade de generalizar, de extrair as características essenciais de um objeto, de um fenômeno, de um processo, de um sistema, de um conjunto de objetos, de um conjunto de fenômenos, de um conjunto de processos, de um conjunto de sistemas, etc.


public interface IVeiculo {

    public void ligar();
    public void desligar();
    public void frear();
    public void virar(String direcao);
    public void acelerar(double kmHora);
    
}