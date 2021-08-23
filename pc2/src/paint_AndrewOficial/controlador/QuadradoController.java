package paint_AndrewOficial.controlador;

import paint_AndrewOficial.View.MenuPrincipal;
import paint_AndrewOficial.View.QuadradoCli;
import paint_AndrewOficial.View.enums.MenuEnuns;
import paint_AndrewOficial.dao.FigGeometricaDao;
import paint_AndrewOficial.modelo.Quadrado1;

public class QuadradoController  implements Iquadrado{
    MenuPrincipal p = new MenuPrincipal();
   QuadradoCli tela =new QuadradoCli();
    private FigGeometricaDao dao;

    public QuadradoController(FigGeometricaDao dao) {
        QuadradoCli tela = new QuadradoCli();
        dao = dao;
    }

    @Override
    public MenuEnuns start() {

        MenuEnuns opcao;
        do{
            opcao = tela.menuPrincipal();

            p.soutln("escolhi: "+ opcao+"\n\n");

            switch (opcao){
                case CRIAR:
                    Quadrado1 newQuad = tela.create();


                    break;
                case EDITAR:
                    p.soutln("digite o novo valor do quadrado ");
                     Quadrado1 recebe = tela.create();
                    Quadrado1 newquad=tela.update(recebe);
                    break;
                case LISTAR:
                    for (int i=0;i< dao.ds.length;i++){
                        if(dao.ds[i]!=null) {
                            p.soutln(dao.ds[i].toString());
                        }
                    }
                    //*ArrayList<Quadrado1> lista = new ArrayList<Quadrado1>();
                    //for (FigGeometrica fig: dao.getItens()){
                      //  if( fig instanceof Quadrado1){
                         //   lista.add((Quadrado1) fig);
                       // }
                        //}
                   // tela.list((Quadrado1[]) lista.toArray());
                    break;
                case APAGAR:
                    p.soutln("digite qual e a figura q sera apagada ");

                    break;
                case SALVAR:
                    dao.salvarEmArquivo();
                    break;
                case RECUPERAR:
                    dao.carregarDeArquivo();
                    break;


                case SAIR:
                    break;
                default:
            }


        }while (opcao != MenuEnuns.SAIR);

        return MenuEnuns.SAIR;
    }

    @Override
    public Quadrado1 create() {
        return null;
    }

    @Override
    public void read(Quadrado1 conta) {

    }

    @Override
    public Quadrado1 update(Quadrado1 cliSalvar) {
        return null;
    }

    @Override
    public Boolean delete(Quadrado1 cliDeletar) {
        return null;
    }

    @Override
    public void list(Quadrado1[] listas) {

    }

}
