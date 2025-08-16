import java.util.Scanner;
class ValidTriangle{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        if(a+b>c && b+c>a && a+c>b)
           System.out.println("Valid Triangle");
        else
           System.out.println("Not a Valid Triangle");
        s.close();
    }
}