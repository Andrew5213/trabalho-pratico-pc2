package paint_AndrewOficial.View.Cli;

import paint_AndrewOficial.modelo.Quadrado1;

public class MenuQuadrado extends MenuPrincipal {
    protected int opcao;
    protected int a;

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    protected int b;

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


    public Quadrado1 CriarQuadrado() {
        System.out.println("digite o lado do quadrado");
        int lado = in.nextInt();
        Quadrado1 q1 = new Quadrado1(lado);
        return q1;
    }

    public int receber() {
        setA(in.nextInt());
        return getA();
    }
    public int receberSim() {
        setB(in.nextInt());
        return getB();
    }
}

