package paint_AndrewOficial.modelo;

public class Losangulo extends Quadrilatero1 {

    protected int lado;// como o losangulo tem todos os lados iguais o usuario ira declarar somente u lado

    public Losangulo(int lado) {
        this.lado = lado;
    }

    @Override

    public float getPerimetro() {
        return perimetro = lado * 4;
    }

    @Override


    public float getArea() {
        //estamos trabalhando nisso.
        return area;
    }

    @Override
    public String toString() {
        return "Losangulo{" +
                "lado=" + lado +
                ", perimetro=" + getPerimetro() +
                ", area=" + getArea() +
                '}';
    }
}
