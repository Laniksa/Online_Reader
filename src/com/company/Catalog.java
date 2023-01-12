package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Catalog {
    public static int numberBook = 0;
    public static final int maxBook = 15;
    public static Book[] library = new Book[maxBook] ;

    public static boolean menu() {
        Scanner scan = new Scanner(System.in);

        while (true){
            int num;
            System.out.println("Введите действие: \n" +
                    "1. Добавить книгу \n" +
                    "2. Показать все книги \n" +
                    "3. Выход");
            try {
                num = scan.nextInt();
                switch (num) {
                    case 1:
                        addBook(createBook(scan));

                        break;
                    case 2:
                        for (int i = 0; i < numberBook; ++i) {
                            System.out.println(library[i]);
                        }

                        break;
                    case 3:

                        System.out.println("\n Программа завершена");
                        return false;
                    default:
                        System.out.println("Выберите пункт в меню от 1 до 3");

                }
            }catch(InputMismatchException e){
                System.out.println("Введите числовое значение пункта меню");
            }

        }

    }
        public static Book createBook (Scanner scan){
            scan.nextLine();
            int tempPublished;
            int tempPages;


            System.out.println("Введите название книги :");
            String tempName = scan.nextLine();

            System.out.println("Введите автора книги :");
            String tempAuthor = scan.nextLine();

            System.out.println("Введите дом издания книги :");
            String tempPublishingHouse = scan.nextLine();

            while (true){
                try{
                    System.out.println("Введите год издания книги :");
                    tempPublished = correctNumberInput(scan);
                    break;
                }catch(NumberFormatException e){
                    System.out.println("Введите год издания в числовом формате");
                    continue;
                }
            }

            while (true){
                try {
                    System.out.println("Введите количество страниц книги :");
                    tempPages = correctNumberInput(scan);
                    break;
                }catch(NumberFormatException e) {
                    System.out.println("Введите количество страниц в числовом формате в числовом формате");
                    continue;
                }
            }

            return new Book(numberBook, tempName, tempAuthor, tempPublishingHouse, tempPublished, tempPages);
        }
        public static void addBook(Book tempBook){
            library[numberBook] = tempBook;
            ++numberBook;

        }

        public static int correctNumberInput(Scanner scan) throws NumberFormatException {
        return Integer.parseInt(scan.nextLine());
        }

        public static void main (String[]args){
            menu();
        }
    }

