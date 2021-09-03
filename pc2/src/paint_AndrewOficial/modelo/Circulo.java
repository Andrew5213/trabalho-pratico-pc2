package paint_AndrewOficial.modelo;

public class Circulo extends FigGeometrica {
    int raio, diametro;
    float area;
    private final float raio1 = (float) (2 * raio * 3.14);

    public Circulo(int raio) {
        this.raio = raio;
    }

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public float getArea() {
        return area = (raio1);
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "raio=" + getRaio() +
                ", diametro=" + getDiametro() +
                ", area=" + getArea() +
                '}';
    }
}
