package paint_AndrewOficial.modelo;

public class Reta extends FigGeometrica{
    protected  int tamanho,x1,y1,x2,y2;

    public Reta( int x11, int y11, int x2, int y2) {
        this.x1 = x11;
        this.y1 = y11;
        this.x2 = x2;
        this.y2 = y2;
    }

    public int getTamanho() {
        // o tamanho sera em relacao somente o eixo x
        return tamanho=x2-x1;
    }
}
