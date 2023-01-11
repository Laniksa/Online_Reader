package com.company;

import java.util.Scanner;

public class Catalog {
    public static int numberBook = 0;
    public static int count = 0;//не работает нумерация
    public static int maxBook = 15;
    public static Book[] library = new Book[maxBook] ;

    public static boolean menu() {
        Scanner scan = new Scanner(System.in);
        int num;

        System.out.println("Введите действие: \n" +
                    "1. Добавить книгу \n" +
                    "2. Показать все книги \n" +
                    "3. Выход");
        num = scan.nextInt();
        if(num<1 || num>3){
            try {
                throw new Exception("не правильно введеное число");
            } catch (Exception e) {
                System.out.println("Выберите пункт в меню от 1 до 3");
            }
        }
            switch (num) {
                case 1:
                    addBook(createBook(scan));
                    menu();
                    break;
                case 2:
                    for (int i = 0; i < maxBook; i++) {
                        System.out.println(library[i]);
                    }
                    menu();

                    break;
                case 3:

                    System.out.println("\n Программа завершена");
                    return false;
        }
            return true;
    }
        public static Book createBook (Scanner scan){
            scan.nextLine();


            System.out.println("Введите название книги :");
            String tempName = scan.nextLine();

            System.out.println("Введите автора книги :");
            String tempAuthor = scan.nextLine();

            System.out.println("Введите дом издания книги :");
            String tempPublishingHouse = scan.nextLine();

                System.out.println("Введите год издания книги :");
                int tempPublished = correctNumberInput(scan);

                System.out.println("Введите количество страниц книги :");
                int tempPages = correctNumberInput(scan);


            return new Book(count, tempName, tempAuthor, tempPublishingHouse, tempPublished, tempPages);
        }
        public static void addBook(Book book){
            library[numberBook] = book;
            numberBook++;

        }

        public static int correctNumberInput(Scanner scan) throws NumberFormatException {
        return Integer.parseInt(scan.nextLine());
        }

        public static void main (String[]args){
            menu();
        }
    }

