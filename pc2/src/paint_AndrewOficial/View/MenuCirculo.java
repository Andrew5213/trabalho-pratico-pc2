package paint_AndrewOficial.View;

import paint_AndrewOficial.modelo.Circulo;

public class MenuCirculo extends MenuPrincipal{
    protected int opcao;

    public int getOpcao() {
        return opcao;
    }

    public void setOpcao(int opcao) {
        this.opcao = opcao;
    }

    public Circulo CriarCirculo(){
        System.out.println("ola agora vamos criar um circulo");
        System.out.println("digite o raio do circulo");
        int raio=in.nextInt();

        Circulo c1 = new Circulo(raio);
        return c1;
    }
    public int MenuCirc(){
        int opcao1;
        System.out.println("1-NOVO\n"+// no caso um quadrado
                "2-EDITAR\n"+
                "3-listar\n"+// no caso listar os quadrados
                "4-mostrar\n"+//um unico item
                "5-excluir\n"+
                "0-sair\n");
        opcao1=in.nextInt();
        setOpcao(opcao1);
        return getOpcao();
    }
}
