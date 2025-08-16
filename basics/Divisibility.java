import java.util.Scanner;
class Divisibility{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int a =s.nextInt();
        if(a%3==0 && a%5==0)
            System.out.println("Yes");
        else
            System.out.println("No");
    s.close();
    }
}