package Atv4;

import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        double[][] mat = new double[3][3];
        System.out.println("Digite os valores da matriz 3x3:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o valor da pos [" + (i + 1) + "][" + (j + 1) + "]:");
                mat[i][j] = sc.nextDouble();
            }
        }

        
        double det = calcularDet(mat);

        System.out.println("O Determinante da matriz é: " + det);

    }

    public static double calcularDet(double[][] mat) {
        double a = mat[0][0];
        double b = mat[0][1];
        double c = mat[0][2];
        double d = mat[1][0];
        double e = mat[1][1];
        double f = mat[1][2];
        double g = mat[2][0];
        double h = mat[2][1];
        double i = mat[2][2];

        double Det = a * (e * i - f * h) - b * (d * i - f * g) + c * (d * h - e * g);
        return Det;
    }
}
