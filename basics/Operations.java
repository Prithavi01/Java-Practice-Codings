import java.util.Scanner;
class Operations{
    public static void main(String[]args){
        Scanner inp=new Scanner(System.in);
        int a=inp.nextInt();
        int b=inp.nextInt();
        System.out.println("Sum:"+(a+b));
        System.out.println("Difference:"+(a-b));
        System.out.println("Product:"+(a*b));
        System.out.println("Quotient:"+(a/b));
    }
}