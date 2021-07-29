package paint_AndrewOficial.View;

import paint_AndrewOficial.modelo.Ponto;

public class MenuPonto extends MenuPrincipal{

    public Ponto CriarPonto(){
    System.out.println("digite a coordenda x do ponto sendo ele  inteiro");
    int x= in.nextInt();
        System.out.println("digite a coordenada y do ponto sendo ele em inteiro");
        int y =in.nextInt();
    Ponto p1 = new Ponto(x,y);
    return p1;
    }
}
