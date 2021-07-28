package paint_AndrewOficial.modelo;

public class Quadrilatero1 {
protected int lateralsuperior,lateralinferior,lateralesquerda,lateraldireita;

    public int getLateralsuperior() {
        return lateralsuperior;
    }

    public void setLateralsuperior(int lateralsuperior) {
        this.lateralsuperior = lateralsuperior;
    }

    public int getLateralinferior() {
        return lateralinferior;
    }

    public void setLateralinferior(int lateralinferior) {
        this.lateralinferior = lateralinferior;
    }

    public int getLateralesquerda() {
        return lateralesquerda;
    }

    public void setLateralesquerda(int lateralesquerda) {
        this.lateralesquerda = lateralesquerda;
    }

    public int getLateraldireita() {
        return lateraldireita;
    }

    public void setLateraldireita(int lateraldireita) {
        this.lateraldireita = lateraldireita;
    }
    //agora vamos fazer a area do perimetro

    public float perimetroQuadrilatero(int x, int y, int z, int w){
        int peri=x+y+z+w; // deste modo o perimetro para um quadrilatero
        return peri;
    }
  // como um quadrilatero pode ter lados completamente diferentes nao vamos fazer o calculo da area para ele

}
