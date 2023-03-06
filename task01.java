// Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
import java.util.Scanner;
public class task01 {
    public static void main(String[] args) { 
        //int n = 5;
        Scanner number = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = number.nextInt();
        number.close();
        int sum = 0;
        int comp = 1;
        for (int i = 1; i <= n; i++) {
            sum += i;
            comp *= i;
        }
        System.out.println("Треугольное число: " + sum); 
        System.out.println("n!: " + comp); 
    } 
}