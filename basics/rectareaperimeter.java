import java.util.Scanner;
class rectareaperimeter{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int l=s.nextInt();
        int b=s.nextInt();
        int area=l*b;
        int perimeter=2*(l+b);
        System.out.println("Area:"+area);
        System.out.println("Perimeter:"+perimeter);
    }
}