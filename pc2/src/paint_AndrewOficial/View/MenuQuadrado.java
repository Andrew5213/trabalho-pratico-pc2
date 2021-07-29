package paint_AndrewOficial.View;

import paint_AndrewOficial.modelo.Quadrado1;

public class MenuQuadrado extends MenuPrincipal{
    public Quadrado1 CriarQuadrado(){
        System.out.println("digite o lado do quadrado");
        int lado=in.nextInt();
        Quadrado1 q1 = new Quadrado1(lado);
        return q1;
    }
}
