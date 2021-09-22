//Создайте программу, которая находит и выводит все простые числа меньше 100.

import java.util.Scanner;

public class Primes {

    //Метод проверяющий число на то, просто ли оно
    public static boolean isPrime (int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.print("Введите число: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        for (int i = 2; i <= number; i++) {
            if (isPrime(i)) System.out.print(i + " ");
        }
    }
}
