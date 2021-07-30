package paint_AndrewOficial.modelo;
import paint_AndrewOficial.View.MenuPrincipal;
public class Triangulo extends FigGeometrica{
    protected int lado1,lado2,lado3;
    protected  float area,perimentro;
MenuPrincipal m1 = new MenuPrincipal();
    public Triangulo(int lado1, int lado2, int lado3) {
        //para criar triangulo qualquer um dos lados tem q ser menor q a soma dos outros dois lados
        if(lado1<lado2+lado3 || lado2<lado1+lado3 || lado3<lado1+lado2) {
            // desta forma criamos um triangulo respeitando sua lei
            this.lado1 = lado1;
            this.lado2 = lado2;
            this.lado3 = lado3;
        } else{
            m1.soutln("este triangulo nao pode ser criado pois nao atende as regras de criacao ");
        }
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

    public int getLado3() {
        return lado3;
    }

    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }

    public float getArea() {

        return area;
    }



    public float getPerimentro() {
        return perimentro=getLado1()+getLado2()+getLado3();
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "area=" + area +
                ", perimentro=" + perimentro +
                '}';
    }
}
