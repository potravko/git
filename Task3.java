package lesson3;

// корявая программа получилась, подскажите, пожалуйста, как исправить. Несколько дней уже мучаюсь.
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        GuessTheNumber();
    }

    public static void GuessTheNumber() {
        int a,b, n;
        a = (int) (Math.random() * 10);
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число от 0 до 9.");
        n = sc.nextInt();
        for (int i = 0; i < 3;i++) {
            if (a < n) {
                System.out.println("Число больше!");
            }
            if (a > n) {
                System.out.println("Число меньше!");
            }
            if (a == n) {
                System.out.println("Вы угадали!");
                System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
                b = sc.nextInt();
                if (b == 1) {
                    GuessTheNumber();
                } else {
                    System.out.println("Спасибо за игру!");
                }
                break;
            }

            System.out.println("Вы не угадали :(");

            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            b = sc.nextInt();
            if (b == 1) {
                GuessTheNumber();
            } else {
                System.out.println("Спасибо за игру!");
            }
        }
    }
}




