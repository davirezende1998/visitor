public class Trem implements  MeioDeTransporte{
    private int matricula;
    private int numeroDeVagoes;
    private String rota;

    public Trem(int matricula, int numeroDeVagoes, String rota) {
        this.matricula = matricula;
        this.numeroDeVagoes = numeroDeVagoes;
        this.rota = rota;
    }

    public int getMatricula() {
        return matricula;
    }

    public int getNumeroDeVagoes() {
        return numeroDeVagoes;
    }

    public String getRota() {
        return rota;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirTremCSV(this);
    }
}