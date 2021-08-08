package paint_AndrewOficial.View;

import paint_AndrewOficial.modelo.Losangulo;

public class MenuLosangulo extends MenuPrincipal{
    protected int opcao;

    public int getOpcao() {
        return opcao;
    }

    public void setOpcao(int opcao) {
        this.opcao = opcao;
    }

    public Losangulo CriarLosangulo(){
        System.out.println("digite o lado do losangulo sendo ele um inteiro ");
        int lado = in.nextInt();
        Losangulo l1 = new Losangulo(lado);
        return l1;
    }
    public int MenuLosan(){
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
