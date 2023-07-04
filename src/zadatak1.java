
import java.util.Scanner;

public class zadatak1 {
    /*1.	Napisati program za odredjivanje apsolutne vrednosti broja koji unesete sa tastature.*/
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Unesite zeljeni broj ");
        double x= input.nextDouble();

        double absx=Math.abs(x);
        System.out.println("apsolutna vrednost unetog broja je "+ absx);

    }
}
