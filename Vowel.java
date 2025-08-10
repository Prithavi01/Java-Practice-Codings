import java.util.Scanner;
class Vowel{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        String d=s.nextLine();
        char ch=d.charAt(0);
        if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            System.out.println("Vowel");
        else
            System.out.println("Consonant");
        s.close();
    }
}