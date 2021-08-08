package paint_AndrewOficial.View;

import paint_AndrewOficial.modelo.Texto;

public class MenuTexto extends MenuPrincipal {
    protected int opcao;

    public int getOpcao() {
        return opcao;
    }

    public void setOpcao(int opcao) {
        this.opcao = opcao;
    }

    public Texto CriarTexto(){
        System.out.println("digite o texto sendo ele uma string ");
        String texto=in.nextLine();
        Texto tx = new Texto(texto);
        return tx;
    }
    public int MenuText(){
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
