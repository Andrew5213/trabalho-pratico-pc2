package paint_AndrewOficial.controlador;

import paint_AndrewOficial.View.ICRUDFiguraView;
import paint_AndrewOficial.View.enums.MenuEnuns;
import paint_AndrewOficial.dao.FigGeometricaDao;
import paint_AndrewOficial.modelo.FigGeometrica;
import paint_AndrewOficial.modelo.Quadrado1;

import java.util.ArrayList;

//import paint_AndrewOficial.View.MenuPrincipal;

public abstract class AbstractCRUDController<T> implements  iCrudController<T>{
    protected ICRUDFiguraView<T> tela;
    private FigGeometricaDao dao;


    public AbstractCRUDController(FigGeometricaDao dao) {
        this.dao = dao;
    }
    public MenuEnuns start() {
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
                    T recebe = tela.create();
                   T newquad = tela.update(recebe);
                    break;
                case LISTAR:
                    ArrayList<T> lista = new ArrayList<T>();
                    for (FigGeometrica fig: dao.getItens()){
                        if(fig != null){
                            lista.add((T) fig);
                        }
                    }

                        tela.list((T[]) lista.toArray());


                    break;
                case APAGAR:

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
