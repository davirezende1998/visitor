public class TransporteVisitor implements Visitor{

    public String exibir(MeioDeTransporte transporte) {
        return transporte.aceitar(this);
    }

    @Override
    public String exibirAviaoCSV(Aviao aviao) {
        return "matricula=" + aviao.getMatricula() +";companhiaAerea=" + aviao.getCompanhiaAerea() +
                ";fabricante=" + aviao.getFabricante() + ";modelo=" + aviao.getModelo() + ";";
    }

    @Override
    public String exibirOnibusCSV(Onibus onibus) {
        return "ano=" + onibus.getAno() +";fabricante=" + onibus.getFabricante() +
                ";capacidade=" + onibus.getCapacidade() + ";";
    }

    @Override
    public String exibirTremCSV(Trem trem) {
        return "matricula=" + trem.getMatricula() +";numeroDeVagoes=" + trem.getNumeroDeVagoes() +
                ";rota=" + trem.getRota() +";";
    }
}