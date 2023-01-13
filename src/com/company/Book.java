package com.company;

public class Book {
   // private static int count = 0;
    private  String name;
    private  String author;
    private  String publishingHouse;
    private  int published;
    private  int pages;
    private int count;


    public Book(int count, String name, String author, String publishingHouse, int published, int pages){
        this.count = count;
        this.name = name;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.published = published;
        this.pages = pages;


    }
    public String getName(){
        return name;
    }
    public String getAuthor(){
        return author;
    }
    public String getPublishingHouse(){
        return publishingHouse;
    }
    public int getPublished(){
        return published;
    }
    public int getPages(){
        return pages;
    }
//    public int getCount(){
//        return count;
//    }
//    public void setCount(int count){
//        this.count = count;
//    }

    public String toString() {

        return
                "Номер книги: " +count+"\n"+
                "Название: " + name + "\n" +
                "Автор: " + author + "\n" +
                "Дом издания: " + publishingHouse + "\n" +
                "Год издания :" + published + "\n" +
                "Количество страниц: " + pages+ "\n";
    }


}
