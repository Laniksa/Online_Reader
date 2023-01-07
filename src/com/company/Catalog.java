package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Catalog {
    public static int numberBook = 0;
    public static Book[] library = new Book[10] ;
    public static void menu() {
        Scanner scan = new Scanner(System.in);
        int num;
        while (true) {
            System.out.println("Введите действие: \n" +
                    "1. Добавить книгу \n" +
                    "2. Показать все книги \n" +
                    "3. Выход");


            try {
                num = scan.nextInt();// проверка на ввод

                if (num < 1 || num > 3) {
                    throw new InputMismatchException();
                }
            } catch (InputMismatchException e) {
                System.out.println("Введите корректное число из меню");
            }
            switch (num){//не читается
                case 1:
                    addBook(createBook(scan));
                    break;
                case 2:
                    for(int i=0; i<10; i++){
                        System.out.println(library[i]);
                    }

                    break;
                case 3:

                    System.out.println("Программа завершена");// не выходит из программы
                    return false;


        }
    }
    public static Book createBook(Scanner sc){

        System.out.println("Введите название книги :");
        String tempName = sc.nextLine();

        System.out.println("Введите автора книги :");
        String tempAuthor = sc.nextLine();

        System.out.println("Введите дом издания книги :");// после ввода зацикливается
         String tempPublishingHouse = sc.nextLine();

        System.out.println("Введите год издания книги :");
        int tempPublished = sc.nextInt();

        System.out.println("Введите количество страниц книги :");
        int tempPages = sc.nextInt();

        return new Book(tempName,tempAuthor,tempPublishingHouse,tempPublished,tempPages);
    }
    public static void addBook(Book book){
        //Book[] library = new Book[10] ;
        library[numberBook] = book;
        numberBook++;

    }
    public static void main(String[] args) {
        menu();

    }

}
