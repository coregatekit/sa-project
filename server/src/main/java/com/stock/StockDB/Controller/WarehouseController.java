package com.stock.StockDB.Controller;

import com.stock.StockDB.Entity.Warehouse;
import com.stock.StockDB.Repository.WarehouseRepository;

import java.util.Collection;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WarehouseController {
    private WarehouseRepository repo;

    public WarehouseController(WarehouseRepository repo){
        this.repo = repo;
    }

    @GetMapping("/Warehouse")
    public Collection<Warehouse> warehouse(){
        return repo.findAll();
    }
}