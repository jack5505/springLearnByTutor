package learn3.repositories;

import learn3.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class ProductRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void addProduct(Product product){
        String sql = "INSERT INTO demo values (?,?,?)";
        jdbcTemplate.update(sql,product.getId(),product.getNames(),product.getPrice());
    }

    public List<Product> getAll(){
        String sql = "select * from demo";
        return jdbcTemplate.query(sql,(resultset,i)->{
        return new Product(resultset.getLong(1),resultset.getString(2),resultset.getLong(3));
        });
        /*return jdbcTemplate.query(sql, new RowMapper<Product>() {
            @Override
            public Product mapRow(ResultSet resultSet, int i) throws SQLException {
                Product product = new Product(
                        resultSet.getLong(1),
                        resultSet.getString(2),
                        resultSet.getLong(3)
                        );
                return product;
            }
        });*/


    }

}
