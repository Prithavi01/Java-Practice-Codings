import java.util.Scanner;
class numrange{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        if ((a > b && a < c) || (a > c && a < b))
            System.out.println(a + " lies between " + b + " and " + c);
        else 
            System.out.println(a + " does not lie between " + b + " and " + c);
    }
}
