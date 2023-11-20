package com.dutt.hello.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import io.micrometer.common.lang.NonNull;

import java.io.Serializable;

import javax.persistence.*;

    @Entity
    @Table(name = "Book1") // Specify the table name in the database
    public class Book implements Serializable{
    
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name="bookId")// Specify the column name in the database
        private int id;
    
        @Column(length = 255)
        @NonNull// Specify the column name in the database
        private String title;
    
        @Column(length = 255)
        @NonNull// Specify the column name in the database
        private String author;
    
        @Column // Specify the column name in the database
        private int publicationYear;
    

    public Book() {
    }

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
}
