package paint_AndrewOficial.controlador;

import paint_AndrewOficial.View.gui.*;
import paint_AndrewOficial.View.*;
import paint_AndrewOficial.View.enums.MenuEnuns;
import paint_AndrewOficial.dao.FigGeometricaDao;
import paint_AndrewOficial.modelo.FigGeometrica;
import paint_AndrewOficial.modelo.Quadrado1;
import paint_AndrewOficial.modelo.Texto;
import trabalho_pratico.model.Ponto;

import java.util.ArrayList;

public class principal {
    //private FiguraGeometricaDAO dao;
    private IMenuPaintView tela;
    private FigGeometricaDao dao;
    MenuPrincipal m1 = new MenuPrincipal();
    MenuEnuns opcao = MenuEnuns.LISTAR;
    MenuRetangulo r2 = new MenuRetangulo();
    MenuQuadrado q11 = new MenuQuadrado();
    MenuPonto p1 = new MenuPonto();
    MenuCirculo c1 = new MenuCirculo();
    MenuTriangulo t1 = new MenuTriangulo();
    MenuLosangulo l1 = new MenuLosangulo();
    MenuReta r = new MenuReta();
    MenuTrapezio t11 = new MenuTrapezio();
    Paint_Janela p11 = new Paint_Janela();
    MenuDesenhos d1 = new MenuDesenhos();
    MenuTexto tx = new MenuTexto();
    FigGeometricaDao d = new FigGeometricaDao(10);

    private FigGeometrica[] vetor;
    private Texto[] vet;
    private int posicaodovetor;

    public int getPosicaodovetor() {
        return posicaodovetor;
    }

    public void setPosicaodovetor(int posicaodovetor) {
        this.posicaodovetor = posicaodovetor;
    }

    QuadradoController quadController = new QuadradoController(dao);

    public principal() {

        vetor = new FigGeometrica[10];

    }

    public boolean insertFigGeométrica(FigGeometrica fig) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == null) {
                vetor[i] = fig;
                this.posicaodovetor = i;
                return true;
            } else {
                m1.soutln("vetor esta cheio ");// excessao

            }

        }
        return false;

    }

    public void Exe() {
        do {

            opcao = m1.Menuprinc();


            m1.sout("escolhi: " + opcao + "\n\n");
            switch (opcao) {

                case QUADRADO:
                    q11.MenuQuad();
                    //quadController.start();
                    switch (q11.getOpcao()) {
                        case 1:
                            insertFigGeométrica(q11.CriarQuadrado());
                            break;
                        case 2:
                            //editar
                            m1.soutln("digite o id do vetor ");
                            q11.receber();

                            vetor[q11.getA()] = q11.CriarQuadrado();


                            break;
                        case 3:
                            //listar os itens do msm tipo
                            for (int i = 0; i < vetor.length; i++) {
                                //aqui queria comparar se eles sao do mesmo tipo mas nao sei fazer isso.
                            }
                    }


                    break;
                case RETANGULO:
                    //  insertFigGeométrica(r2.CriaRetangulo());
                    r2.MenuRet();
                    // m1.soutln("retangulo criado");
                    switch (r2.getOpcao()) {
                        case 1://novo
                            insertFigGeométrica(r2.CriaRetangulo());

                            //d.create(r2.CriaRetangulo());
                            m1.soutln("retangulo  criado a posicao dele no vetor e " + this.posicaodovetor);
                            break;
                        case 2:


                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        case 5:
                            break;
                        case 0:
                            break;
                    }

                    break;
                case CIRCULO:
                    c1.MenuCirc();
                    switch (c1.getOpcao()) {
                        case 1://novo
                            insertFigGeométrica(c1.CriarCirculo());
                            //d.create(c1.CriarCirculo());
                            m1.soutln("circulo  criado");
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        case 5:
                            break;
                        case 0:
                            break;
                    }
                    break;
                case PONTO:
                    p1.MenuPonto();

                    switch (p1.getOpcao()) {
                        case 1://novo
                            insertFigGeométrica(p1.CriarPonto());
                            //d.create(p1.CriarPonto());
                            m1.soutln("ponto  criado");
                            break;
                        case 2:

                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        case 5:
                            break;
                        case 0:
                            break;
                    }

                    break;
                case TRIANGULO:
                    t1.MenuTrian();
                    switch (t1.getOpcao()) {
                        case 1://novo
                            insertFigGeométrica(t1.CriarTriangulo());
                            //d.create(t1.CriarTriangulo());
                            m1.soutln("triangulo   criado");
                            break;
                        case 2:

                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        case 5:
                            break;
                        case 0:
                            break;
                    }
                    break;
                case LOSANGULO:
                    l1.MenuLosan();
                    switch (l1.getOpcao()) {
                        case 1://novo
                            insertFigGeométrica(l1.CriarLosangulo());
                            // d.create(l1.CriarLosangulo());
                            m1.soutln("losangulo   criado");
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        case 5:
                            break;
                        case 0:
                            break;
                    }
                    break;

                case TEXTO:
                    tx.SubMenu();
                    // in.nextline();
                    switch (tx.getOpcao1()) {
                        case 1:
                            insertFigGeométrica(tx.CriarTexto());
                            //d.create(tx.CriarTexto());
                            m1.soutln("texto criado");
                            break;
                        case 2:

                    }


                    break;
                case SALVAR:
                    dao.salvarEmArquivo();
                    break;
                case RECUPERAR:
                    Boolean resposta = dao.carregarDeArquivo();
                    break;

                case RETA:
                    r.MenuReta();
                    switch (r.getOpcao()) {
                        case 1://novo
                            insertFigGeométrica(r.CriarReta());
                            //d.create(r.CriarReta());
                            m1.soutln("reta    criada");
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        case 5:
                            break;
                        case 0:
                            break;
                    }
                    break;
                case LISTAR:
                    for (int i = 0; i < vetor.length; i++) {
                        if (vetor[i] != null) {
                            m1.soutln(vetor[i].toString());
                        }
                    }
                    d.getItens();


                    break;

                case DESENHAR:
                    d1.Escolha();
                    switch (d1.getI()) {
                        case 1:
                            p11.PintarQuadrado();
                            break;
                        case 2:
                            p11.PintarRetangulo();
                            break;
                        case 3:
                            p11.PintarTriangulo();
                            break;
                        case 4:
                            p11.PintarCirculo();
                            break;
                        case 5:
                            p11.PintarReta();
                            break;
                        case 6:
                            p11.PintarLosangulo();//este nao consegi fazer funcionar graficamente
                    }
                    break;
                case SAIR:
                    break;
                case TRAPEZIO:
                    insertFigGeométrica(t11.CriaTrapezio());
                    break;
                default:
            }
        } while (opcao != MenuEnuns.SAIR);
    }

    public void testandoArrayList() {
        ArrayList lista = new ArrayList();
        lista.add(1);
        lista.add("dsdsdsd");
        lista.add(new Ponto());
        lista.add(new ArrayList());
        m1.soutln("------------TESTE parametrico---------------");
        ArrayList<FigGeometrica> listaFig = new ArrayList();
        listaFig.add(new Quadrado1(1));
        m1.soutln("");
        m1.soutln("------------FIM TESTE---------------");
    }

}