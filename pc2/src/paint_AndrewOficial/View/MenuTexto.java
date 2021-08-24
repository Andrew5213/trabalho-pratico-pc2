package paint_AndrewOficial.View;

import paint_AndrewOficial.View.enums.MenuEnuns;
import paint_AndrewOficial.modelo.Texto;

public class MenuTexto extends MenuPrincipal  {
   protected int quantidade;

    public int getOpcao1() {
        return opcao1;
    }

    public void setOpcao1(int opcao1) {
        this.opcao1 = opcao1;
    }

    protected int opcao1;;
   protected String palavra;


    public Texto create() {

        System.out.println("digite uma palavra  ");
        String guambiarra=in.nextLine();
        String palavra= in.nextLine();
        Texto tx = new Texto(palavra);
        return tx;
    }

    // @Override

    public void read(Texto Texto) {

        System.out.println(Texto);
    }

    //@Override
    public Texto update(Texto Texto) {
        read(Texto);
        //Quadrado quad = this.create();

        // COlegar valores novos do Quadrado
        return null;
    }

    //@Override
    public Boolean delete(Texto quadrado) {
        read(quadrado);
        //DEseja realemte apagar?
        return null;
    }

    //@Override
    public void list(Texto[] listas) {
        for (Texto quad : listas) {
            System.out.println(quad);
        }

    }
   public MenuEnuns  SubMenu() {
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
   }

