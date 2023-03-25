import java.util.Scanner;

/*
 * Реализовать простой калькулятор
 */
public class task3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter first number: ");
        int x = scanner.nextInt();

        System.out.println("Choose operation`s number (1 to 4): \n1. / \n2. * \n3. + \n4. -");
        int operation = scanner.nextInt();
        System.out.printf("Enter second number: ");
        int y = scanner.nextInt();
        float res = 0;
        switch (operation) {
            case 1:
                float fx = x;
                float fy = y;
                res = fx/fy;
                System.out.printf("%d / %d = %.2f", x, y, res);
                break;
            case 2:
                res = x*y;
                System.out.printf("%d * %d = %.1f", x, y, res);
                break;
            case 3:
                res = x+y;
                System.out.printf("%d + %d = %.1f", x, y, res);
                break;
            case 4:
                res = x-y;
                System.out.printf("%d - %d = %.1f", x, y, res);
                break;
            default:
                System.out.printf("invalid operation. try again");
                break;
        }
        scanner.close();
    }
}
