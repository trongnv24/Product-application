package Trainingjavaspring.boot.product.service.impl;

import Trainingjavaspring.boot.product.dto.response.ProductResponse;
import Trainingjavaspring.boot.product.entity.ProductEntity;
import Trainingjavaspring.boot.product.repository.ProductRepository;
import Trainingjavaspring.boot.product.service.ProductService;
import Trainingjavaspring.boot.product.service.mapping.ProductMapping;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static Trainingjavaspring.boot.product.service.mapping.ProductMapping.convertEntityToProductResponse;

@Service
@Slf4j
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }



    @Override
    public List<ProductResponse> getAllProducts() {
        log.info(" === Start api getAllProducts product === ");

        List<ProductEntity> productEntityList = productRepository.findAll();
        List<ProductResponse> responseList = new ArrayList<>();
        for (ProductEntity entity : productEntityList) {
            ProductResponse response = convertEntityToProductResponse(entity);
            responseList.add(response);
        }
        log.info(" === Finish api getAllProducts product === ");
        return responseList;
    }
}
