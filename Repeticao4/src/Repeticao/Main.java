package Repeticao;

public class Main {

    public static void main(String[] args) {

        long paisA = 80000;
        long paisB= 200000;
        long anos = 0;

        while (paisA < paisB) {
            paisA += (paisA/100) * 3;
            paisB += (paisB/100) * 1.5;
            anos++;
        }
        System.out.println("População do país A: " + paisA);
        System.out.println("População do país B: " + paisB);
        System.out.println("Quantidade de anos: " + anos);
        // Será de 63 anos
    }
}
