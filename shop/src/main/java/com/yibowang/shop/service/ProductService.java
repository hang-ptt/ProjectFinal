package com.yibowang.shop.service;

import com.yibowang.shop.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface ProductService {
    Optional<Product> findById(Long id);

    Page<Product> findAllProductsPageable(Pageable pageable);
}
