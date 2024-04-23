package Atv4;

import java.util.Random;


public class Ex3 {
    public static void main(String[] args) {
        int SizeArray = 10;
        int[] par = new int[SizeArray];
        int[] impar = new int[SizeArray];
        Random rdm = new Random();

        for (int i = 0; i < SizeArray; i++) {
            int randomNum = rdm.nextInt(20) + 1;

            if (randomNum % 2 == 0) {
                par[i] = randomNum;
            } else {
                impar[i] = randomNum;
            }
        }

        System.out.println("pares:");
        for (int num : par) {
            System.out.print(num + " ");
        }

        System.out.println("\n\nímpares:");
        for (int num : impar) {
            System.out.print(num + " ");
        }
    }
}
