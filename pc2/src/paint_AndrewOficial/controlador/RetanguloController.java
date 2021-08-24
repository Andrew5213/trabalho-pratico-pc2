package paint_AndrewOficial.controlador;

import paint_AndrewOficial.View.MenuPrincipal;
import paint_AndrewOficial.View.MenuQuadrado;
import paint_AndrewOficial.View.MenuRetangulo;
import paint_AndrewOficial.View.enums.MenuEnuns;
import paint_AndrewOficial.controlador.ControladorFig.IRetangulo;
import paint_AndrewOficial.dao.FigGeometricaDao;
import paint_AndrewOficial.modelo.Retangulo;

public class RetanguloController implements IRetangulo {
    MenuPrincipal p = new MenuPrincipal();
    MenuRetangulo tela = new MenuRetangulo();
    private FigGeometricaDao dao;

    public RetanguloController(FigGeometricaDao dao) {
        MenuRetangulo tela = new MenuRetangulo();
        this.dao = dao;
    }
    @Override
    public MenuEnuns start() {

        MenuEnuns opcao;
        do {
            opcao = tela.MenuRet();

            p.soutln("escolhi: " + opcao + "\n\n");

            switch (opcao) {
                case CRIAR:
                    Retangulo ne = tela.create();
                    dao.create(ne);

                    break;
                case EDITAR:
//                    p.soutln("digite o novo valor do quadrado ");
                    Retangulo recebe = tela.create();
                    Retangulo ned = tela.update(recebe);
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
    public Retangulo create() {
        return null;
    }

    @Override
    public void read(Retangulo conta) {

    }

    @Override
    public Retangulo update(Retangulo cliSalvar) {
        return null;
    }

    @Override
    public Boolean delete(Retangulo cliDeletar) {
        return null;
    }

    @Override
    public void list(Retangulo[] listas) {

    }
}
