import java.util.Scanner;
class Compoundinterest{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        double P=s.nextInt();
        double R=s.nextInt();
        double T=s.nextInt();
        double CI=P* Math.pow(1+(R/100),T)-P;
        System.out.printf("CompundInterest:%.2f",CI);
        s.close();
    }
}