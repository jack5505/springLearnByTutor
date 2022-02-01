package learn7.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;

@Repository
public class ProductRepository {

    @Autowired
    public JdbcTemplate jdbcTemplate;

    @PostConstruct
    public void init(){
        System.out.println("Initailized");
    }

    /**
     *  DEFAULT value for isolation  --> READ_COMMITED
     *
     *  READ_UNCOMMITTED
     *  READ_COMMITTED
     *  REPEATABLE_READ
     *  SERIALIZABLE
     *
     */
    @Transactional(isolation = Isolation.READ_COMMITTED)
    public void addProduct(String name){
        String sql = "INSERT INTO products values(NULL,?)";
        jdbcTemplate.update(sql,name);
    }
}
