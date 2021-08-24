package paint_AndrewOficial.View;

import paint_AndrewOficial.modelo.Quadrado1;

public class MenuQuadrado extends MenuPrincipal{
    protected int opcao,a ;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getOpcao() {
        return opcao;
    }

    public void setOpcao(int opcao) {
        this.opcao = opcao;
    }

    public int MenuQuad(){
        int opcao1;
        System.out.println("1-NOVO\n"+// no caso um quadrado
                "2-EDITAR\n"+
                "3-listar\n"+// no caso listar os quadrados
                "4-mostrar\n"+//um unico item
                "5-excluir\n" +
                "0-sair");
        opcao1=in.nextInt();
        setOpcao(opcao1);
        return getOpcao();
    }
    public Quadrado1 CriarQuadrado(){
        System.out.println("digite o lado do quadrado");
        int lado=in.nextInt();
        Quadrado1 q1 = new Quadrado1(lado);
        return q1;
    }
    public int receber(){
        setA(in.nextInt());
        return getA();
    }
    }

