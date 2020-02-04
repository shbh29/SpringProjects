/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springautowire;

import java.util.Locale;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author krawler
 */
public class SpringAutoWire {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AbstractApplicationContext ap = new ClassPathXmlApplicationContext("spring.xml");
        ap.registerShutdownHook();
        Circle c = (Circle) ap.getBean("circle");
        c.draw();
//        System.out.println(ap.getMessage("point.tostring", new Object[]{"Point:Center", 0, 0}, "default Message", null));
        System.out.println(ap.getMessage("welcome", null, "default Message", null));
    }
    
}
