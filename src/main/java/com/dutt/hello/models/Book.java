package com.dutt.hello.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import io.micrometer.common.lang.NonNull;

import java.io.Serializable;


import javax.persistence.*;

    @Entity
    @Table(name = "Book1") 
    public class Book implements Serializable{
    
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name="bookId")
        private int id;
    
        @Column(name="title",length = 255)
        @NonNull
        private String title;
    
        @Column(name="author",length = 255)
        @NonNull
        private String author;
    
        @Column(name="publicationYear") 
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