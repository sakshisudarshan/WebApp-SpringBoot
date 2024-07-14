package com.sakshisudarshan.SimpleWebApp.service;

import com.sakshisudarshan.SimpleWebApp.model.Product;
import com.sakshisudarshan.SimpleWebApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

//    List <Product> products= new ArrayList<>(Arrays.asList(new Product(101,"Iphone",50000),
//            new Product(102,"Samsung",25000),
//            new Product(103,"LG",10000) ));
    public List<Product> getProducts(){
        return repo.findAll();
    }

    public Product getProductById(int prodId) {
        return repo.findById(prodId).orElse(new Product());

    }

    public void addProduct(Product prod){
       repo.save(prod);
    }

        public void updateProduct(Product prod){
            repo.save(prod);
    }

    public void deleteProduct(int prodId) {
        repo.deleteById(prodId);
    }
}
