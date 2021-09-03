package paint_AndrewOficial.dao;

import paint_AndrewOficial.View.Cli.MenuPrincipal;
import paint_AndrewOficial.View.Cli.MenuQuadrado;
import paint_AndrewOficial.modelo.*;

import java.io.*;

public class FigGeometricaDao {
    public FigGeometrica[] ds;
    MenuPrincipal m1 = new MenuPrincipal();

    public FigGeometricaDao(int tamanho) {
        ds = new FigGeometrica[tamanho];
    }

    public FigGeometrica[] getItens() {
        return ds.clone();
    }

    public void Listar(int h) {

        if (h == 0) {
            for (int i = 0; i < ds.length; i++) {
                if (ds[i] != null) {
                    // m1.soutln(vetor[i].toString());
                    System.out.println((i + 1) + " - " + ds[i].toString());
                }
            }
        } else {
            if (h == 1) {
                for (int i = 0; i < ds.length; i++) {
                    if (ds[i] != null && ds[i] instanceof Quadrado1) {
                        // m1.soutln(vetor[i].toString());
                        System.out.println((i + 1) + " - " + ds[i].toString());
                    }
                }
            } else if (h == 2) {
                for (int i = 0; i < ds.length; i++) {
                    if (ds[i] != null && ds[i] instanceof Retangulo) {
                        // m1.soutln(vetor[i].toString());
                        System.out.println((i + 1) + " - " + ds[i].toString());
                    }
                }
            } else if (h == 3) {
                for (int i = 0; i < ds.length; i++) {
                    if (ds[i] != null && ds[i] instanceof Circulo) {
                        // m1.soutln(vetor[i].toString());
                        System.out.println((i + 1) + " - " + ds[i].toString());
                    }
                }

            } else if (h == 4) {
                for (int i = 0; i < ds.length; i++) {
                    if (ds[i] != null && ds[i] instanceof Ponto) {
                        // m1.soutln(vetor[i].toString());
                        System.out.println((i + 1) + " - " + ds[i].toString());
                    }
                }
            } else if (h == 5) {
                for (int i = 0; i < ds.length; i++) {
                    if (ds[i] != null && ds[i] instanceof Triangulo) {
                        // m1.soutln(vetor[i].toString());
                        System.out.println((i + 1) + " - " + ds[i].toString());
                    }
                }
            } else if (h == 14) {
                for (int i = 0; i < ds.length; i++) {
                    if (ds[i] != null && ds[i] instanceof Reta) {
                        // m1.soutln(vetor[i].toString());
                        System.out.println((i + 1) + " - " + ds[i].toString());
                    }
                }
            } else if (h == 10) {
                for (int i = 0; i < ds.length; i++) {
                    if (ds[i] != null && ds[i] instanceof Trapezio) {
                        // m1.soutln(vetor[i].toString());
                        System.out.println((i + 1) + " - " + ds[i].toString());
                    }
                }

            } else if (h == 8) {
                for (int i = 0; i < ds.length; i++) {
                    if (ds[i] != null && ds[i] instanceof Losangulo) {
                        // m1.soutln(vetor[i].toString());
                        System.out.println((i + 1) + " - " + ds[i].toString());
                    }
                }
            } else if (h == 11) {
                for (int i = 0; i < ds.length; i++) {
                    if (ds[i] != null && ds[i] instanceof Texto) {
                        // m1.soutln(vetor[i].toString());
                        System.out.println((i + 1) + " - " + ds[i].toString());
                    }
                }
            }
        }
    }

    public void editar(int pos, FigGeometrica fig) {
        if (ds != null && pos >= 0) {
            ds[pos] = fig;
        }
    }

    public boolean create(FigGeometrica fig) {
        //acha posiçào e salvao no vetor
        for (int i = 0; i < ds.length; i++) {
            if (ds[i] == null) {
                ds[i] = fig;
                return true;
            }

        }
        m1.soutln("vetor esta cheio ");// excessao
        return false;
    }

    public FigGeometrica read(int codig) {
        //retortan a figura da posição i

        return null;
    }

    public Boolean update(FigGeometrica figAnterior, FigGeometrica figNova) {
        for (int i = 0; i < ds.length; i++) {
            if (ds[i].equals(figAnterior)) {
                ds[i] = figNova;
                return true;
            }
        }
        return false;
    }

    public Boolean delete(FigGeometrica figuraGeometrica) {
        for (int i = 0; i < ds.length; i++) {
            if (ds[i].equals(figuraGeometrica)) {
                ds[i] = null;
                return true;
            }
        }
        return false;
    }

    public void salvarEmArquivo() {
        FileOutputStream arquivo = null;
        try {
            arquivo = new FileOutputStream("figurasGeometricas.dat");
            ObjectOutputStream out = new ObjectOutputStream(arquivo);
            out.writeObject(ds);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Figuras Salvas");
    }
    public void apagar(){
        MenuPrincipal m1 = new MenuPrincipal();
        m1.soutln("digite o id  e a figura q sera apagada ");
        MenuQuadrado q = new MenuQuadrado();
        q.receber();
        if(q.getA()>=0 || q.getA()<=10) {
            System.out.println(ds[q.getA()]);
            m1.soutln("quer apagar? se sim digite 1 \n " +
                    "se não digite 2");
            q.receberSim();
            if (q.getB() == 1) {
                ds[q.getA()] = null;
                m1.soutln("apagada com sucesso ");
            } else {
                m1.soutln("nao apagada ");
            }
        }else{
            m1.soutln("nao existe essa posicao no vetor ");
        }
    }
    public boolean carregarDeArquivo() { //throws IOException, ClassNotFoundException{

        try {
            FileInputStream arq = new FileInputStream("figurasGeometricas.dat");
            ObjectInputStream in = new ObjectInputStream(arq);
            ds = (FigGeometrica[]) in.readObject();
        } catch (IOException ex) {
            System.out.println("Ferrou IOExpection");
            ex.printStackTrace();
            return false;
        } catch (ClassNotFoundException ex) {
            System.out.println("Ferrou Class");
            ex.printStackTrace();
            return false;
        } catch (Exception ex) {
            System.out.println("Ferrou Tudo");
            ex.printStackTrace();
            return false;
        }
        return true;
    }


}
