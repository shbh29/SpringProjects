/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springautowire;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 */
@Component
public class Circle {
    Point center;

    public Point getCenter() {
        return center;
    }

//    @Autowired
    @Qualifier("acenter")
    @Resource
    public void setCenter(Point center) {
        this.center = center;
    }
    
    public void draw(){
        System.out.println("Circel drawn :"+center);
    }
    
    @PostConstruct
    void init() {
        System.out.println("After Initializing Bean");
    }
    
    @PreDestroy
    void destroy() {
        System.out.println("Before Destroying Bean");
    }
}
