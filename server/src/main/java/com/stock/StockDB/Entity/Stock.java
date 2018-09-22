package com.stock.StockDB.Entity;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.*;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Getter @Setter
@Table(name="Stock")
public class Stock{

    @Id
    @GeneratedValue
    private @NonNull long S_Id;
    @Column(length = 100)
    private int P_Amount;

    // Stock --> Product
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name= "P_Id")
    @JsonBackReference
    private Product product;
    
    // Stock --> Warehouse
    @ManyToOne(fetch = FetchType.LAZY)   
    @JoinColumn(name= "WH_Id")     
    @JsonBackReference 
    private Warehouse warehouse;    

    protected Stock(){}
    public Stock(int P_Amount){
        this.P_Amount = P_Amount;
    }

}