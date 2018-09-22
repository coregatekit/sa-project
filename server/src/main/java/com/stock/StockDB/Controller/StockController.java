package com.stock.StockDB.Controller;

import com.stock.StockDB.Entity.Stock;
import com.stock.StockDB.Repository.StockRepository;

import java.util.Collection;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockController {
    private StockRepository repo;

    public StockController(StockRepository repo){
        this.repo = repo;
    }

    @GetMapping("/Stock")
    public Collection<Stock> stock(){
        return repo.findAll();
    }
}