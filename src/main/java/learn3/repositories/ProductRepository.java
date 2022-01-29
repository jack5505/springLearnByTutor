package learn3.repositories;

import learn3.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void addProduct(Product product){
        String sql = "INSERT INTO demo values (?,?,?)";
        jdbcTemplate.update(sql,product.getId(),product.getNames(),product.getPrice());

    }

}
