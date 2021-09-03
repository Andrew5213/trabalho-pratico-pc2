package paint_AndrewOficial.controlador;

import paint_AndrewOficial.View.enums.MenuEnuns;
import paint_AndrewOficial.View.gui.ICRUDFiguraView;
import paint_AndrewOficial.dao.FigGeometricaDao;
import paint_AndrewOficial.modelo.FigGeometrica;
import paint_AndrewOficial.modelo.Quadrado1;

import java.util.Scanner;

//import paint_AndrewOficial.View.Cli.MenuPrincipal;

public abstract class AbstractCRUDController<T> implements iCrudController<T> {
    protected ICRUDFiguraView<T> tela;
    private FigGeometricaDao dao;
    protected Scanner in;


    public AbstractCRUDController(FigGeometricaDao dao) {
        this.dao = dao;
    }

    public MenuEnuns start(int i) {
        in = new Scanner(System.in);
        MenuEnuns opcao;
        do {
            opcao = tela.menuPrincipal();

            tela.showMessage("escolhi: " + opcao + "\n\n");

            switch (opcao) {
                case CRIAR:
                    T newQuad = tela.create();
                    dao.create((FigGeometrica) newQuad);

                    break;
                case EDITAR:
                    //  tela.showMessage("digite o novo valor do quadrado ");

                    dao.Listar(i);
                    System.out.println("Escolha uma posicao: ");
                    int pos = in.nextInt();
                    T newquad = tela.create();
                    dao.editar(pos - 1, (FigGeometrica) newquad);
                    break;
                case LISTAR:
                    dao.Listar(i);


                    break;
                case APAGAR:
                  dao.apagar();
                    break;


                case SAIR:
                    break;
                default:
            }


        } while (opcao != MenuEnuns.SAIR);

        return MenuEnuns.SAIR;
    }

    @Override
    public T create() {
        return null;
    }

    //@Override
    public void read(Quadrado1 conta) {

    }


    @Override
    public T update(T cliSalvar) {
        return null;
    }

    @Override
    public Boolean delete(T cliDeletar) {
        return null;
    }

    @Override
    public void list(T[] listas) {

    }

}
