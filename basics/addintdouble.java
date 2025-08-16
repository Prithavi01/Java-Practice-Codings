import java.util.Scanner;
class addintdouble{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        double b=s.nextDouble();
        double res=(double)a +b;
        System.out.println("Result:"+res);
    }
}