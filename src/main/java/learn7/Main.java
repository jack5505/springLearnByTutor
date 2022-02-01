package learn7;

import learn7.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext contxt = new AnnotationConfigApplicationContext(ProjectConfig.class)){

        }
    }
}
