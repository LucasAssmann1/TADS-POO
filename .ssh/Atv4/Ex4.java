package Atv4;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        String[] vagas = new String[10];
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nMenu:\n1 - Entrada\n2 - Saída\n3 - Listar situação atual\n4 - Encerrar o programa\n\nEscolha uma opção: ");
            int opcoes = sc.nextInt();

            switch (opcoes) {
                case 1:
                    System.out.print("Digite o número da vaga de 0 a 9: ");
                    int numVaga = sc.nextInt();
                    System.out.print("Digite a placa do seu veículo: ");
                    String placa = sc.next();
                    vagas[numVaga] = placa;
                    break;
                case 2:
                    System.out.print("Digite o número da vaga a ser liberada de 0 a 9: ");
                    int vagaFree = sc.nextInt();
                    vagas[vagaFree] = "";
                    break;
                case 3:
                    System.out.println("Situação atual das vagas:");
                    for (int i = 0; i < vagas.length; i++) {
                        System.out.println("Vaga " + i + ": " + (vagas[i] != null ? vagas[i] : "Vaga livre"));
                    }
                    break;
                case 4:
                    System.out.println("Encerrando o programa");
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
