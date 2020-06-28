package com.fsd.dataserver.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.fsd.dataserver.entity.IPO;
import com.fsd.dataserver.repository.IPORepository;

import io.swagger.annotations.ApiOperation;

@Service
public class IPOController {
//	@Autowired
//	private IPORepository ipoRepository;
//
//	@ApiOperation(value = "create a new IPO.")
//	@PostMapping("/createIPO")
//	public IPO createIPO(@RequestBody IPO entity) {
//		return ipoRepository.createIPO(entity);
//	}
//
//	@ApiOperation(value = "Get a list of IPOs.")
//	@GetMapping("/getAllIPOs")
//	public List<IPO> getAllIPOs() {
//		return ipoRepository.findAllIPOs();
//	}
//
//	@ApiOperation(value = "Update IPO.")
//	@GetMapping("/updateIPO")
//	public IPO updateIPO(IPO entity) {
//		return ipoRepository.save(entity);
//	}
//	
//	@ApiOperation(value = "delete IPO.")
//	@GetMapping("/deleteIPO")
//	public IPO deleteIPO(long id) {
//		ipoRepository.deleteByid(id);
//		return null;
//	}

}