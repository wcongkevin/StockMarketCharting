package com.fsd.dataserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fsd.dataserver.entity.Company;



public interface SectorRepository extends JpaRepository<Company, Long> {

}


