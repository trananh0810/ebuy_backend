package com.apt.ebuy.repository;

import com.apt.ebuy.entity.AccountEntity;
import com.apt.ebuy.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {
}
