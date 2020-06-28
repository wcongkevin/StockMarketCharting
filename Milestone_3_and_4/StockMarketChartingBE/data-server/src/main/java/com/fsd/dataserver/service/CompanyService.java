package com.fsd.dataserver.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fsd.dataserver.entity.Company;
import com.fsd.dataserver.repository.CompanyRepository;

@Service
public class CompanyService {
	@Autowired
	private CompanyRepository companyRepository;

	public Company createCompany(Company entity) {
		return companyRepository.save(entity);
	}

	public Company updateCompany(Company entity) {
		return companyRepository.save(entity);
	}

	public List<Company> getAllCompanies() {
		return companyRepository.findAll();
	}

	public void deleteCompany(long id) {
		companyRepository.deleteById(id);
	}

	public Company getCompanyById(long id) {
		return companyRepository.findById(id).orElseGet(null);
	}
}
