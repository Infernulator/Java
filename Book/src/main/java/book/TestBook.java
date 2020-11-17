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
public class TestBook {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args){
            Book b1 = new Book("Мастер и маргарита", "Комедия", 2020, "Булгаков");
            b1.setYear(1888);
            System.out.println(b1);
        }
}
    
