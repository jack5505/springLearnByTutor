package learn7.services;

import learn7.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductServices {

    @Autowired
    private ProductRepository productRepository;


    @Transactional
    public void addTenProduct(){
        for(int i = 0 ; i < 10 ;i ++){
            productRepository.addProduct("Product " + i);
        }

    }
}
