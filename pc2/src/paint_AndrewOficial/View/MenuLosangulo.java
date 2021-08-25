package paint_AndrewOficial.View;

import paint_AndrewOficial.View.enums.MenuEnuns;
import paint_AndrewOficial.modelo.Losangulo;

public class MenuLosangulo extends MenuPrincipal{
    protected int opcao;

    public int getOpcao() {
        return opcao;
    }

    public void setOpcao(int opcao) {
        this.opcao = opcao;
    }


    public MenuEnuns MenuLosan() {
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
    public Losangulo create() {
        System.out.println("digite o lado do losangulo sendo ele um inteiro ");
        int lado = in.nextInt();
        Losangulo l1 = new Losangulo(lado);
        return l1;
    }

    // @Override

    public void read(Losangulo retangulo) {

        System.out.println(retangulo);
    }

    //@Override
    public Losangulo update(Losangulo quadrado) {
        read(quadrado);
        //Quadrado quad = this.create();

        // COlegar valores novos do Quadrado
        return null;
    }

    //@Override
    public Boolean delete(Losangulo quadrado) {
        read(quadrado);
        //DEseja realemte apagar?
        return null;
    }

    //@Override
    public void list(Losangulo[] listas) {
        for (Losangulo quad : listas) {
            System.out.println(quad);
        }

    }
}
