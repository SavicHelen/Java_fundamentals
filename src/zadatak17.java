import java.util.Arrays;
import java.util.Scanner;

public class zadatak17 {
    /*17.	Napisati program koji ce učitati elemente i naći najveći element niza.*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Unesite broj elemenata niza: ");
        int n = input.nextInt();
        int[] brojevi = new int[n];

        for(int i=0;i<n;i++) {
                System.out.println("Unesite element niza: ");
                brojevi[i] = input.nextInt();
        }
        int max=brojevi[0];
        for (int i = 1; i < n; i++) {
            if (brojevi[i] > max) {
                max = brojevi[i];
                }
        }
            System.out.println("Najveci element Vaseg niza je "+ max);
    }
}