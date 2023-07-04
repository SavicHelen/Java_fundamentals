public class zadatak18 {
    /*18.	Metod povrsina računa i vraća u main povrsinu pravougaonika (a*b).
    Main poziva metod povrsina(a,b) i ispisuje površine pravougaonika.
    Pozvati 3 puta metod sa razlicitim vrednostima.*/
    public static void main(String[] args) {
        double povrsinaPravougaonika = povrsina( 5,6);
        System.out.println("Povrsina pravougaonika za unete duzine stranica  je " + povrsinaPravougaonika);

        double povrsinaPravougaonika2 = povrsina( 7,8);
        System.out.println("Povrsina pravougaonika za unete duzine stranica  je " + povrsinaPravougaonika2);

        double povrsinaPravougaonika3 = povrsina( 2,14);
        System.out.println("Povrsina pravougaonika za unete duzine stranica  je " + povrsinaPravougaonika3);
    }

        public static double povrsina(int a, int b){
            return a * b;
        }

    }
