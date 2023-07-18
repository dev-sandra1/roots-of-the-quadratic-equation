import java.util.Scanner;

public class Excersice1{
    public static void main(String[] args) {
        
        Scanner enter = new Scanner(System.in);

        int A, B, C;
        int equis, cuadrado, resulAC, multiplication, cinco, raizCuadrada, suma, resta, positivo, negativo, total;
    
        System.out.println(" ingresa primer numero;");
        A = enter.nextInt();

        System.out.println(" ingresa segundo numero;");
        B = enter.nextInt();

        System.out.println(" ingresa tercer numero;");
        C = enter.nextInt();

         equis = 1 * -B;
         cuadrado = (int) (Math.pow( B , 2));
         resulAC = ( (-4 * A) * C);
          multiplication = 2 * A;
          cinco = cuadrado + resulAC;
          raizCuadrada = (int) Math.sqrt( cinco );
          suma = ((equis +  raizCuadrada ) / multiplication );
          resta = ((equis -  raizCuadrada ) / multiplication );
          positivo = (int) Math.pow( suma, 2) + (B * suma) + (C); 
            negativo = (int) Math.pow( resta, 2) + (B * resta) + (C); 
             total = positivo + negativo;

         System.out.println(+ total); 
        

    }
}