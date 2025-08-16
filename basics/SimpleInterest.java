import java.util.Scanner;
class SimpleInterest{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        double P=s.nextInt();
        double R=s.nextInt();
        double T=s.nextInt();
        double SI=(P*R*T)/100;
        System.out.println("Simple Interest:"+SI);
        s.close();
    }
}