import java.sql.SQLOutput;

public class zadatak20 {
    /*20.Kreirati metodu koja računa prizvod dva broja, vraća rezultat u main, duplira i ispisuje.*/
    public static void main(String[] args) {
        double rezultat = 2* proizvodBrojeva(5,3);
        System.out.println("Duplirani proizvod vasih brojeva je "+rezultat);

        double rezultat2 = 2* proizvodBrojeva(4,3);
        System.out.println("Duplirani proizvod vasih brojeva je "+rezultat2);

    }

    public static double proizvodBrojeva(double a, double b){
        return a*b;

    }
}
