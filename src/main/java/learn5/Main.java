package learn5;

import learn5.config.ProjectConfig;
import learn5.repository.ProductRepository;
import learn5.services.ProductService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class)){

            ProductService productService = context.getBean(ProductService.class);
            productService.addOneProduct();


        }
    }
}
