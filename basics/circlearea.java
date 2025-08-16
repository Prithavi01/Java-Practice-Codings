import java.util.Scanner;
class circlearea{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int r=s.nextInt();
        double area=(double)3.14*r*r;
        double circum=(double)2*3.14*r;
        System.out.println("Area:"+area);
        System.out.println("Circumference:"+circum);
    }
}