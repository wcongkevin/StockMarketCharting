package com.fsd.dataserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fsd.dataserver.entity.Company;



public interface StockRepository extends JpaRepository<Company, Long> {

}


