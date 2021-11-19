package br.com.igor.p2.controller;

import br.com.igor.p2.model.entity.Product;
import br.com.igor.p2.model.repository.Product.ProductRepository;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/product")
public class ProductController {

    private ProductRepository productRepository;

    public ProductController(JdbcTemplate jdbcTemplate) {
        productRepository = new ProductRepository(jdbcTemplate);
    }

    @CrossOrigin("*")
    @ResponseStatus(HttpStatus.OK)
    @GetMapping
    public ArrayList<Product> searchProduct() throws Exception {
        return productRepository.search();
    }

}

