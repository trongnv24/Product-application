package Trainingjavaspring.boot.product.service;

import Trainingjavaspring.boot.product.dto.response.ProductResponse;
import Trainingjavaspring.boot.product.entity.ProductEntity;

import java.util.List;

public interface ProductService {
    List<ProductResponse> getAllProducts();
}

