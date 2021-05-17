package Repeticao;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number;
        int soma = 0;
        double média;

        for (int i=0; i<5; i++){

            System.out.println("Digite um número:");
            number = scanner.nextInt();

            soma += number;
        }
        média = soma / 5;
        System.out.println("Soma " + soma);
        System.out.println("Média " + média);
    }
}
