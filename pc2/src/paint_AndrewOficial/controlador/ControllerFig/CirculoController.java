package paint_AndrewOficial.controlador.ControllerFig;

import paint_AndrewOficial.View.MenuCirculo;
import paint_AndrewOficial.View.PontoCli;
import paint_AndrewOficial.View.MenuPrincipal;
import paint_AndrewOficial.View.MenuQuadrado;
import paint_AndrewOficial.View.enums.MenuEnuns;
import paint_AndrewOficial.controlador.ControladorInterface.Icirculo;
import paint_AndrewOficial.dao.FigGeometricaDao;
import paint_AndrewOficial.modelo.Circulo;

public class CirculoController implements Icirculo {
    MenuPrincipal p = new MenuPrincipal();
    MenuCirculo tela = new MenuCirculo();
    private FigGeometricaDao dao;

    public CirculoController(FigGeometricaDao dao) {
        PontoCli tela = new PontoCli();
        this.dao = dao;
    }

    @Override
    public MenuEnuns start() {

        MenuEnuns opcao;
        do {
            opcao = tela.MenuCirc();

            p.soutln("escolhi: " + opcao + "\n\n");

            switch (opcao) {
                case CRIAR:
                    Circulo newQuad = tela.create();
                    dao.create(newQuad);

                    break;
                case EDITAR:
//                    p.soutln("digite o novo valor do quadrado ");
                    Circulo  recebe = tela.create();
                    Circulo  newquad = tela.update(recebe);
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
    public Circulo create() {
        return null;
    }


    @Override
    public void read(Circulo conta) {

    }

    @Override
    public Circulo update(Circulo cliSalvar) {
        return null;
    }

    @Override
    public Boolean delete(Circulo cliDeletar) {
        return null;
    }

    @Override
    public void list(Circulo[] listas) {

    }
}
