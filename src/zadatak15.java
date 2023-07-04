import java.util.Scanner;

public class zadatak15 {

        /* 15.	Napisati program koji ce učitati elemente niza i ispisati elemente niza sa neparnim indeksom.*/
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Unesite broj elemenata niza: ");
        int n = input.nextInt();
        int[] brojevi = new int[n];

        for (int i = 0; i < n; i++){
            System.out.println("Unesite elemente niza: ");
            brojevi[i] = input.nextInt();
        }
        System.out.print("Niz elemenata sa neparnim indeksom je ");
        for (int i = 1; i < n; i += 2) {
            System.out.print( brojevi[i]+" ");
        }
        }

    }

