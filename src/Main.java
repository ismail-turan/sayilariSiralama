import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt(),b=scanner.nextInt(),c=scanner.nextInt();
        if (a>b){
            if (a>c){
                if (b>c){
                    System.out.println(a+ ">" + b +">"+ c);
                }else {
                    System.out.println(a+ ">" + c +">"+ b);
                }
            } else {
                System.out.println(c+ ">" + a +">"+ b);
            }
        }else if (b>c){
            if (c>a){
                System.out.println(b+ ">" + c +">"+ a);
            }else{
                System.out.println(b+ ">" + a +">"+ c);
            }
        }else {
            System.out.println(c+">"+b+">"+a);
        }
    }
}