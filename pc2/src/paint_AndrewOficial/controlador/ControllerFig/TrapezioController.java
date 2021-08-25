package paint_AndrewOficial.controlador.ControllerFig;

import paint_AndrewOficial.View.MenuPrincipal;
import paint_AndrewOficial.View.MenuQuadrado;
import paint_AndrewOficial.View.MenuTrapezio;
import paint_AndrewOficial.View.enums.MenuEnuns;
import paint_AndrewOficial.controlador.ControladorInterface.Itrapezeio;
import paint_AndrewOficial.dao.FigGeometricaDao;
import paint_AndrewOficial.modelo.Ponto;
import paint_AndrewOficial.modelo.Trapezio;

public class TrapezioController implements Itrapezeio {

    MenuPrincipal p = new MenuPrincipal();
    MenuTrapezio tela = new MenuTrapezio();
    private FigGeometricaDao dao;
    public TrapezioController(FigGeometricaDao dao) {
        MenuTrapezio tela = new MenuTrapezio();
        this.dao = dao;
    }

    @Override
    public MenuEnuns start() {

        MenuEnuns opcao;
        do {
            opcao = tela.Menuprinc();

            p.soutln("escolhi: " + opcao + "\n\n");

            switch (opcao) {
                case CRIAR:
                    Trapezio newQuad = tela.create();
                    dao.create(newQuad);

                    break;
                case EDITAR:
//                    p.soutln("digite o novo valor do quadrado ");
                    Trapezio  recebe = tela.create();
                    Trapezio  newquad = tela.update(recebe);
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
