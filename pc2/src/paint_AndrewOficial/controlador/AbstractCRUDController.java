package paint_AndrewOficial.controlador;

import paint_AndrewOficial.View.ICRUDFiguraView;
import paint_AndrewOficial.View.MenuQuadrado;
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
                    tela.showMessage("digite o novo valor do quadrado ");
                    T recebe = tela.create();
                    T newquad = tela.update(recebe);
                    break;
                case LISTAR:
                    ArrayList<Quadrado1> lista = new ArrayList<Quadrado1>();
                    for (FigGeometrica fig: dao.getItens()){
                        if( fig instanceof Quadrado1){
                            lista.add((Quadrado1) fig);
                        }
                    }
                    tela.list((T[]) lista.toArray());

                    break;
                case MOSTRAR:
                    tela.showMessage("digite a id que sera mostrado");
                    MenuQuadrado q = new MenuQuadrado();
                    q.receber();
                    tela.showMessage(dao.ds[q.getA()].toString());
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
