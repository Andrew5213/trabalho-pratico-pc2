package paint_AndrewOficial.View.Cli;

import paint_AndrewOficial.View.gui.ICRUDFiguraView;
import paint_AndrewOficial.modelo.Reta;

public class RetaCli extends AbstractCRUDCli<Reta>
        implements ICRUDFiguraView<Reta> {

    public Reta CriarReta() {
        int x1, x2, y1, y2;
        System.out.println("digite a cordenada inicial em inteiro do eixo x ");

        x1 = in.nextInt();
        System.out.println("digite a cordenada final em inteiro do eixo x  ");
        x2 = in.nextInt();
        System.out.println("digite a cordenada inicial em inteiro do eixo y");
        y1 = in.nextInt();
        System.out.println("digite a cordenada final em inteiro do eixo y");
        y2 = in.nextInt();
        Reta r1 = new Reta(x1, y1, x2, y2);
        return r1;


    }

    @Override
    public void showMessage(String msg) {

    }

    @Override
    public void showLineMessage(String msg) {

    }

    @Override
    public int askForInt(String question) {
        return 0;
    }

    @Override
    public double askForDouble(String question) {
        return 0;
    }

    @Override
    public String askForString(String question) {
        return null;
    }

    @Override
    public boolean hasNextInt() {
        return false;
    }

    @Override
    public Reta create() {
        return null;
    }

    @Override
    public void read(Reta conta) {

    }

    @Override
    public Reta update(Reta toSabe) {
        return null;
    }
}
