package paint_AndrewOficial.View;

import paint_AndrewOficial.View.enums.MenuEnuns;
import paint_AndrewOficial.modelo.Ponto;


public class MenuPonto extends MenuPrincipal {
    protected int opcao;

    public int getOpcao() {
        return opcao;
    }

    public void setOpcao(int opcao) {
        this.opcao = opcao;
    }



    public MenuEnuns MenuPonto() {
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


    //@Override
    public Ponto create() {
        System.out.println("digite a coordenda x do ponto sendo ele  inteiro");
        int x = in.nextInt();
        System.out.println("digite a coordenada y do ponto sendo ele em inteiro");
        int y = in.nextInt();
        Ponto p1 = new Ponto(x, y);
        return p1;

    }

    // @Override

    public void read(Ponto retangulo) {

        System.out.println(retangulo);
    }

    //@Override
    public Ponto update(Ponto quadrado) {
        read(quadrado);
        //Quadrado quad = this.create();

        // COlegar valores novos do Quadrado
        return null;
    }

    //@Override
    public Boolean delete(Ponto quadrado) {
        read(quadrado);
        //DEseja realemte apagar?
        return null;
    }

    //@Override
    public void list(Ponto[] listas) {
        for (Ponto quad : listas) {
            System.out.println(quad);
        }

    }
}

