package com.company;

public class Book {

    private String Title;
    private String Author;
    private String Description;
    private int Price;
    private String isInStock;
    private String DisplayText;

    public Book() {
    }

    public Book(String Title, String Author, String Description, int Price, String isInStock){
        this.Title = Title;
        this.Author = Author;
        this.Description = Description;
        this.Price = Price;
        this.isInStock = isInStock;
        this.DisplayText = DisplayText;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public String getIsInStock() {
        return isInStock;
    }

    public void setIsInStock(String isInStock) {
        this.isInStock = isInStock;
    }


    public String getDisplayText() {
        return
                "Title: " + Title + "\n" +
                        "Author: " + Author + "\n"+
                        "Description: " + Description + "\n";

    }
}







