package com.example.android.bookguide;


public class Book {

    public String mTitle;

    public String mAuthor;

    public String mGenre;

    

    public Book(String bookTitle,String bookAuthor,String bookGenre){

        mTitle = bookTitle;
        mAuthor = bookAuthor;
        mGenre = bookGenre;

    }

    public String getmTitle(){
        return mTitle;
    }

    public String getmAuthor(){
        return mAuthor;
    }

    public String getmGenre(){
        return mGenre;
    }
}
