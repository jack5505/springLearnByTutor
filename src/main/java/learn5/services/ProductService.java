package learn5.services;

import learn5.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;


    public void addOneProduct(){
        productRepository.addProduct("Beer");
        throw new RuntimeException(":(");
    }
}
