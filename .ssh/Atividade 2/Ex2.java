import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int inteiro;
        float real;

        System.out.print("Informe um valor inteiro: ");
        inteiro = S.nextInt();
        System.out.print("Informe um valor real: ");
        real = S.nextFloat();

        S.close();

        System.out.print("O valor inteiro informado foi: " + inteiro + "\nE o valor real foi: " + real);


    }
}
