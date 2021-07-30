package paint_AndrewOficial.View;

import paint_AndrewOficial.modelo.Losangulo;

public class MenuLosangulo extends MenuPrincipal{
    public Losangulo CriarLosangulo(){
        System.out.println("digite o lado do losangulo sendo ele um inteiro ");
        int lado = in.nextInt();
        Losangulo l1 = new Losangulo(lado);
        return l1;
    }
}
