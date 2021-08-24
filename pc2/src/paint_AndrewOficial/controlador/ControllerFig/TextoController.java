package paint_AndrewOficial.controlador.ControllerFig;

import paint_AndrewOficial.View.MenuPrincipal;
import paint_AndrewOficial.View.MenuQuadrado;
import paint_AndrewOficial.View.MenuRetangulo;
import paint_AndrewOficial.View.MenuTexto;
import paint_AndrewOficial.View.enums.MenuEnuns;
import paint_AndrewOficial.controlador.ControladorInterface.ITexto;
import paint_AndrewOficial.dao.FigGeometricaDao;
import paint_AndrewOficial.modelo.Retangulo;
import paint_AndrewOficial.modelo.Texto;

public class TextoController implements ITexto {

    MenuPrincipal p = new MenuPrincipal();
    MenuTexto tela = new MenuTexto();
    private FigGeometricaDao dao;
    public TextoController(FigGeometricaDao dao) {
        MenuRetangulo tela = new MenuRetangulo();
        this.dao = dao;
    }
    public MenuEnuns start() {

        MenuEnuns opcao;
        do {
            opcao = tela.SubMenu();

            p.soutln("escolhi: " + opcao + "\n\n");

            switch (opcao) {
                case CRIAR:
                    Texto ne = tela.create();
                    dao.create(ne);

                    break;
                case EDITAR:
//                    p.soutln("digite o novo valor do quadrado ");
                    Texto recebe = tela.create();
                    Texto ned = tela.update(recebe);
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
    public Texto create() {
        return null;
    }

    @Override
    public void read(Texto conta) {

    }

    @Override
    public Retangulo update(Texto cliSalvar) {
        return null;
    }

    @Override
    public Boolean delete(Texto cliDeletar) {
        return null;
    }

    @Override
    public void list(Texto[] listas) {

    }
}
