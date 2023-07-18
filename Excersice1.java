import java.util.Scanner;

public class Excersice1{
    public static void main(String[] args) {
        
        Scanner enter = new Scanner(System.in);

        int num1, num2, num3;
        int equis, square, resulAC, multiplication, squareSum, squareRoot, addition, subtraction, positive, negative, total;
    
        System.out.println(" enter first number:");
        num1 = enter.nextInt();

        System.out.println(" enter second number:");
        num2 = enter.nextInt();

        System.out.println("enter third number:");
        num3 = enter.nextInt();

         equis = 1 * -num2;
         square = (int) (Math.pow( num2 , 2));
         resulAC = ( (-4 * num1) * num3);
         multiplication = 2 * num1;
         squareSum = square + resulAC;
         squareRoot = (int) Math.sqrt( squareSum );
         addition = ((equis +    squareRoot ) / multiplication );
         subtraction = ((equis -    squareRoot ) / multiplication );
         positive = (int) Math.pow( addition, 2) + (num2 * addition) + (num3);
         negative = (int) Math.pow( subtraction, 2) + (num2 * subtraction) + (num3); 
         total = positive + negative;

         System.out.println(+ total); 
        

    }
}