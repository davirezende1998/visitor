import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TransporteVisitorTest {
    @Test
    void deveExibirAviao() {
        Aviao aviao = new Aviao("PP-123", "Latam", "Boeing", "737-800");
        TransporteVisitor visitor = new TransporteVisitor();
        assertEquals("matricula=PP-123;companhiaAerea=Latam;fabricante=Boeing;modelo=737-800;", visitor.exibir(aviao));
    }

    @Test
    void deveExibirOnibus() {
        Onibus onibus = new Onibus(1999, "Mercedes", 52);
        TransporteVisitor visitor = new TransporteVisitor();
        assertEquals("ano=1999;fabricante=Mercedes;capacidade=52;", visitor.exibir(onibus));
    }

    @Test
    void deveExibirTrem() {
        Trem trem = new Trem(98765, 21, "RJ - SP");
        TransporteVisitor visitor = new TransporteVisitor();
        assertEquals("matricula=98765;numeroDeVagoes=21;rota=RJ - SP;", visitor.exibir(trem));
    }
}