package paint_AndrewOficial.View.Cli;

public class MenuDesenhos extends MenuPrincipal {
    protected int i;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int Escolha() {
        System.out.println("digite o numero correspondente ao desenho");
        System.out.println("1-quadrado");
        System.out.println("2-retangulo");
        System.out.println("3-triangulo");
        System.out.println("4-circulos");
        System.out.println("5-reta");
        System.out.println("6-losangulo");
        int x = in.nextInt();
        this.setI(x);
        return this.getI();
    }
}
