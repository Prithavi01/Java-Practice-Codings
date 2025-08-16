import java.util.Scanner;
class Stuavg{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        float a=s.nextFloat();
        float b=s.nextFloat();
        float c=s.nextFloat();
        float d=s.nextFloat();
        float e=s.nextFloat();
        int total=(int)(a+b+c+d+e);
        int avg=total/5;
        System.out.println("Total:"+total);
        System.out.println("Average:"+avg);
    }
}