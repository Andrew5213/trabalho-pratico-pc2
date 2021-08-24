package paint_AndrewOficial.controlador.ControllerFig;

import paint_AndrewOficial.View.MenuPonto;
import paint_AndrewOficial.View.MenuPrincipal;
import paint_AndrewOficial.View.MenuQuadrado;
import paint_AndrewOficial.View.enums.MenuEnuns;
import paint_AndrewOficial.controlador.ControladorInterface.Iponto;
import paint_AndrewOficial.dao.FigGeometricaDao;
import paint_AndrewOficial.modelo.Ponto;

public class PontoController implements Iponto {

    MenuPrincipal p = new MenuPrincipal();
    MenuPonto tela = new MenuPonto();
    private FigGeometricaDao dao;

    public PontoController(FigGeometricaDao dao) {
        MenuPonto tela = new MenuPonto();
        this.dao = dao;
    }

    @Override
    public MenuEnuns start() {

        MenuEnuns opcao;
        do {
            opcao = tela.MenuPonto();

            p.soutln("escolhi: " + opcao + "\n\n");

            switch (opcao) {
                case CRIAR:
                    Ponto newQuad = tela.create();
                    dao.create(newQuad);

                    break;
                case EDITAR:
//                    p.soutln("digite o novo valor do quadrado ");
                    Ponto recebe = tela.create();
                    Ponto newquad = tela.update(recebe);
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
    public Ponto create() {
        return null;
    }

    @Override
    public void read(Ponto conta) {

    }

    @Override
    public Ponto update(Ponto cliSalvar) {
        return null;
    }

    @Override
    public Boolean delete(Ponto cliDeletar) {
        return null;
    }

    @Override
    public void list(Ponto[] listas) {

    }
}
