package paint_AndrewOficial.View;

import paint_AndrewOficial.View.enums.MenuEnuns;
import paint_AndrewOficial.modelo.Reta;

public class MenuReta extends MenuPrincipal {
    protected int opcao;

    public int getOpcao() {
        return opcao;
    }

    public void setOpcao(int opcao) {
        this.opcao = opcao;
    }

    public Reta CriarReta() {
        int x1, x2, y1, y2;
        System.out.println("digite a cordenada inicial em inteiro do eixo x ");

        x1 = in.nextInt();
        System.out.println("digite a cordenada final em inteiro do eixo x  ");
        x2 = in.nextInt();
        System.out.println("digite a cordenada inicial em inteiro do eixo y");
        y1 = in.nextInt();
        System.out.println("digite a cordenada final em inteiro do eixo y");
        y2 = in.nextInt();
        Reta r1 = new Reta(x1, y1, x2, y2);
        return r1;


    }

    public MenuEnuns MenuReta() {
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

    public Reta create() {
        int x1, x2, y1, y2;
        System.out.println("digite a cordenada inicial em inteiro do eixo x ");

        x1 = in.nextInt();
        System.out.println("digite a cordenada final em inteiro do eixo x  ");
        x2 = in.nextInt();
        System.out.println("digite a cordenada inicial em inteiro do eixo y");
        y1 = in.nextInt();
        System.out.println("digite a cordenada final em inteiro do eixo y");
        y2 = in.nextInt();
        Reta r1 = new Reta(x1, y1, x2, y2);
        return r1;


    }

    // @Override

    public void read(Reta retangulo) {

        System.out.println(retangulo);
    }

    //@Override
    public Reta update(Reta quadrado) {
        read(quadrado);
        //Quadrado quad = this.create();

        // COlegar valores novos do Quadrado
        return null;
    }

    //@Override
    public Boolean delete(Reta quadrado) {
        read(quadrado);
        //DEseja realemte apagar?
        return null;
    }

    //@Override
    public void list(Reta[] listas) {
        for (Reta quad : listas) {
            System.out.println(quad);
        }

    }
}
