package paint_AndrewOficial.View;

import paint_AndrewOficial.View.enums.MenuEnuns;
import paint_AndrewOficial.modelo.Triangulo;

public class MenuTriangulo extends MenuPrincipal{
    protected int opcao;

    public int getOpcao() {
        return opcao;
    }

    public void setOpcao(int opcao) {
        this.opcao = opcao;
    }

    public MenuEnuns MenuTrian(){
        //Loop até entregar uma opção válida
        System.out.println("Digite uma opção \n" +
                "1 - Criar\n" +
                "2 - Editar\n" +
                "6 - Apagar\n" +
                "7 - Listar\n" +
                "0 - Sair");

        int opcao = in.nextInt();

        switch (opcao) {
            case 1:
                return MenuEnuns.CRIAR;
            case 2:
                return MenuEnuns.EDITAR;
            case 3:
                return MenuEnuns.APAGAR;
            case 0:
                return MenuEnuns.SAIR;
            case 7:
                return MenuEnuns.LISTAR;
            default:
                return MenuEnuns.SAIR;
        }
    }
    public Triangulo create() {

        System.out.println("ola vamos criar um triangulo ");
        int lado1,lado2,lado3;
        do {

            System.out.println("digite o primeiro lado do triangulo");
            lado1=in.nextInt();
            System.out.println("digite o lado 2 do triangulo");
            lado2=in.nextInt();
            System.out.println("digite o lado 3 do triangulo");
            lado3=in.nextInt();
            Triangulo t1 = new Triangulo(lado1,lado2,lado3);
            return t1;
        }while(lado1>=lado2+lado3 || lado2>=lado1+lado3 || lado3>=lado1+lado2 );
    }

    // @Override

    public void read(Triangulo retangulo) {

        System.out.println(retangulo);
    }

    //@Override
    public Triangulo update(Triangulo quadrado) {
        read(quadrado);
        //Quadrado quad = this.create();

        // COlegar valores novos do Quadrado
        return null;
    }

    //@Override
    public Boolean delete(Triangulo quadrado) {
        read(quadrado);
        //DEseja realemte apagar?
        return null;
    }

    //@Override
    public void list(Triangulo[] listas) {
        for (Triangulo quad : listas) {
            System.out.println(quad);
        }

    }
}



