package main;


import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.ProductServices;

public class Main {

    public static int cnt = 0;
    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext context =
                    new AnnotationConfigApplicationContext(ProjectConfig.class))
        {
            ProductServices productServices = context.getBean(ProductServices.class);
            productServices.showIt();

        }
    }
}
