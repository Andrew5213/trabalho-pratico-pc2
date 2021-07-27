package trabalho_pratico.model;

public class Trapezio extends Quadrilatero{

    private Reta superior;
    private Reta inferior;
    private Reta direita;
    private Reta esquerda;

    /* private Reta lado */

    public Trapezio() {
        inferior = new Reta(0,0,2,0);
        direita = new Reta(2,0,1,1);
        superior = new Reta(1,1,0,1);
        esquerda = new Reta(0,1,0,0);
    }

    public Trapezio(Ponto pontoInicial, Ponto ponto2, Ponto ponto3, Ponto ponto4) {
        inferior = new Reta(pontoInicial.getX(),pontoInicial.getY(),ponto2.getX(),ponto2.getY());
        direita = new Reta(ponto2, ponto3);
        superior = new Reta(ponto3, ponto4);
        esquerda = new Reta(ponto4, pontoInicial);
    }
}
