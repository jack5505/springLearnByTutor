package learn1;


import learn1.config.ProjectConfig;
import learn1.services.ProductServices;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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
