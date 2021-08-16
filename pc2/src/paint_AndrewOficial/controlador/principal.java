package paint_AndrewOficial.controlador;

import paint_AndrewOficial.View.*;
import paint_AndrewOficial.View.enums.MenuEnuns;
import paint_AndrewOficial.modelo.FigGeometrica;
import paint_AndrewOficial.modelo.Quadrado1;
import paint_AndrewOficial.modelo.Texto;
import trabalho_pratico.model.Ponto;

import java.util.ArrayList;
public class principal {
    MenuPrincipal m1 = new MenuPrincipal();
    MenuEnuns opcao = MenuEnuns.LISTAR;
    MenuRetangulo r2 = new MenuRetangulo();
    MenuQuadrado q11 = new MenuQuadrado();
    MenuPonto p1 = new MenuPonto();
    MenuCirculo c1 = new MenuCirculo();
    MenuTriangulo t1 = new MenuTriangulo();
    MenuLosangulo l1 = new MenuLosangulo();
    MenuReta r = new MenuReta();
    MenuTrapezio t11= new MenuTrapezio();
    Paint_Janela p11 = new Paint_Janela();
    MenuDesenhos d1= new MenuDesenhos();
    MenuTexto tx = new MenuTexto();
    private MenuPrincipal tela;
    private FigGeometrica[] vetor;
    private Texto[] vet;
    public principal(){
        vetor= new FigGeometrica[10];
        tela = new MenuPrincipal();
    }
    public boolean insertFigGeométrica(FigGeometrica fig) {
        for (int i=0;i< vetor.length;i++){
            if(vetor[i]==null) {
                vetor[i] = fig;
                return true;
            }else{
                m1.soutln("vetor esta cheio ");// excessao

            }

        }
        return false;

    }
    public void Exe() {
        do {
            String vet[]= new String[tx.getQuad()];

                opcao = m1.Menuprinc();



            m1.sout("escolhi: " + opcao + "\n\n");
            switch (opcao) {
                case CARREGAR:
                    break;
                case RECARREGAR:
                    break;
                case QUADRADO:
                    q11.MenuQuad();
                    switch (q11.getOpcao()){
                        case 1://novo

                            insertFigGeométrica(q11.CriarQuadrado());
                            m1.soutln("Quadrado criado");
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
                   //
                    break;
                case RETANGULO:
                  //  insertFigGeométrica(r2.CriaRetangulo());
                    r2.MenuRet();
                   // m1.soutln("retangulo criado");
                    switch (r2.getOpcao()){
                        case 1://novo
                            insertFigGeométrica(r2.CriaRetangulo());
                            m1.soutln("retangulo  criado");
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
                    switch (c1.getOpcao()){
                        case 1://novo
                            insertFigGeométrica(c1.CriarCirculo());
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

                    switch (p1.getOpcao()){
                        case 1://novo
                            insertFigGeométrica(p1.CriarPonto());
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
                    switch (t1.getOpcao()){
                        case 1://novo
                            insertFigGeométrica(t1.CriarTriangulo());
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
                    switch (l1.getOpcao()){
                        case 1://novo
                            insertFigGeométrica(l1.CriarLosangulo());
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
                   tx.MenuText();
                    switch (tx.getOpcao()){
                        case 1://novo
                         tx.QuantidadeTexto();
                         for   (int i=0;i< vet.length;i++){
                             tx.LerTexto();
                             vet[i]=tx.getPalavra();
                         }
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
                case RETA:
                   r.MenuReta();
                    switch (r.getOpcao()){
                        case 1://novo
                            insertFigGeométrica(r.CriarReta());
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
                    for (int i=0;i< vetor.length;i++){
                        if(vetor[i]!=null) {
                            m1.soutln(vetor[i].toString());
                        }
                    }
                    for (int i=0;i< vet.length;i++) {
                        if (vet[i]!=null){
                        m1.soutln(vet[i]);
                        }
                    }
                    break;
                case APAGAR:
                    for (int i=0;i< vetor.length;i++){
                        if(vetor[i]!=null) {
                            vetor[i]=null;
                        }
                    }
                    m1.soutln("todas as posicoes do vetor foram apagadas");
                    break;
                case DESENHAR:
                    d1.Escolha();
                    switch (d1.getI()){
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
    public void testandoArrayList(){
        ArrayList lista = new ArrayList();
        lista.add(1);
        lista.add("dsdsdsd");
        lista.add(new Ponto());
        lista.add(new ArrayList());
        tela.soutln("------------TESTE parametrico---------------");
        ArrayList<FigGeometrica> listaFig = new ArrayList();
        listaFig.add(new Quadrado1(1));
        tela.soutln("");
        tela.soutln("------------FIM TESTE---------------");
    }

}