import java.util.Scanner;
public class Ex6 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int val1,val2;

        System.out.print("Digite o primeiro valor: ");
        val1 = S.nextInt();
        System.out.print("Digite o segundo valor: ");
        val2 = S.nextInt();
        S.close();
        
        System.out.println("Soma:" + (val1 + val2) + "\nProduto:" + (val1 * val2) + "\nDiferença:" + (val1 - val2) + "\nQuociente: " + (val1 / val2));
    }
}
