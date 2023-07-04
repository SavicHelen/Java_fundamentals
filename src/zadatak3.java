import java.util.Scanner;

public class zadatak3 {
    /* 3.	Napisati program za ispis uspeha za uneti broj sa tastature, prema sledećoj tabeli:*/
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Unesite ocenu ");
        int ocena= input.nextInt();

        switch (ocena) {
        case 1:
        System.out.println("Uspeh je nedovoljan    1");
        break;
        case 2:
            System.out.println("Uspeh je dovoljan    2");
            break;
            case 3:
                System.out.println("Uspeh je dobar    3");
                break;
            case 4:
                System.out.println("Uspeh je vrlo dobar    4");
                break;
            case 5:
                System.out.println("Uspeh je odlican    5");
                break;
            default:
                    System.out.println("Nevalidan unos");
    }
        }
    }