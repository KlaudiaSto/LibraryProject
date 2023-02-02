package org.example;

public class Book {

    // book parameters

    private String bookTitle;
    private String bookAuthor;
    private String bookPrintingDate;
    private String bookType;
    private Integer bookPagesNumber;
    private Boolean bookAvailability;

    public Book (String bookTitle, String bookAuthor, String bookPrintingDate, String bookType, Integer bookPagesNumber, Boolean bookAvailability){
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookPrintingDate = bookPrintingDate;
        this.bookType = bookType;
        this.bookPagesNumber = bookPagesNumber;
        this.bookAvailability = bookAvailability;
    }

    public void bookDetails() {
        System.out.println("Title: " + this.bookTitle + "Author: " + this.bookAuthor + "Printing Date: " + this.bookPrintingDate
                + "Type: " + this.bookType + "Pages Number: " + this.bookPagesNumber + "Book Availability: " + this.bookAvailability);
    }

    public String getBookTitle() {
        return this.bookTitle;
    }

    public void setBookTitle(String value) {
        this.bookTitle = value;
    }

    public String getBookAuthor() {
        return this.bookAuthor;
    }

    public void setBookAuthor(String value) {
        this.bookAuthor = value;
    }

    public String getBookPrintingDate() {
        return this.bookPrintingDate;
    }

    public void setBookPrintingDate(String value) {
        this.bookPrintingDate = value;
    }

    public String getBookType() {
        return this.bookType;
    }

    public void setBookType(String value) {
        this.bookType = value;
    }

    public Integer getBookPagesNumber() {
        return this.bookPagesNumber;
    }

    public void getBookPagesNumber(Integer value) {
        this.bookPagesNumber = value;
    }

    public Boolean getBookAvailability() {
        return this.bookAvailability;
    }

    public void setBookAvailability(Boolean value) {
        this.bookAvailability = value;
    }



}
