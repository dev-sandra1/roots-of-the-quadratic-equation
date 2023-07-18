import java.util.Scanner;

public class Excercise2 {
 public static void main(String[] args) {
    
    Scanner enter = new Scanner (System.in);
    int num;
    int multiple;

     System.out.println("say a number: ");
     num = enter.nextInt();

     System.out.println("enter a multiple: ");
         multiple = enter.nextInt();

    if(num % multiple == 0) {
        System.out.println("is a multiple is of :" + num);

    }else {
    System.out.println("sorry this is not a multiple"); }

 }
}
 