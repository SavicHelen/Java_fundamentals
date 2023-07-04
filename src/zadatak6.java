public class zadatak6 {
    /*6.	Napisati program koji ce prebrojati prirodne brojeve u intervalu od 1 do 50 koji su djeljivi sa 3.*/
    public static void main(String[] args) {

        int count=0;
        for (int i=0;i<50;i++){
            if (i%3==0){
                count+=1;
            }
        }
        System.out.println("Ima "+count+" brojeva deljivih sa 3 u intervalu od 1 do 50");

    }
}
