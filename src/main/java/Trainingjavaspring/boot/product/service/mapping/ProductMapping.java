package Trainingjavaspring.boot.product.service.mapping;



import Trainingjavaspring.boot.product.dto.response.ProductResponse;
import Trainingjavaspring.boot.product.entity.ProductEntity;

public class ProductMapping {
    public static ProductResponse convertEntityToProductResponse(ProductEntity entity){
        ProductResponse dto = new ProductResponse();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setPrice(entity.getPrice());
        return dto;
    }
}
