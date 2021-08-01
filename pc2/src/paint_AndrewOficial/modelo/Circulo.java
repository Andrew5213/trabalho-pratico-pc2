package paint_AndrewOficial.modelo;

public class Circulo extends FigGeometrica{
    int raio,diametro;
    float area;

    public Circulo(int raio) {
        this.raio = raio;
    }

    public int  getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int  diametro) {
        this.diametro = diametro;
    }
private float raio1= (float) (2*raio*3.14);
    public float getArea() {
        return area= (raio1);
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "raio=" + raio1 +
                ", diametro=" + getDiametro() +
                ", area=" + getArea() +
                '}';
    }
}
