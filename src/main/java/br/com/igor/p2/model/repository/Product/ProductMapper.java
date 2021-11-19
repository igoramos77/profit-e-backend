package br.com.igor.p2.model.repository.Product;

import br.com.igor.p2.model.entity.Instalments;
import br.com.igor.p2.model.entity.Product;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductMapper implements RowMapper<Product> {

    @Override
    public Product mapRow(ResultSet resultSet, int i) throws SQLException {
        Product product = new Product();
        product.setId(resultSet.getInt("id"));
        product.setName(resultSet.getString("name"));
        product.setImage(resultSet.getString("image"));
        product.setOldPrice(resultSet.getFloat("old_price"));
        product.setPrice(resultSet.getFloat("price"));
        product.setDescription(resultSet.getString("description"));
        product.setInstalments(new Instalments(resultSet.getInt("instalments"), product.getPrice()));

        return product;
    }
}
