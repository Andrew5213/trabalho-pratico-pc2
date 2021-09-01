package paint_AndrewOficial.View.gui;

import paint_AndrewOficial.View.ICRUDFiguraView;
import paint_AndrewOficial.View.MenuPrincipal;
import paint_AndrewOficial.View.enums.MenuEnuns;

public  abstract class AbstractCRUDCli<T> extends MenuPrincipal
        implements ICRUDFiguraView<T> {

    public MenuEnuns menuPrincipal(){
        //Loop até entregar uma opção válida
        System.out.println("Digite uma opção \n" +
                "1 - Criar\n" +
                "2 - Editar\n" +
                "5 - Mostrar\n"+
                "6 - Apagar\n" +
                "7 - Listar\n" +
                "0 - Sair");

        int opcao = in.nextInt();

        switch (opcao){
            case 1:
                return MenuEnuns.CRIAR;
            case 2:
                return MenuEnuns.EDITAR;
            case 5:
                return MenuEnuns.MOSTRAR;
            case 6:
                return MenuEnuns.APAGAR;
            case 0:
                return MenuEnuns.SAIR;
            case 7:
                return MenuEnuns.LISTAR;
            default:
                return MenuEnuns.SAIR;
        }
    }

    @Override
    public Boolean delete(T toDelete) {
        this.read(toDelete);
        //DEseja realemte apagar?
        return null;
    }

    @Override
    public void list(T[] listas) {
        for (T quad: listas){
            System.out.println(quad);
        }
    }
}
