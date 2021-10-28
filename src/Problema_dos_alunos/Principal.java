package Problema_dos_alunos;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Principal {
    public static void main(String[] args) {
        System.out.println("ola este e o programa para saber a quantidade de alunos alex tem em seu curso");
        Scanner in = new Scanner(System.in);
        Set<Integer> a = new HashSet<>();
        Set<Integer> b= new HashSet<>();
        Set<Integer> c= new HashSet<>();
        int quantidade,mat;
        System.out.println("digite a quantidade de alunos no curso A");
        quantidade=in.nextInt();
        for (int i =0;i<quantidade;i++){
            System.out.println("digite a matricula dos alunos");
            mat=in.nextInt();
            a.add(mat);
        }
        System.out.println("digite a quantidade de alunos no curso B");
        quantidade=in.nextInt();
        for (int i=0;i<quantidade;i++){
            mat=in.nextInt();
            b.add(mat);
        }
        System.out.println("digite  a quantidade de alunos no curso C");
        quantidade=in.nextInt();
        for (int i=0;i<quantidade;i++){
            mat=in.nextInt();
            c.add(mat);
        }
        Set<Integer> total= new HashSet<>(a);
        total.addAll(b);
        total.addAll(c);
        System.out.println(total);
        System.out.println(total.size());
    }
}

