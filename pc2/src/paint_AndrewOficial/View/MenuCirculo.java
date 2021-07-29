package paint_AndrewOficial.View;

import paint_AndrewOficial.modelo.Circulo;

public class MenuCirculo extends MenuPrincipal{
    public Circulo CriarCirculo(){
        System.out.println("ola agora vamos criar um circulo");
        System.out.println("digite o raio do circulo");
        int raio=in.nextInt();
        Circulo c1 = new Circulo(raio);
        return c1;
    }
}
