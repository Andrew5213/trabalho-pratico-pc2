package paint_AndrewOficial.View;

import paint_AndrewOficial.modelo.Ponto;


public class MenuPonto extends MenuPrincipal{
    protected int opcao;

    public int getOpcao() {
        return opcao;
    }

    public void setOpcao(int opcao) {
        this.opcao = opcao;
    }

    public Ponto CriarPonto(){
        System.out.println("digite a coordenda x do ponto sendo ele  inteiro");
        int x= in.nextInt();
        System.out.println("digite a coordenada y do ponto sendo ele em inteiro");
        int y =in.nextInt();
        Ponto p1 = new Ponto(x,y);
        return p1;
    }
    public int MenuPonto(){
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
