package Repeticao;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o primeiro número:");
        int number1 = scanner.nextInt();

        System.out.println("Insira o segundo número:");
        int number2 = scanner.nextInt();

        for (int i=number1; i<=number2; i++){
            System.out.println(i);
        }
    }
}
