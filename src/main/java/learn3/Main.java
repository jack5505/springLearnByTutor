package learn3;

import learn3.config.ProjectConfig;
import learn3.model.Product;
import learn3.repositories.ProductRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class)){

            ProductRepository repository = context.getBean(ProductRepository.class);

            repository.addProduct(new Product(2L,"jack",15L));

        }
    }
}
