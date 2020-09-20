package com.product.service.repository;

import com.product.service.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {

    List<ProductEntity> findAllByCategoryId(Integer categoryId);
    ProductEntity findByCode(String code);
}
