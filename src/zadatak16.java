
import java.util.Scanner;
import java.util.Arrays;
public class zadatak16 {
    /* 16.	Napisati program koji ce učitati elemente niza i ispisati elemente niza u obrnutom redosledu.*/

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Unesite broj elemenata niza: ");
        int n = input.nextInt();
        int[] brojevi = new int[n];
        int i=1;
        for(i=0;i<brojevi.length;i++) {
            System.out.print("Unesite element niza: ");
            brojevi[i] = input.nextInt();
        }
        System.out.print("Vas inicijalni niz je " +Arrays.toString(brojevi));

        System.out.println("Vas niz u obrnutom redosledu je ");
        for(i=n-1; i>=0; i--){
            System.out.print(brojevi[i]+",");
        }

    }
}
