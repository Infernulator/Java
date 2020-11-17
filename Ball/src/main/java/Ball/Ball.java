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
import java.lang.System;

public class Ball {

    private String color;
    private double raduis;


    public Ball(String color, double raduis){
        this.color = color;
        this.raduis = raduis;
    }

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }

    public double getRaduis(){
        return raduis;
    }
    public void setRadius(double raduis){
        this.raduis = raduis;
    }

    public  String toString(){
        return this.raduis+", Цвет: "+this.color;

    }


}
