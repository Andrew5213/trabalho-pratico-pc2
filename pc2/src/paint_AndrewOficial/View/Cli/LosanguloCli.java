package paint_AndrewOficial.View.Cli;

import paint_AndrewOficial.View.gui.ICRUDFiguraView;
import paint_AndrewOficial.modelo.Losangulo;

public class LosanguloCli extends AbstractCRUDCli<Losangulo>
        implements ICRUDFiguraView<Losangulo> {

    public Losangulo create() {
        System.out.println("digite o lado do losangulo sendo ele um inteiro ");
        int lado = in.nextInt();
        Losangulo l1 = new Losangulo(lado);
        return l1;
    }

    @Override
    public void read(Losangulo conta) {

    }

    @Override
    public Losangulo update(Losangulo toSabe) {
        return null;
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
}
