import java.util.Scanner;

public class zadatak7 {
    /*7.	Napisati program koji ce da nađe proizvod prirodnih brojeva unetih
     sa tastature od a do b djeljivih sa 5 i koliko ih ima. */

    public static void main(String[] args) {
        int proizvod=1;
        int count=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Unesite broj a ");
        int a= input.nextInt();
        System.out.println("Unesite broj b ");
        int b= input.nextInt();

        for (int i=a;i<=b;i++) {
            if (i%5==0) {
                count=count+1;
                proizvod=proizvod*i;
            }
        }
        System.out.println("Ima "+count +"brojeva deljivih sa 5 a njihov proizvod je "+proizvod);

    }
    }
