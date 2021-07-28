package paint_AndrewOficial.modelo;

public class Retangulo extends Quadrilatero1 {
    float area,perimetro;

    public Retangulo(int base , int altura) {
        lateraldireita=altura;//partes laterais de um retangulo sao considerados altura
        lateralesquerda=altura;
        lateralsuperior=base;//parte de cima e de baixo de retangulos sao considerados bases
        lateralinferior=base;

    }

}
