import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите любое целое не отрицательное число: ");
        int input = new Scanner(System.in).nextInt();
        System.out.println(avg(input));
    }

    public static double avg(int num) {
        String numStr = String.valueOf(num);
        double sum = 0;
        for (int i = 0; i < numStr.length(); i++) {
            sum += Integer.parseInt(String.valueOf(numStr.charAt(i)));
        }
        sum = sum / numStr.length();
        return sum; //todo заменить 0 на корректный результат.
    }
}
