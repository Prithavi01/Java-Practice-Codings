import java.util.Scanner;
class revnum{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int u=0;
        while(num!=0){
             int j=num%10 ;
             u=u*10+j;
             num=num/10;
        }
        System.out.println("Reversed:"+u);
    }
}
