package paint_AndrewOficial.View;


import paint_AndrewOficial.View.enums.MenuEnuns;
import paint_AndrewOficial.modelo.Retangulo;

public class MenuRetangulo extends MenuPrincipal {
    protected int opcao;

    public int getOpcao() {
        return opcao;
    }

    public void setOpcao(int opcao) {
        this.opcao = opcao;
    }



    public MenuEnuns MenuRet() {
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
    public Retangulo create() {
        System.out.println("Digite um interio para o lado do retangulo");
        int lado = in.nextInt();
        System.out.println("digite um inteiro para  altura do retangulo");
        int altura = in.nextInt();
        Retangulo r1 = new Retangulo(lado, altura);
        return r1;

    }

    // @Override

    public void read(Retangulo retangulo) {

        System.out.println(retangulo);
    }

    //@Override
    public Retangulo update(Retangulo quadrado) {
        read(quadrado);
        //Quadrado quad = this.create();

        // COlegar valores novos do Quadrado
        return null;
    }

    //@Override
    public Boolean delete(Retangulo quadrado) {
        read(quadrado);
        //DEseja realemte apagar?
        return null;
    }

    //@Override
    public void list(Retangulo[] listas) {
        for (Retangulo quad : listas) {
            System.out.println(quad);
        }

    }
}
