package Atv4;
import java.util.Random;

public class Ex5 {
    public static void main(String[] args) {

        int largura = 40;
        int altura = 40;
        int[][] imagem = new int[largura][altura];
        Random rdm = new Random();

         for (int i = 0; i < largura; i++) {
            for (int j = 0; j < altura; j++) {
                imagem[i][j] = rdm.nextInt(256); 
            }
        }
        
        for (int i = 0; i < largura; i++) {
            for (int j = 0; j < altura; j++) {
                System.out.print(imagem[i][j] + " ");
            }
            System.out.println(); 
        }

    }
}
