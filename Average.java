import java.util.Scanner;
class Average{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        float res=(a+b+c)/3;
        System.out.println("Average:"+res);
    }
}