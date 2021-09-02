package paint_AndrewOficial.View.Cli;


import paint_AndrewOficial.View.gui.ICRUDFiguraView;
import paint_AndrewOficial.modelo.Retangulo;

public class RetanguloCli extends AbstractCRUDCli<Retangulo>
            implements ICRUDFiguraView<Retangulo> {




    //@Override
    public Retangulo create() {
        System.out.println("Digite um interio para o lado do retangulo");
        int lado = in.nextInt();
        System.out.println("digite um inteiro para  altura do retangulo");
        int altura = in.nextInt();
        Retangulo r1 = new Retangulo(lado, altura);
        return r1;

    }

    @Override
    public void read(Retangulo conta) {

    }

    @Override
    public Retangulo update(Retangulo toSabe) {
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
