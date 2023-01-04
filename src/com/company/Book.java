package com.company;

public class Book {
    private static String name;
    private static String author;
    private static String publishingHouse;
    private static int published;
    private static int pages;


    public Book(String name, String author, String publishingHouse, int published, int pages){
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
    public String toString(){
        return "Название: " + name +"\n"+
                "Автор: " + author +"\n"+
                "Издание: " + publishingHouse +"\n"+
                "Год издания :"+ published +"\n"+
                "Количество страниц: " + pages;
    }


}
