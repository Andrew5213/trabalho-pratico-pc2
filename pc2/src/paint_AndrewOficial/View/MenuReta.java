package paint_AndrewOficial.View;

import paint_AndrewOficial.modelo.Reta;

public class MenuReta extends MenuPrincipal{
    public Reta CriarReta(){
        System.out.println("digite a cordenada inicial em inteiro do eixo x ");
        int x1,x2,y1,y2;
        x1=in.nextInt();
        System.out.println("digite a cordenada final em inteiro do eixo x  ");
        x2= in.nextInt();
        System.out.println("digite a cordenada inicial em inteiro do eixo y");
        y1= in.nextInt();
        System.out.println("digite a cordenada final em inteiro do eixo y");
        y2= in.nextInt();
        Reta r1 = new Reta(x1,y1,x2,y2);
        return r1;
    }
}
