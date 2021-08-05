package paint_AndrewOficial.modelo;

public class Texto extends FigGeometrica{
    protected String texto;

    public Texto(String texto) {
        this.setTexto(texto);

    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public String toString() {
        return "Texto{" +
                "texto='" + getTexto() + '\'' +
                '}';
    }
}
