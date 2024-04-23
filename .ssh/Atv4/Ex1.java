package Atv4;

import java.util.Scanner;


public class Ex1 {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);

        int qntAlunos = 10;
        double[] nota = new double[qntAlunos];
        double somanota = 0;
        int acimaMedia = 0;
        int abaixoMedia = 0;

        
        for (int i = 0; i < qntAlunos; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            nota[i] = sc.nextDouble();
            somanota += nota[i];
        }

        
        double media = somanota / qntAlunos;
        System.out.println("Média das nota: " + media);

        
       
        for (int i = 0; i < qntAlunos; i++) {
            if (nota[i] > media) {
                acimaMedia++;
            } else {
                abaixoMedia++;
            }
        }

        System.out.println("notas acima da média: " + acimaMedia);
        System.out.println("notas abaixo da média: " + abaixoMedia);
    }
}