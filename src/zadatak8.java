import java.util.Scanner;

public class zadatak8 {
    /*8.Napisati program koji ce izračunati aritmetičku sredinu parnih brojeva unetih sa tastature od k do n.*/
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Unesite broj k ");
        int k= input.nextInt();
        System.out.println("Unesite broj n ");
        int n= input.nextInt();
        double avg=0;
        int count=0;
        int zbirParnih=0;

        for (int i=k;i<=n;i++){
            if(i%2==0){
                count+=1;
               zbirParnih= zbirParnih+i;
               avg= (double) zbirParnih/count;
            }
        }
        System.out.println("Aritmeticka sredina parnih brojeva u opsegu od k do n je "+avg);

    }
}
