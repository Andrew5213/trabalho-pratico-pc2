package trabalho_pratico.model;

public class Retangulo extends Quadrilatero{

    public Retangulo() {
        this(1, 2);
//        inferiorEsquerdo = new Ponto(0,0);
//        inferiorDireito = new Ponto(2,0);
//        superiorDireito = new Ponto(1,2);
//        superiorEsquerdo = new Ponto(0,2);
    }

    public Retangulo(int base, int altura) {
        inferiorEsquerdo = new Ponto(0,0);
        inferiorDireito = new Ponto(base,0);
        superiorDireito = new Ponto(base,altura);
        superiorEsquerdo = new Ponto(0,altura);
    }

    public Ponto getInferiorEsquerdo() {
        return inferiorEsquerdo;
    }

    public void setInferiorEsquerdo(Ponto inferiorEsquerdo) {
        this.inferiorEsquerdo = inferiorEsquerdo;
    }

    public Ponto getInferiorDireito() {
        return inferiorDireito;
    }

    public void setInferiorDireito(Ponto inferiorDireito) {
        this.inferiorDireito = inferiorDireito;
    }

    public Ponto getSuperiorDireito() {
        return superiorDireito;
    }

    public void setSuperiorDireito(Ponto superiorDireito) {
        this.superiorDireito = superiorDireito;
    }

    public Ponto getSuperiorEsquerdo() {
        return superiorEsquerdo;
    }

    public void setSuperiorEsquerdo(Ponto superiorEsquerdo) {
        this.superiorEsquerdo = superiorEsquerdo;
    }

    public double getAreaRetangulo(){
        return superiorDireito.getX() * superiorDireito.getY();
    }

    public double getPerimetroRetangulo(){
        return superiorDireito.getX()*2 + superiorDireito.getY()*2;
    }

    @Override
    public String toString() {
        return "Retangulo{" +
                "origem=" + origem +
                '}';
    }
}
