package Repeticao;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean valido = false;

        double paisA;
        double paisB;
        double taxaA;
        double taxaB;

        do {
            System.out.println("Insira o número de habitantes da população do país A:");
            paisA = scanner.nextDouble();

            if (paisA > 0) {
                valido = true;
            } else {
                System.out.println("População A precisa ser maior que 0");
            }
        }while (!valido);

        valido = false;

        do {
            System.out.println("Insira o número de habitantes da população do país B:");
            paisB = scanner.nextDouble();

            if (paisB > 0) {
                valido = true;
            } else {
                System.out.println("População do país B precisa ser maior que 0");
            }
        }while (!valido);

        valido = false;

        do {
            System.out.println("Insira a taxa de crescimento do país A:");
            taxaA = scanner.nextDouble();

            if (taxaA > 0){
                valido = true;
            }else {
                System.out.println("Taxa de crescimento do país A ser maior que 0");
            }
        }while (!valido);

        valido = false;

        do {
            System.out.println("Insira a taxa de crescimento da país B");
            taxaB = scanner.nextDouble();

            if (taxaB > 0){
                valido = true;
            }else {
                System.out.println("Taxa de crescimento do pais B precisa ser maior que 0");
            }
        }while (!valido);


        double anos = 0;

        while (paisA < paisB) {
            paisA += (paisA/100) * taxaA;
            paisB += (paisB/100) * taxaB;
            anos++;
        }
        System.out.println("População do país A: " + paisA);
        System.out.println("População do país B: " + paisB);
        System.out.println("Quantidade de anos: " + anos);
    }
}

