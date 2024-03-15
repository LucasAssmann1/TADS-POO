import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int p1,p2,p1r,p2r;

        System.out.println("Informe a quantidade de pontos do Lider do campeonato");
        p1 = S.nextInt();
        System.out.println("Informe a quantidade de pontos do time lanterna");
        p2 = S.nextInt();
        S.nextLine();

        S.close();

        p1r = p1 * 3;
        p2r = p2 * 3;

        if (p2r < p1r) {
            System.out.println("Faltam " + ((p1r - p2r)/3) + " para o Time Lanterna ultrapassar o Lider");
        } else if(p2r == p1r) {
            System.out.println("O Time Lanterna esta igualado ao Lider");
        } else {
        System.out.println("O Time Lanterna ultrapassou o Lider");
        }


    }
}
