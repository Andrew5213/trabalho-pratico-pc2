package trabalho_pratico.model;

public class Quadrilatero extends FiguraGeometrica{
    protected Ponto origem;
    protected Ponto inferiorEsquerdo;
    protected Ponto inferiorDireito;
    protected Ponto superiorDireito;
    protected Ponto superiorEsquerdo;

    public Quadrilatero() {
        origem = new Ponto(0,0);
        inferiorEsquerdo = origem;
        inferiorDireito = new Ponto(0,1);
        superiorDireito = new Ponto(1,2);
        superiorEsquerdo = new Ponto(1,0);
    }

    public Ponto getInferiorEsquerdo() {
        return inferiorEsquerdo;
    }

    protected void setInferiorEsquerdo(Ponto inferiorEsquerdo) {
        this.inferiorEsquerdo = inferiorEsquerdo;
    }

    public Ponto getInferiorDireito() {
        return inferiorDireito;
    }

    protected void setInferiorDireito(Ponto inferiorDireito) {
        this.inferiorDireito = inferiorDireito;
    }

    public Ponto getSuperiorDireito() {
        return superiorDireito;
    }

    protected void setSuperiorDireito(Ponto superiorDireito) {
        this.superiorDireito = superiorDireito;
    }

    public Ponto getSuperiorEsquerdo() {
        return superiorEsquerdo;
    }

    protected void setSuperiorEsquerdo(Ponto superiorEsquerdo) {
        this.superiorEsquerdo = superiorEsquerdo;
    }

}
