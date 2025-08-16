import java.util.Scanner;
class sqcube{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int sq=a*a;
        int cube=(int)Math.pow(a,3);
        System.out.println("Square:"+sq);
        System.out.println("Cube:"+cube);
    }
}