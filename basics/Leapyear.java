import java.util.Scanner;
class Leapyear{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        if(a %400==0)
           System.out.println("Leap Year");
        else if(a%4==0 && a%100!=0)
           System.out.println("Leap Year");
        else
           System.out.println("Not a Leap Year");
        s.close();   
    }
}