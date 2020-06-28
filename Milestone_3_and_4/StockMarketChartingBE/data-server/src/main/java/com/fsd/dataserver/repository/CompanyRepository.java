package com.fsd.dataserver.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fsd.dataserver.entity.Company;

public interface CompanyRepository extends JpaRepository<Company, Long> {
	public List<Company> findAll();
}
