package paint_AndrewOficial.View.Cli;

import paint_AndrewOficial.View.gui.ICRUDFiguraView;
import paint_AndrewOficial.modelo.Triangulo;

public class TrianguloCli extends AbstractCRUDCli<Triangulo>
            implements ICRUDFiguraView<Triangulo> {



    public Triangulo create() {

        System.out.println("ola vamos criar um triangulo ");
        int lado1,lado2,lado3;
        do {

            System.out.println("digite o primeiro lado do triangulo");
            lado1=in.nextInt();
            System.out.println("digite o lado 2 do triangulo");
            lado2=in.nextInt();
            System.out.println("digite o lado 3 do triangulo");
            lado3=in.nextInt();
            Triangulo t1 = new Triangulo(lado1,lado2,lado3);
            return t1;
        }while(lado1>=lado2+lado3 || lado2>=lado1+lado3 || lado3>=lado1+lado2 );
    }


    public void read(Triangulo conta) {
        System.out.println(conta);
    }

    @Override
    public Triangulo update(Triangulo toSabe) {
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



