package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ProductRepository;

@Service
public class ProductServices {

    @Autowired
    private ProductRepository productRepository;

    public void showIt(){
        productRepository.add();
        productRepository.add();
        productRepository.add();
    }
}
