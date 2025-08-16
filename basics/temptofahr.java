import java.util.Scanner;
class temptofahr{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        double C =s.nextDouble();
        double fahr=C*(9/5)+32;
        System.out.println("Fahrenheit:"+fahr);
        s.close();
    }
}