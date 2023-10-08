package Main;

import Phone.Phone;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Phone[] phones = createArrayOfObject();

        Scanner scanner = new Scanner(System.in);
        int check;

        while (true) {
            System.out.println("""
                    Виберіть дію(напишіть цифру)
                    0 - завершити програму
                    1 - відомості про абонентів, у яких час міських розмов перевищує заданий
                    2 - відомості про абонентів, які користувались міжміським зв'язком
                    3 - відомості про абонентів чий номер рахунку знаходиться у вказаному діапазоні
                    (Якщо на екран нічого не виведено значить такі абоненти відсутні)""");
            check = scanner.nextInt();
            switch (check) {
                case 1 -> printSubscriberThatTimeTownTalksIsHigher(phones);
                case 2 -> printSubscribersWhoUsedLongDistanceCommunication(phones);
                case 3 -> printSubscribersWhoAreInACertainRange(phones);
                case 0 -> {
                    return;
                }
                default -> System.out.println("Ви ввели неправильне число попробуйте ще раз");
            }

        }

    }

    public static Phone[] createArrayOfObject() {
        System.out.println("Введіть розмір масиву об'єктів");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        Phone[] phones = new Phone[num];
        for (int i = 0; i < num; i++) {
            System.out.printf("%s Абонент\n", i + 1);
            System.out.println("Введіть id ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Введіть прізвище ");
            String lastName = scanner.nextLine();
            System.out.println("Введіть ім'я ");
            String name = scanner.nextLine();
            System.out.println("Введіть по батькові ");
            String patronymic = scanner.nextLine();
            System.out.println("Введіть номер рахунку ");
            int accountNumber = scanner.nextInt();
            System.out.println("Введіть час міських розмов(хв)");
            double timeForTownTalks = scanner.nextDouble();
            System.out.println("Введіть час міжміських розмов(хв) ");
            double longDistanceCallTime = scanner.nextDouble();

            phones[i] = new Phone(id, lastName, name, patronymic, accountNumber, timeForTownTalks, longDistanceCallTime);

        }
        return phones;
    }

    public static void printSubscriberThatTimeTownTalksIsHigher(Phone[] phones) {
        System.out.println("Введіть час розмов");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        Arrays.stream(phones)
                .filter(x -> x.getTimeForTownCalls() > num)
                .forEach(x -> System.out.println(x +"\n-------------------------------"));
    }

    public static void printSubscribersWhoUsedLongDistanceCommunication(Phone[] phones) {
        Arrays.stream(phones)
                .filter(x -> x.getLongDistanceCallTime() > 0)
                .forEach(x -> System.out.println(x +"\n-------------------------------"));
    }

    public static void printSubscribersWhoAreInACertainRange(Phone[] phones) {
        System.out.println("Введіть діапазон в якому можуть знаходитися номер рахунку");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Початок: ");
        int startRange = scanner.nextInt();
        System.out.print("Кінець: ");
        int endRange = scanner.nextInt();

        Arrays.stream(phones)
                .filter(x -> x.getAccountNumber() >= startRange && x.getAccountNumber() <= endRange)
                .forEach(x -> System.out.println(x +"\n-------------------------------"));
    }

}