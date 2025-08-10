import java.util.Scanner;
class swapwithtemp{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After swap: a = "+a+", b = "+b);
    }
} 