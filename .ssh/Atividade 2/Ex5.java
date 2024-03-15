import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        //O usuário precisa inserir dentro da classe Main, as variáveis com o nome que o implementador desejar, definindo antes o tipo da variável, sendo int, float, String, etc.
        int c, thisIsAVariable, q76354, number;

        //Aqui está sendo criado um Scanner, que servirá como um receptor de dados que serão inseridos pelo usuário, como se fosse um token a ser inserido dentro da variável que o programador inseriu no algoritmo.
        Scanner input = new Scanner(System.in);

        //Aqui está sendo definido um valor pelo usuário e com a ajuda do Scanner, está auxiliando o mesmo a armazena-lo na variárvel value
        System.out.print("Informe um valor: ");
        int value = input.nextInt();
        
        //Aqui está sendo inserido um texto em String, utilizando o comando de System.out.println
        System.out.println("Este é um programa em Java");

        //Aqui está sendo utilizado um print com uma versão formatada, utilizando %s para inserir os valores das variáveis
        System.out.printf("%s\n%s","Este é um programa em Java","Este é um programa em Java");

    }
}
