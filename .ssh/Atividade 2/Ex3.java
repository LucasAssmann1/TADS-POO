import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        float preco, desconto, total;

        System.out.print("Informe o valor do produto: ");
        preco = S.nextFloat();
        System.out.print("Informe a porcentagem do desconto: ");
        desconto = S.nextFloat();

        S.close();
       total = preco * (desconto/100);

       System.out.print("O valor do produto é de R$" + preco + "\nEntão o desconto é de R$" + total + "\nO valor final será de R$" + (preco - total));
       

    }
}
