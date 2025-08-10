import java.util.Scanner;
class Compareint{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        if(a>b)
            System.out.printf("%d is greater than %d",a,b);
        else if(b>a)
            System.out.printf("%d is greater than %d",b,a);
        else
            System.out.printf("%d is equal to %d",a,b);
        s.close();
    }
}