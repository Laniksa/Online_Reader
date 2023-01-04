package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите действие: \n" +
                "1. Добавить книгу \n" +
                "2. Показать все книги");
        String str = scan.nextLine();
        int num = Integer.parseInt(str);
        switch(num){
            case 1:
                new Book(input(scan));//сделать метод
        }

    }
}
