package Repeticao;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number;
        int maior = Integer.MIN_VALUE;

        for (int i=0; i<5; i++) {
            System.out.println("Insira um número:");
            number = scanner.nextInt();

            if (number > maior){
                maior = number;
            }
        }
        System.out.println("O maior número digitado foi: " + maior);
    }
}
