import java.util.Scanner;

public class LetterCounter {
    public static void main(String[] args) {
        // Создаем объект Scanner для считывания ввода с консоли
        Scanner scanner = new Scanner(System.in);

        // Просим пользователя ввести строку
        System.out.println("Введите строку:");
        String input = scanner.nextLine();

        // Закрываем сканнер, так как он больше не нужен
        scanner.close();

        // Определяем количество строчных и прописных букв
        int lowercaseCount = 0;
        int uppercaseCount = 0;

        for (char c : input.toCharArray()) {
            if (Character.isLowerCase(c)) {
                lowercaseCount++;
            } else if (Character.isUpperCase(c)) {
                uppercaseCount++;
            }
        }

        // Выводим результат
        System.out.println("Количество строчных букв: " + lowercaseCount);
        System.out.println("Количество прописных букв: " + uppercaseCount);
    }
}