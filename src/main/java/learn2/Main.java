package learn2;

import learn2.beans.Cat;
import learn2.beans.Owner;
import learn2.config.ProjectConfiglearn2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static int cnt = 0;
    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfiglearn2.class)){
            Cat x = context.getBean(Cat.class);
            Owner owner = context.getBean(Owner.class);

            System.out.println(x);
            System.out.println(owner);
            
        }

    }
}
