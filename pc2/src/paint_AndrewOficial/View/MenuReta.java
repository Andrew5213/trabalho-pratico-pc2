package paint_AndrewOficial.View;

import paint_AndrewOficial.modelo.Reta;

public class MenuReta extends MenuPrincipal{
    protected int opcao;

    public int getOpcao() {
        return opcao;
    }

    public void setOpcao(int opcao) {
        this.opcao = opcao;
    }

    public Reta CriarReta(){
        System.out.println("digite a cordenada inicial em inteiro do eixo x ");
        int x1,x2,y1,y2;
        x1=in.nextInt();
        System.out.println("digite a cordenada final em inteiro do eixo x  ");
        x2= in.nextInt();
        System.out.println("digite a cordenada inicial em inteiro do eixo y");
        y1= in.nextInt();
        System.out.println("digite a cordenada final em inteiro do eixo y");
        y2= in.nextInt();
        Reta r1 = new Reta(x1,y1,x2,y2);
        return r1;
    }
    public int MenuReta(){
        int opcao1;
        System.out.println("1-NOVO\n"+// no caso um quadrado
                "2-EDITAR\n"+
                "3-listar\n"+// no caso listar os quadrados
                "4-mostrar\n"+//um unico item
                "-excluir\n");
        opcao1=in.nextInt();
        setOpcao(opcao1);
        return getOpcao();
    }
}
