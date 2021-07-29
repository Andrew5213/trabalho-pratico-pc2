package paint_AndrewOficial.View;


import paint_AndrewOficial.modelo.Retangulo;

public class MenuRetangulo extends MenuPrincipal {
    public Retangulo CriaRetangulo(){
        System.out.println("Digite um interio para o lado do retangulo");
        int lado  = in.nextInt();
        System.out.println("digite um inteiro para  altura do retangulo");
        int altura= in.nextInt();
        Retangulo r1 = new Retangulo(lado,altura);
        return r1;
    }

}
