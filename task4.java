import java.io.FileReader;

/*
 * Задано уравнение вида q + w = e, q, w, e >= 0. 
 * Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69. 
 * Требуется восстановить выражение до верного равенства. 
 * Предложить хотя бы одно решение или сообщить, что его нет.
 */
public class task4 {
    public static void main(String[] args) throws Exception {

        String st = ReadFile("equation.txt");
        GetResult(st);
    }
    
    private static String ReadFile(String Filename) throws Exception {
    
        StringBuilder builder = new StringBuilder();
        FileReader fr = new FileReader(Filename);
        int c;
        while ((c = fr.read()) != -1) {
            char ch = (char) c;
            if (ch == '\n') {
                System.out.print(ch);
            } else{
                System.out.print(ch);
                builder.append(ch);
            }
        }
        fr.close();
        System.out.println();
        return builder.toString();
    }

    private static void GetResult(String st) {

        int number1 = 0;
        int number2 = 0;
        int number3 = 0;
        boolean flag = true;
        for (int i = 0; i < st.length()-1; i++) {
            if (Character.isDigit(st.charAt(i)) && (st.charAt(i+1) == '?'))
                number1 = Character.digit(st.charAt(i), 10)*10;
            if ((i != 0) && Character.isDigit(st.charAt(i)) && (st.charAt(i-1) == '?'))
                number2 = Character.digit(st.charAt(i), 10);
            if (Character.isDigit(st.charAt(i)) && Character.isDigit(st.charAt(i+1)))
                number3 = Character.digit(st.charAt(i), 10)*10 + Character.digit(st.charAt(i+1), 10);
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 10; j < 91; j+=10) {
                if ((number1 + i + j + number2) == number3) {
                    System.out.printf("%d + %d = %d", number1+i, j+number2, number3);
                    flag = false;
                }
            }
        }
        if (flag == true)
            System.out.println("No solutions!");
    }
}



