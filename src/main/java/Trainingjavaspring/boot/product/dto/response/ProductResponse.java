package Trainingjavaspring.boot.product.dto.response;

import Trainingjavaspring.boot.product.dto.request.ProductRequest;

public class ProductResponse extends ProductRequest {
    private String id;

    public ProductResponse() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ProductResponse{" +
                "id='" + id + '\'' +
                ", name='" + getName() + '\'' +
                ", price=" + getPrice() +
                '}';
    }
}
