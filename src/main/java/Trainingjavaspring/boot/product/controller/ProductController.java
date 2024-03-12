package Trainingjavaspring.boot.product.controller;

import Trainingjavaspring.boot.product.dto.response.ProductResponse;
import Trainingjavaspring.boot.product.entity.ProductEntity;
import Trainingjavaspring.boot.product.service.ProductService;
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
    public final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping
    public List<ProductResponse> getAllProduct() {
        log.info(" === Start api getAllProduct product ===");
        List<ProductResponse> responses = service.getAllProducts();
        log.info(" === Finish api getAllProduct product === ");
        return responses;
    }

}
