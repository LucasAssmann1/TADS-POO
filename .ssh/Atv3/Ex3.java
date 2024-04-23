import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        int num, soma = 0, cont = 0;
        double mean = 0;
        Boolean teste = true;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe valores iguais ou maiores que zero // menores que zero para encerrar a contagem e calcular a media total");

        while (teste) {
            num = sc.nextInt();

            if (num < 0) {
                break;
            }

            cont++;
            soma += num;
        
        }
        
        if (cont > 0) {
           
            System.out.println("Números digitados: "+ cont);
            System.out.println("Média: "+  (mean = (double) soma / cont));
        }
        else {
            System.out.println("Nenhum número foi digitado");
        }
        
    }
}
