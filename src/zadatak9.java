import java.util.Arrays;
import java.util.Scanner;

public class zadatak9 {
    /*9.	Napisati program koji ce učitati sa tastature visine za n osoba. Ispisati prosečnu i najveću visinu.*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Unesite broj osoba ciju visinu sabiramo.");
        int n = input.nextInt();
        double[] niz = new double[n];

        double sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Unesite visinu " + (i + 1) + ". osobe");
            niz[i] = input.nextDouble();

            sum = sum + niz[i];
        }
        System.out.println(Arrays.toString(niz));
        System.out.println("Srednja visina je " + sum / n +"cm");

        double max = 0;
            for (int i=0; i< niz.length; i++) {
                if (niz[i] > max) {
                    max = niz[i];
                }
            }
        System.out.println("Maksimalna visina je " + max);
            input.close();
        }
    }


