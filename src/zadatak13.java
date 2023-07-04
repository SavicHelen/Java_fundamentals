import java.util.Scanner;

public class zadatak13 {
    /*13.	Napisati program za ispis kvadrata prirodnih brojeva do n unetih sa tastature (while petlja). */

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Unesite n - do kog broja da prikazemo kvadrate");
        int n= input.nextInt();
        int i=1;

        while (i<=n) {
            int power=i*i;
            System.out.println("Kvadrat od "+i+" je "+power);
            i++;
        }

    }
}