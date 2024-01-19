package com.example.crudOperation.service;

import com.example.crudOperation.entity.Product;
import com.example.crudOperation.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//Service to communicate to the repository, you have to inject a product repository
@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;
    //HTTP METHODS

    //POST METHOD
    public Product saveProduct(Product product){
        //PRODUCT OBJECT AS AN ARGUEMENT
        //Inbuilt JPA method to save
        return repository.save(product);
    }
    public List<Product> saveProducts(List<Product> products){
        //List of products being saved at the same time
        return repository.saveAll(products);
    }

    //Get method

    //get all products
    public List<Product> getProducts(){
        return repository.findAll();
    }

    //get by id

    public Product getProductById(int id) {
        return repository.findById(id).orElse(null);
    }

    //get product by name

    public Product getProductByName(String name) {
        //define the findByName method on the product repository interface
        return repository.findByName(name);
    }

    //delete product

    public String deleteProduct(int id){
        repository.deleteById(id);
        return "product removed of id number" + id;
    }

    //update product

    public Product updateProduct(Product product){
        Product existingProduct=repository.findById(product.getId()).orElse(null);
        existingProduct.setName(product.getName());
        existingProduct.setQuantity(product.getQuantity());
        existingProduct.setPrice(product.getPrice());
        return repository.save(existingProduct);
    }
}
