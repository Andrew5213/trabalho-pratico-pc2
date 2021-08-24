package paint_AndrewOficial.View;

import paint_AndrewOficial.View.enums.MenuEnuns;
import paint_AndrewOficial.modelo.Circulo;

public class MenuCirculo extends MenuPrincipal {
    protected int opcao;

    public int getOpcao() {
        return opcao;
    }

    public void setOpcao(int opcao) {
        this.opcao = opcao;
    }



    public MenuEnuns MenuCirc() {
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
    public Circulo create() {
        System.out.println("ola agora vamos criar um circulo");
        System.out.println("digite o raio do circulo");
        int raio = in.nextInt();

        Circulo c1 = new Circulo(raio);
        return c1;

    }




    public void read(Circulo retangulo) {

        System.out.println(retangulo);
    }

    //@Override
    public Circulo update(Circulo quadrado) {
        read(quadrado);
        //Quadrado quad = this.create();

        // COlegar valores novos do Quadrado
        return null;
    }

    //@Override
    public Boolean delete(Circulo quadrado) {
        read(quadrado);
        //DEseja realemte apagar?
        return null;
    }

    //@Override
    public void list(Circulo[] listas) {
        for (Circulo quad : listas) {
            System.out.println(quad);
        }

    }
}
