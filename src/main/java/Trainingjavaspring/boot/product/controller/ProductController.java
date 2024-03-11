package Trainingjavaspring.boot.product.controller;

import Trainingjavaspring.boot.product.entity.ProductEntity;
import Trainingjavaspring.boot.product.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/product")
@Slf4j
public class ProductController {
    @Autowired
    private ProductRepository productRepository;
    @GetMapping
    public List<ProductEntity> getAllProduct(){
        log.info(" === Start api getAllProduct ===");
        return productRepository.findAll();
    }

}
