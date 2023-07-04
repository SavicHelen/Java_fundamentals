import java.util.Scanner;

public class zadatak12 {
    /*12.	Napisati program koji ce ispisati parne prirodne brojeve od 1 do 25
unete sa tastature. Kada korisnik unese 25 zavrsava se program. (while petlja). */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int n=0;

        while(n!=25){
            System.out.println("Unesite broj od 1 do 25: ");
            n= input.nextInt();

            if (n<1 || n>25) {
                System.out.println("Broj ne ulazi u razmatanje. Unesite broj u opsegu 1-25");
            } else if (n%2==0){
                System.out.println("Broj " +n+ " je paran");
            }
            }
        System.out.println("Kraj unosa.");
        }

    }

