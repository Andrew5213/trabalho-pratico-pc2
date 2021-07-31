package paint_AndrewOficial.modelo;

public class Trapezio extends FigGeometrica{
    protected int basemaior, basemenor,lado1,lado2;
    protected  float area,perimetro;
    public Trapezio(int basemaior, int basemenor, int lado1, int lado2) {
        this.basemaior = basemaior;
        this.basemenor = basemenor;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public int getBasemaior() {
        return basemaior;
    }

    public void setBasemaior(int basemaior) {
        this.basemaior = basemaior;
    }

    public int getBasemenor() {
        return basemenor;
    }

    public void setBasemenor(int basemenor) {
        this.basemenor = basemenor;
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public float getArea() {
        return area;
    }

    public float getPerimetro() {
        return perimetro=basemenor+basemaior+lado1+lado2;
    }

}
