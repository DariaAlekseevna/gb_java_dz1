import java.util.Scanner;

/**
* Вычислить n-ое треугольного число (сумма чисел от 1 до n), 
* n! (произведение чисел от 1 до n)
*/
public class task1 {

    public static void main(String[] args) {
        
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Enter n: ");
        int n = iScanner.nextInt();
        iScanner.close();
        int res = 0;
        int factorial = 1;
        while (n > 0) {
            res = res + n;
            factorial *= n;
            n--;
        }
        System.out.printf("Triangular number: %d \nFactorial n: %d", res, factorial);


    }
}