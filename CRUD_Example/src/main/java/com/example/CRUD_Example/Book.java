package com.example.CRUD_Example;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book {

    @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String tittle;
    private String author;
    private int page;
    private double price;

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", tittle='" + tittle + '\'' +
                ", author='" + author + '\'' +
                ", page=" + page +
                ", price=" + price +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Book(long id, String tittle, String author, int page, double price) {
        this.id = id;
        this.tittle = tittle;
        this.author = author;
        this.page = page;
        this.price = price;
    }

    // default constructor
    public Book(){
    }



}
