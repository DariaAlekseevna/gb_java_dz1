/*
 * Вывести все простые числа от 1 до 1000
 */
public class task2 {
    public static void main(String[] args) {
        
        boolean flag = true;
        for (int i = 1; i < 1000; i++) {
            for (int j = 2; j < i; j++) {
                if ((i % j == 0) && (flag = true)) {
                    flag = false;
                }
            }
            if (flag == true) {
                System.out.print(i);
                System.out.print(" ");
            }
            flag = true;
        }
    }
}
