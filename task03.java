// Реализовать простой калькулятор (+ - / *)
import java.util.Scanner;
public class task03 {
    public static void main(String[] args) {
        Scanner dataEntry = new Scanner(System.in);
        System.out.print("Введите 1 число: ");
        int n1 = dataEntry.nextInt();
        System.out.print("Введите 2 число: ");
        int n2 = dataEntry.nextInt();
        System.out.print("Введите знак (+, -, /, *): ");
        String operator = dataEntry.next();
        dataEntry.close(); // закрытие сканера

        int result = 0;
        if ("+".equals(operator)) {
            result = n1 + n2;
        }
        if ("-".equals(operator)) {
            result = n1 - n2;
        }
        if ("/".equals(operator)) {
            result = n1 / n2;
        }
        if ("*".equals(operator)) {
            result = n1 * n2;
        }
        System.out.print(n1 + " " + operator + " " + n2 + " = " + result);
    }
}