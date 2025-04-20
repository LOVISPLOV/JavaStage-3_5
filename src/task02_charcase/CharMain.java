package task02_charcase;

import java.util.Scanner;

public class CharMain {
    public static int findSlash(String input) {
        if (input == null || input.isEmpty()) {
            return -1;
        }

        int index = input.indexOf('/');

        return index;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String userInput = scanner.nextLine();

        int slashIndex = findSlash(userInput);

        if (slashIndex != -1) {
            System.out.println("Индекс символа '/': " + slashIndex);
        } else {
            System.out.println("Символ '/' не найден.");
        }
    }
}
