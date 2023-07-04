import java.util.Scanner;

public class zadatak19 {
    /*19.	Napisati metod za nalaženje minimuma od dva učitana broja (a, b) sa tastature.
     Izvršiti dodeljivanje vrednosti metoda varijabli c.*/

    public static void main(String[] args) {
        System.out.println("Unesite prvi broj: ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println("Unesite drugi broj: ");
        int b = input.nextInt();
        int c = minimum(a, b);
        System.out.println("Manji od unetih brojeva je: "+c);
    }

         public static int minimum(int a, int b){
            if (a<b){
                return a;
            }
            else {
                return b;
            }
        }

    }
