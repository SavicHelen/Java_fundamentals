public class zadatak5 {
    /*5.	Napisati program koji sabira parne prirodne brojeve do 100.*/
    public static void main(String[] args) {
        int i=0;
        int sum=0;
        for(i=0;i<100;i++){
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.println("Zbir parnih brojeva do 100 je "+sum);
    }
}
