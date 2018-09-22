package com.stock.StockDB.Controller;

import com.stock.StockDB.Entity.OrderProduct;
import com.stock.StockDB.Repository.OrderProductRepository;

import java.util.Collection;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderProductController {
    private OrderProductRepository repo;

    public OrderProductController(OrderProductRepository repo){
        this.repo = repo;
    }

    @GetMapping("/OrderProduct")
    public Collection<OrderProduct> orderProduct(){
        return repo.findAll();
    }
}