package paint_AndrewOficial.View;

import paint_AndrewOficial.modelo.Texto;

public class MenuTexto extends MenuPrincipal {
    protected int opcao,quad;
    protected String palavra;

    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    public int getQuad() {
        return quad;
    }

    public void setQuad(int quad) {
        this.quad = quad;
    }

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
    public String LerTexto(){
        this.palavra=in.nextLine();
        return this.getPalavra();
    }
    public void  QuantidadeTexto(){
    System.out.println("digite a quantidade de palavras no texto ");
    int quad=in.nextInt();
        this.setQuad(quad);
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
