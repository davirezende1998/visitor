public class Onibus implements MeioDeTransporte{
    private int ano;
    private String fabricante;
    private int capacidade;

    public Onibus(int ano, String fabricante, int capacidade) {
        this.ano = ano;
        this.fabricante = fabricante;
        this.capacidade = capacidade;
    }

    public int getAno() {
        return ano;
    }

    public String getFabricante() {
        return fabricante;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirOnibusCSV(this);
    }
}