import java.util.Scanner;
class chartoASCII{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        String l=s.nextLine();
        char ch=l.charAt(0);
        int k=(int)ch;
        System.out.println("ASCII value:"+k);
    }
}