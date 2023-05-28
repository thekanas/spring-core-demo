package by.stolybko;

import by.stolybko.entity.Archer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

        Archer archer = context.getBean(Archer.class);
        System.out.println(archer);
    }
}
