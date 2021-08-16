package paint_AndrewOficial.dao;

import paint_AndrewOficial.modelo.FigGeometrica;

import java.io.*;


public class FigGeometricaDao {
    private FigGeometrica[] vetor;

    public FigGeometrica[] getItens() {
        return vetor.clone();
    }
    public FigGeometricaDao(int tamanho){
        vetor= new FigGeometrica[tamanho];
    }
    public boolean create(FigGeometrica figura){
        //acha posiçào e salvao no vetor
        for (int i=0; i< vetor.length;i++){
            if (vetor[i]==figura){
                int posicao=i;
            }

        }

        return true;
    }
    public FigGeometrica read(int codig){
        //retortan a figura da posição i
        return null;
    }
    public Boolean update(FigGeometrica figAnterior, FigGeometrica figNova){
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i].equals(figAnterior)){
                vetor[i] = figNova;
                return true;
            }
        }
        return false;
    }

    public Boolean delete(FigGeometrica figuraGeometrica){
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i].equals(figuraGeometrica)){
                vetor[i] = null;
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
            out.writeObject(vetor);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Figuras Salvas");
    }
    public boolean carregarDeArquivo(){ //throws IOException, ClassNotFoundException{

        try {
            FileInputStream arq = new FileInputStream("figurasGeometricas.dat");
            ObjectInputStream in = new ObjectInputStream(arq);
            vetor = (FigGeometrica[]) in.readObject();
        }
        catch(IOException ex){
            System.out.println("Ferrou IOExpection");
            ex.printStackTrace();
            return false;
        }
        catch(ClassNotFoundException ex){
            System.out.println("Ferrou Class");
            ex.printStackTrace();
            return false;
        }
        catch(Exception ex){
            System.out.println("Ferrou Tudo");
            ex.printStackTrace();
            return false;
        }
        return true;
    }





}
