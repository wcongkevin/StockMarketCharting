package com.fsd.dataserver.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fsd.dataserver.entity.Company;
import com.fsd.dataserver.service.CompanyService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("api")
@Api(value = "FSD Company APIs")
public class CompanyController {
	@Autowired
	private CompanyService companyService;

	@ApiOperation(value = "Get a list of Companies.")
	@GetMapping("/getAllCompanies")
	public List<Company> getAllCompanies() {
		return companyService.getAllCompanies();
	}

	@ApiOperation(value = "create a new Company.")
	@PostMapping("/crateCompany")
	public Company crateCompany(@RequestBody Company entity) {
		return companyService.createCompany(entity);
	}

	@ApiOperation(value = "Update a Company.")
	@PutMapping("/updateCompany")
	public Company updateCompany(@RequestBody Company company) {
		return companyService.updateCompany(company);
	}

	@ApiOperation(value = "Delete a company by sequence id.")
	@DeleteMapping("/deleteCompany/{id}")
	public ResponseEntity<?> deleteCompany(@PathVariable(value = "id") Integer id) {
		companyService.deleteCompany(id.longValue());
		return ResponseEntity.ok().build();
	}

	@ApiOperation(value = "Get a list of Companies.")
	@GetMapping("/getCompanyById")
	public Company getCompanyById(@RequestParam long id) {
		return companyService.getCompanyById(id);
	}
}
