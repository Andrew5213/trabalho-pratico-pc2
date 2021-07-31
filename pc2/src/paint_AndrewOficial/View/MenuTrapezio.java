package paint_AndrewOficial.View;

import paint_AndrewOficial.modelo.Trapezio;

public class MenuTrapezio extends MenuPrincipal{
    //int basemaior, int basemenor, int lado1, int lado2
    public Trapezio CriaTrapezio(){
        soutln("digite em inteiros a base maior do trapezio  ");
        int basemaior=in.nextInt();
        soutln("digite em inteiro a base menor do trapezio  ");
        int basemenor=in.nextInt();
        soutln("digite em inteiro o lado 1 do trapezio");
        int lado1=in.nextInt();
        soutln("digite em inteiros o lado2 do trapezio");
        int lado2= in.nextInt();
        Trapezio t11 = new Trapezio( basemaior,  basemenor,  lado1,  lado2);
        return t11;
    }
}
