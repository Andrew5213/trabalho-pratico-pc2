package paint_AndrewOficial.controlador.ControllerFig;

import paint_AndrewOficial.View.MenuPrincipal;
import paint_AndrewOficial.View.MenuQuadrado;
import paint_AndrewOficial.View.MenuReta;
import paint_AndrewOficial.View.enums.MenuEnuns;
import paint_AndrewOficial.controlador.ControladorInterface.Ireta;
import paint_AndrewOficial.dao.FigGeometricaDao;
import paint_AndrewOficial.modelo.Reta;

public class RetaController implements Ireta {
    MenuPrincipal p = new MenuPrincipal();
    MenuReta tela = new MenuReta();
    private FigGeometricaDao dao;

    public RetaController(FigGeometricaDao dao) {
        MenuReta tela = new MenuReta()
                ;
        this.dao = dao;
    }
    @Override
    public MenuEnuns start() {

        MenuEnuns opcao;
        do {
            opcao = tela.MenuReta();

            p.soutln("escolhi: " + opcao + "\n\n");

            switch (opcao) {
                case CRIAR:
                    Reta newQuad = tela.create();
                    dao.create(newQuad);

                    break;
                case EDITAR:
//                    p.soutln("digite o novo valor do quadrado ");
                    Reta recebe = tela.create();
                    Reta newquad = tela.update(recebe);
                    break;
                case LISTAR:
                    for (int i = 0; i < dao.ds.length; i++) {
                        if (dao.ds[i] != null) {
                            p.soutln(dao.ds[i].toString());
                        }
                    }

                    break;
                case MOSTRAR:
                    p.soutln("digite a id que sera mostrado");
                    MenuQuadrado q = new MenuQuadrado();
                    q.receber();
                    p.soutln(dao.ds[q.getA()].toString());
                    break;


                case SAIR:
                    break;
                default:
            }


        } while (opcao != MenuEnuns.SAIR);

        return MenuEnuns.SAIR;
    }


    @Override
    public Reta create() {
        return null;
    }

    @Override
    public void read(Reta conta) {

    }

    @Override
    public Reta update(Reta cliSalvar) {
        return null;
    }

    @Override
    public Boolean delete(Reta cliDeletar) {
        return null;
    }

    @Override
    public void list(Reta[] listas) {

    }
}
