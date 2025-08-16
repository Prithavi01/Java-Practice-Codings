import java.util.Scanner;
class Speed{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        float distance=s.nextFloat();
        float time=s.nextFloat();
        float speed=distance/time;
        System.out.println("Speed:"+speed);
    }
}