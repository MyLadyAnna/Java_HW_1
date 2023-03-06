// Вывести все простые числа от 1 до 1000
public class task02 {
    public static void main(String[] args) {
        for (int i = 2; i <= 1000; i++) {       // перебираем числа по порядку,  считаем их простыми
            boolean primeNumb = true;           
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    primeNumb = false;          // если число i поделится на какое либо число кроме себя и 1 (перебираем все числа до i - j) - составное
                    break;
                }
            }
            if (primeNumb) {
                System.out.print(i + " ");
            }
        }
    }
}