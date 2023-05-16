import java.util.Scanner;

public class HomeWork_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое слово: ");
        String word1 = scanner.nextLine();

        System.out.print("Введите второе слово: ");
        String word2 = scanner.nextLine();

        if (word1.length() % 2 != 0 || word2.length() % 2 != 0) {
            System.out.println("Слова должны содержать четное количество букв.");
            return;
        }

        String result = returnNewWord(word1, word2);
        System.out.println("Результат: " + result);

        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        int additionResult = addition(num1, num2);
        int subtractionResult = subtraction(num1, num2);
        int multiplicationResult = multiplication(num1, num2);
        int divisionResult = division(num1, num2);

        System.out.println("Результат сложения: " + additionResult);
        System.out.println("Результат вычитания: " + subtractionResult);
        System.out.println("Результат умножения: " + multiplicationResult);
        System.out.println("Результат деления: " + divisionResult);

        System.out.print("Введите сумму в евро: ");
        double euroAmount = scanner.nextDouble();

        System.out.print("Введите текущий курс (USD за 1 EUR): ");
        double exchangeRate = scanner.nextDouble();

        convertCurrency(euroAmount, exchangeRate);
    }

    public static String returnNewWord(String word1, String word2) {
        int halfLength = word1.length() / 2;
        String firstHalf = word1.substring(0, halfLength);
        String secondHalf = word2.substring(halfLength);
        return firstHalf + secondHalf;
    }

    public static int addition(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    public static int division(int num1, int num2) {
        return num1 / num2;
    }

    public static void convertCurrency(double euroAmount, double exchangeRate) {
        double usdAmount = euroAmount * exchangeRate;
        System.out.println("При курсе " + exchangeRate + " USD за один EUR, при обмене " +
                euroAmount + " EUR, вы получите " + usdAmount + " USD.");
    }
}
