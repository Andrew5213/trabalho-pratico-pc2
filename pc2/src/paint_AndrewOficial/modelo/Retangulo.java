package paint_AndrewOficial.modelo;

public class Retangulo extends Quadrilatero1 {

            int lateral,altura; ;

    public Retangulo(int lateral, int altura) {
        this.setLateral(lateral);
        this.setAltura(altura);
    }



    public int getLateral() {
        return lateral;
    }

    public void setLateral(int lateral) {
        this.lateral = lateral;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
   @Override
   public float getPerimetro() {
       return perimetro=(altura*2)+(lateral*2);
   }
  @Override

  public float getArea() {
      return area=lateral*altura;
  }

    @Override
    public String toString() {
        return "Retangulo{" +
                "perimetro=" + getPerimetro() +
                ", area=" + getArea() +
                '}';
    }
}


