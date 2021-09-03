package paint_AndrewOficial.modelo;

public class Texto extends FigGeometrica {//isto e so para aparecer no vetor
    private String palavra;

    public Texto(String palavra) {
        this.palavra = palavra;
    }

    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    @Override
    public String toString() {
        return "Texto{" +
                "palavra='" + getPalavra() + '\'' +
                '}';
    }
}
