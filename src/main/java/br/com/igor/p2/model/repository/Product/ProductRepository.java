package br.com.igor.p2.model.repository.Product;

import br.com.igor.p2.model.entity.Product;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;

public class ProductRepository {

    private JdbcTemplate jdbcTemplate;

    public ProductRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public ArrayList<Product> search() throws Exception {
        String sql = "SELECT * FROM product";
        ArrayList<Product> search = (ArrayList<Product>) jdbcTemplate.query(sql, new ProductMapper());

        if (search.size() > 0) {
            return (ArrayList<Product>) jdbcTemplate.query(sql, new Object[]{}, new ProductMapper());
        }
        throw new Exception("Products not found.");
    }

}

