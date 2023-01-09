package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Catalog {
    public static int numberBook = 0;
    public static int maxBook = 15;
    public static Book[] library = new Book[maxBook] ;

    public static boolean menu() {
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.println("Введите действие: \n" +
                    "1. Добавить книгу \n" +
                    "2. Показать все книги \n" +
                    "3. Выход");


//        try {
//            num = scan.nextInt();// проверка на ввод
//
//            if (num < 1 || num > 3) {
//                throw new InputMismatchException();
//            }
//
//        } catch (InputMismatchException e) {
//            System.out.println("Введите корректное число из меню");
//        }
        num = scan.nextInt();//пришлось дублировать сос строкой 21,иначе не видит
            switch (num) {//не читается
                case 1:
                    addBook(createBook(scan));
                    break;
                case 2:
                    for (int i = 0; i < maxBook; i++) {
                        System.out.println(library[i]);
                    }

                    break;
                case 3:

                    System.out.println("\n Программа завершена");// не выходит из программы
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

            System.out.println("Введите дом издания книги :");// после ввода зацикливается
            String tempPublishingHouse = scan.nextLine();

            System.out.println("Введите год издания книги :");
            int tempPublished = scan.nextInt();

            System.out.println("Введите количество страниц книги :");
            int tempPages = scan.nextInt();

            return new Book(tempName, tempAuthor, tempPublishingHouse, tempPublished, tempPages);
        }
        public static void addBook(Book book){
            library[numberBook] = book;
            numberBook++;

        }
        public static void main (String[]args){
        while (true) {// не могу придумать ка зациклить меню без while
            menu();
        }

        }
    }

