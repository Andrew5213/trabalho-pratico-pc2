package paint_AndrewOficial.modelo;

public class Quadrado1 extends Quadrilatero1{
    protected int lado;

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public Quadrado1(int lado) {

        this.setLado(lado);
    }
    @Override
    public float getPerimetro() {
        return perimetro=lado*4;
    }
    @Override
    public float getArea() {
        return area=lado*lado;
    }

    @Override
    public String toString() {
        return "Quadrado{" +
                "lado=" + getLado() +
                ", perimetro=" + getPerimetro() +
                ", area=" + getArea() +
                '}';
    }
}
