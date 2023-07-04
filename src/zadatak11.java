import java.util.Scanner;
/* 11.	Napisati program koji ce nakon unosa sa tastature ispisati
pravougaoni trougao kao na slici sa proizvoljnim brojem redova:*/
public class zadatak11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Unesite koliko redova teksta zelite da prikazemo");
        int n = input.nextInt();


        for (int i=0; i<n; i++) {
            for (int k = 0; i >= k; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    }

