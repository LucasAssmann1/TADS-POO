import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x,y,z, result;

        System.out.print("Insira o primeiro valor: ");
        x = input.nextInt();
        System.out.print("Insira o segundo valor: ");
        y = input.nextInt();
        System.out.print("Insira o terceiro valor: ");
        z = input.nextInt();

        input.close();
        result = x * y * z;

        System.out.printf("O valor do produto é: %d", result);

    }
}
