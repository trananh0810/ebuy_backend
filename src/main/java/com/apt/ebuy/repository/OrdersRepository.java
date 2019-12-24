package com.apt.ebuy.repository;

import com.apt.ebuy.entity.AccountEntity;
import com.apt.ebuy.entity.OrdersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdersRepository extends JpaRepository<OrdersEntity, Integer> {
}
