package com.apt.ebuy.repository;

import com.apt.ebuy.entity.AccountEntity;
import com.apt.ebuy.entity.AddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<AddressEntity, Integer> {
}
