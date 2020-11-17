/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ball;

/**
 *
 * @author user
 */
public class TestBall {
    public static void main(String[] args){
        Ball b1 = new Ball("Черный", 2.4);
        Ball b2 = new Ball("Красный", 2.4);
        b2.setColor("Красный");
        System.out.println(b1);
        System.out.println(b2);
    }
}
