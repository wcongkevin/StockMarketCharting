package com.fsd.dataserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fsd.dataserver.entity.Company;



public interface StockExchangeRepository extends JpaRepository<Company, Long> {

}


