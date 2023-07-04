import java.util.Scanner;
/* 10.	Napisati program koji ce nakon unosa sa tastature da ispisuje 3 puta u 3 reda IME sa razmakom.

*/
public class zadatak10 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Unesite tekst za stampu:");
        String tekst= input.nextLine();
        int i=1;
        while (i <= 3) {
            System.out.println(tekst + " " + tekst + " " + tekst);
            i++;
        }

    }
}
