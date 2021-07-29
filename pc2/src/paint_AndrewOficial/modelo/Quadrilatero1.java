package paint_AndrewOficial.modelo;

public class Quadrilatero1 {
protected int lateralsuperior,lateralinferior,lateralesquerda,lateraldireita;
protected float perimetro , area ;

    public float getPerimetro() {
        return perimetro=lateraldireita+lateralesquerda+lateralinferior+lateralsuperior;
    }



    public float getArea() {
        return area=lateraldireita*lateralsuperior;
    }



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




}
