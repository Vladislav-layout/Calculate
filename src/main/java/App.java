import calculate.Calculate;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите 1 число: ");
            double number1 = in.nextDouble();
            System.out.print("Введите 2 число: ");
            double number2 = in.nextDouble();
            System.out.print("Введите знак: ");
            char sign = (char) System.in.read();
            Calculate calculate = new Calculate(number1, number2, sign);
            System.out.print("Результат: " + calculate.getResult());
            in.close();
        } catch (InputMismatchException | IOException e) {
            System.out.println("Ошибка. Возможен ввод только чисел в корректном формате. Ошибка: " + e);
        }
    }
}