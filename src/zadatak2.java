import java.util.Scanner;

public class zadatak2 {
    /* 2.	Napisati program koji od dva učitana broja (a, b) sa tastature nalazi veći.*/
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Unesite 1. zeljeni broj ");
        int x= input.nextInt();
        System.out.println("Unesite 2. zeljeni broj ");
        int y= input.nextInt();

        int max=Math.max(x,y);
        System.out.println("Veci je broj "+max);

        /*if (x>y) {
            System.out.println("Prvi broj je veci od drugog");
        }else{
            System.out.println("Drugi broj je veci od prvog");
        } */


    }
}
