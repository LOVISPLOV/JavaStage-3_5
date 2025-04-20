package task01_charcase;

import java.util.Scanner;

public class CharMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите символ: ");
        char a = scanner.nextLine().charAt(0);

        String vowels = "аеёиоуыэюяАЕЁИОУЫЭЮЯaeiouAEIOU";

        if (vowels.indexOf(a) != -1) {
            System.out.println("Гласная ");

        } else if (Character.isLetter(a)) {
            System.out.println("Согласная");

        } else {
            System.out.print("Это не буква");

        }
    }
}
