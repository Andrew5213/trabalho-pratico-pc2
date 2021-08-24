package paint_AndrewOficial.View;


import paint_AndrewOficial.View.enums.MenuEnuns;
import paint_AndrewOficial.modelo.Quadrado1;

import java.util.Scanner;

public class QuadradoCli extends MenuPrincipal  {
    Scanner in = new Scanner(System.in);

    public MenuEnuns menuPrincipal(){
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
    public Quadrado1 create() {
        System.out.println("Digite um interio para o tamanho do lado do quadrado");
        int tamanho  = in.nextInt();
        Quadrado1 quad = new Quadrado1(tamanho);

        return quad;

    }

   // @Override

    public void read(Quadrado1 quadrado) {

        System.out.println(quadrado);
    }

    //@Override
    public Quadrado1 update(Quadrado1 quadrado) {
        read(quadrado);
        //Quadrado quad = this.create();

        // COlegar valores novos do Quadrado
        return null;
    }

    //@Override
    public Boolean delete(Quadrado1 quadrado) {
        read(quadrado);
        //DEseja realemte apagar?
        return null;
    }

    //@Override
    public void list(Quadrado1[] listas) {
        for (Quadrado1 quad: listas){
            System.out.println(quad);
        }
    }
}
