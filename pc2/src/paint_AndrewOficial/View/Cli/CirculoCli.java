package paint_AndrewOficial.View.Cli;

import paint_AndrewOficial.View.gui.ICRUDFiguraView;
import paint_AndrewOficial.modelo.Circulo;

public class CirculoCli extends AbstractCRUDCli<Circulo>
        implements ICRUDFiguraView<Circulo> {

    //@Override
    public Circulo create() {
        System.out.println("ola agora vamos criar um circulo");
        System.out.println("digite o raio do circulo");
        int raio = in.nextInt();

        Circulo c1 = new Circulo(raio);
        return c1;

    }

    @Override
    public void read(Circulo conta) {

    }

    @Override
    public Circulo update(Circulo toSabe) {
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
