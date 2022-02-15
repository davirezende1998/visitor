public class Aviao implements MeioDeTransporte{
    private String matricula;
    private String companhiaAerea;
    private String fabricante;
    private String modelo;

    public Aviao(String matricula, String companhiaAerea, String fabricante, String modelo) {
        this.matricula = matricula;
        this.companhiaAerea = companhiaAerea;
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getCompanhiaAerea() {
        return companhiaAerea;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirAviaoCSV(this);
    }
}