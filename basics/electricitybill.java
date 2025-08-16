import java.util.Scanner;
class electricitybill{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int used=s.nextInt();
        double bill=used*5.0;
        System.out.println("Bill:"+bill);
    }
}