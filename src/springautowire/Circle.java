/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springautowire;

import org.springframework.beans.factory.annotation.Autowired;

/**
 */
public class Circle {
    Point center;

    public Point getCenter() {
        return center;
    }

    @Autowired
    public void setCenter(Point center) {
        this.center = center;
    }
    
    public void draw(){
        System.out.println("Circel drawn :"+center);
    }
}
