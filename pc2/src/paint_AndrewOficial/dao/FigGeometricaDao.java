package paint_AndrewOficial.dao;

import paint_AndrewOficial.modelo.FigGeometrica;

import java.io.*;


public class FigGeometricaDao {
    public FigGeometrica[] ds;

    public FigGeometrica[] getItens() {
        return ds.clone();
    }
    public FigGeometricaDao(int tamanho){
        ds= new FigGeometrica[tamanho];
    }
    public void Listar(){
        for (int i=0;i< ds.length;i++){
            if(ds[i]!=null) {
               // m1.soutln(vetor[i].toString());
                System.out.println(ds[i].toString());
            }
        }
    }
    public boolean create(FigGeometrica figura){
        //acha posiçào e salvao no vetor
        for (int i=0; i< ds.length;i++){
            if (ds[i]==figura){
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
        for (int i = 0; i < ds.length; i++) {
            if(ds[i].equals(figAnterior)){
                ds[i] = figNova;
                return true;
            }
        }
        return false;
    }

    public Boolean delete(FigGeometrica figuraGeometrica){
        for (int i = 0; i < ds.length; i++) {
            if(ds[i].equals(figuraGeometrica)){
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
        }catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Figuras Salvas");
    }
    public boolean carregarDeArquivo(){ //throws IOException, ClassNotFoundException{

        try {
            FileInputStream arq = new FileInputStream("figurasGeometricas.dat");
            ObjectInputStream in = new ObjectInputStream(arq);
            ds = (FigGeometrica[]) in.readObject();
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
