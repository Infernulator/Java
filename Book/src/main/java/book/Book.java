/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book;

/**
 *
 * @author user
 */
public class Book {

    private String title;
    private String genre;
    private int year;
    private String writer;


    public Book(String title, String genre, int year, String writer) {
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.writer = writer;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getWriter() {
        return writer;
    }

    public int getYear() {
        return year;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String toString(){
        return "Название: "+this.title+"\nЖанр: "+this.genre+"\nПисатель: "+this.writer+"\nГод: "+this.year;


    }


}
