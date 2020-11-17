/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dog;

/**
 *
 * @author user
 */
public class TestDog {
    public static void main(String[] args) {
        Dog d1 = new Dog("Шурик", 2);
        Dog d2 = new Dog("Бобик", 7);
        Dog d3 = new Dog("Бобик2");
        d3.setAge(1);
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}
