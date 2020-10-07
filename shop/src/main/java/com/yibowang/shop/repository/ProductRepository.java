package com.yibowang.shop.repository;

import com.yibowang.shop.model.Product;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
    Optional<Product> findById (Long id);
    //Product findOne(Long id);
    Product getOne(Long id);
    Product save(Product product);
}
