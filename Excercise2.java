import java.util.Scanner;

public class Excercise2 {
 public static void main(String[] args) {
    
    Scanner enter = new Scanner (System.in);
    int numero;
    int multiplo;

         System.out.println("dijata un numero");
    numero = enter.nextInt();

     System.out.println("ingresa un multiplo");
    multiplo = enter.nextInt();

    if(numero % multiplo == 0) {
        System.out.println("es multriplo es de:" + numero);

    }else {
    System.out.println("lo siento este no es un multiplo"); }

 }
}
 