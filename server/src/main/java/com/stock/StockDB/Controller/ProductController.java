package com.stock.StockDB.Controller;

import com.stock.StockDB.Entity.Product;
import com.stock.StockDB.Repository.ProductRepository;

import java.util.Collection;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController{
    private ProductRepository repo;

    public ProductController(ProductRepository repo){
        this.repo = repo;
    }

    @GetMapping("/Product")
    public Collection<Product> product(){
        return repo.findAll();
    }
}