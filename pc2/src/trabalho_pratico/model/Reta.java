package trabalho_pratico.model;

public class Reta extends FiguraGeometrica {
    private Ponto pontoInicia;
    private Ponto pontoFinal;

    public Reta() {
        pontoInicia = new Ponto(0,0);
        pontoFinal = new Ponto(0, 1);
    }

    public Reta(int xInicial, int yInicial, int xFinal, int yFinal) {
        pontoInicia = new Ponto(xInicial,yInicial);
        pontoFinal = new Ponto(xFinal, yFinal);
    }

    public Reta(Ponto pInicial, Ponto pFinal) {
        this.pontoInicia = pInicial;
        this.pontoFinal = pFinal;
    }

    public Ponto getPontoInicia() {
        return pontoInicia;
    }

    public void setPontoInicia(Ponto pontoInicia) {
        this.pontoInicia = pontoInicia;
    }

    public Ponto getPontoFinal() {
        return pontoFinal;
    }

    public void setPontoFinal(Ponto pontoFinal) {
        this.pontoFinal = pontoFinal;
    }
}
