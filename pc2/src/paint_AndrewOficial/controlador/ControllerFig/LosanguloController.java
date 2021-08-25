package paint_AndrewOficial.controlador.ControllerFig;

import paint_AndrewOficial.View.MenuLosangulo;
import paint_AndrewOficial.View.MenuPrincipal;
import paint_AndrewOficial.View.MenuQuadrado;
import paint_AndrewOficial.View.enums.MenuEnuns;
import paint_AndrewOficial.controlador.ControladorInterface.Ilosangulo;
import paint_AndrewOficial.dao.FigGeometricaDao;
import paint_AndrewOficial.modelo.Losangulo;

public class LosanguloController implements Ilosangulo {
    MenuPrincipal p = new MenuPrincipal();
    MenuLosangulo tela = new MenuLosangulo();
    private FigGeometricaDao dao;

    public LosanguloController(FigGeometricaDao dao) {
        MenuLosangulo tela = new MenuLosangulo();
        this.dao = dao;
    }
    @Override
    public MenuEnuns start() {

        MenuEnuns opcao;
        do {
            opcao = tela.MenuLosan();

            p.soutln("escolhi: " + opcao + "\n\n");

            switch (opcao) {
                case CRIAR:
                    Losangulo newQuad = tela.create();
                    dao.create(newQuad);

                    break;
                case EDITAR:
//                    p.soutln("digite o novo valor do quadrado ");
                    Losangulo recebe = tela.create();
                    Losangulo newquad = tela.update(recebe);
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
    public Losangulo create() {
        return null;
    }

    @Override
    public void read(Losangulo conta) {

    }

    @Override
    public Losangulo update(Losangulo cliSalvar) {
        return null;
    }

    @Override
    public Boolean delete(Losangulo cliDeletar) {
        return null;
    }

    @Override
    public void list(Losangulo[] listas) {

    }
}
