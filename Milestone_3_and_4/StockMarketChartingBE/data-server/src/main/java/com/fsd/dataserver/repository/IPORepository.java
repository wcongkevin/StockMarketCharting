package com.fsd.dataserver.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fsd.dataserver.entity.Company;
import com.fsd.dataserver.entity.IPO;



public interface IPORepository extends JpaRepository<Company, Long> {
//	public List<IPO> findAllIPOs();
//
//	public IPO createIPO(IPO entity);
//	
//	public IPO save(IPO entity);
//	
//	public IPO findIPObyid(long id);
//	
//	public void deleteByid(long id);
}


