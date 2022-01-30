package learn5.services;

import learn5.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public void addOneProduct(){
        productRepository.addProduct("Beer");
    }
}
