package com.product.service.dto;

import com.product.service.entity.ProductEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {
    private String code;
    private String name;
    private Short unit;
    private String by;

    public ProductDto(ProductEntity entity){
        this.code = entity.getCode();
        this.name = entity.getName();
        this.unit = entity.getUnit();
        this.by = entity.getCreateBy();
    }
}
