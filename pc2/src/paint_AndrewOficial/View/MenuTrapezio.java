package paint_AndrewOficial.View;

import paint_AndrewOficial.View.enums.MenuEnuns;
import paint_AndrewOficial.modelo.Trapezio;

public class MenuTrapezio extends MenuPrincipal{
    //int basemaior, int basemenor, int lado1, int lado2

    public MenuEnuns Menu(){
        //Loop até entregar uma opção válida
        System.out.println("Digite uma opção \n" +
                "1 - Criar\n" +
                "2 - Editar\n" +
                "6 - Apagar\n" +
                "7 - Listar\n" +
                "0 - Sair");

        int opcao = in.nextInt();

        switch (opcao){
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



    //@Override
    public Trapezio create() {
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

    // @Override

    public void read(Trapezio retangulo) {

        System.out.println(retangulo);
    }

    //@Override
    public Trapezio update(Trapezio quadrado) {
        read(quadrado);
        //Quadrado quad = this.create();

        // COlegar valores novos do Quadrado
        return null;
    }

    //@Override
    public Boolean delete(Trapezio quadrado) {
        read(quadrado);
        //DEseja realemte apagar?
        return null;
    }

    //@Override
    public void list(Trapezio[] listas) {
        for (Trapezio quad : listas) {
            System.out.println(quad);
        }

    }
    }

