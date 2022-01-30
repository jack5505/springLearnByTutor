package learn4;

import learn4.config.ProjectConfig;
import learn4.services.HelloService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class)){
            HelloService helloService = context.getBean(HelloService.class);
            String res = helloService.hello("jack");
            System.out.println("Result is " + res);
        }
    }
}
