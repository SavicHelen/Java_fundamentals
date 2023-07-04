import java.util.Scanner;

public class zadatak14 {
    /* 14.	Napisati program za ispis prirodnih brojeva od 1 do 17 koji nisu djeljivi
     sa proizvoljno unetim brojem.*/
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
       System.out.println("Unesite delilac brojeva do 17: ");
        int x= input.nextInt();

        for(int i=1;i<=17;i++){
            if (i % x != 0){
                System.out.println("Broj " +i+" nije deljiv sa "+x);
            }
        }
    }
}

