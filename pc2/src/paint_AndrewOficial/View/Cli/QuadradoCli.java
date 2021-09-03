package paint_AndrewOficial.View.Cli;

import paint_AndrewOficial.View.gui.ICRUDFiguraView;
import paint_AndrewOficial.modelo.Quadrado1;

public class QuadradoCli extends AbstractCRUDCli<Quadrado1>
        implements ICRUDFiguraView<Quadrado1> {
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
    public Quadrado1 create() {
        System.out.println("digite o lado do quadrado");
        int lado = in.nextInt();
        Quadrado1 q1 = new Quadrado1(lado);
        return q1;

    }

    @Override
    public void read(Quadrado1 conta) {
        System.out.println(conta);

    }

    @Override
    public Quadrado1 update(Quadrado1 toSabe) {
        this.read(toSabe);
        return null;
    }


}
