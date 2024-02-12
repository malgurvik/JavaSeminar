package org.example.phoneBook;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PhoneBook myPhoneBook = new PhoneBook();
        fillContacts(myPhoneBook);
        mainMenu(myPhoneBook);
    }

    public static void fillContacts(PhoneBook phoneBook) {
        phoneBook.add("Иванов", "89991234567");
        phoneBook.add("Иванов", "89119876543");
        phoneBook.add("Петров", "89995675434");
        phoneBook.add("Сидоров", "89057894532");
        phoneBook.add("Сидоров", "89169087856");
        phoneBook.add("Сидоров", "89218766756");
        phoneBook.add("Васильев", "89669876754");
    }

    public static void mainMenu(PhoneBook phoneBook) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nМеню:");
            System.out.println("1. Добавить контакт");
            System.out.println("2. Удалить контакт");
            System.out.println("3. Удалить номер телефона контакта");
            System.out.println("4. Показать контакты");
            System.out.println("5. Выход");
            System.out.print("Введите пункт меню: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Введите имя: ");
                    String name = scanner.nextLine();
                    System.out.print("Введите номер: ");
                    String phone = scanner.nextLine();
                    phoneBook.add(name, phone);
                    break;
                case 2:
                    System.out.print("Введите имя для удаления: ");
                    String deleteName = scanner.nextLine();
                    phoneBook.deleteContact(deleteName);
                    break;
                case 3:
                    System.out.println("Введите имя для удаления номера контакта:");
                    String removeName = scanner.nextLine();
                    System.out.println("Введите номер: ");
                    String removeNumber = scanner.nextLine();
                    phoneBook.removeNumber(removeName, removeNumber);
                    break;
                case 4:
                    phoneBook.getAllContacts();
                    break;
                case 5:
                    System.out.println("До свидания!");
                    System.exit(0);
                default:
                    System.out.println("Неверный выбор пункта меню.");
            }
        }
    }
}
