package com.sumanthbayya.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value="/test")
public class MasterAPIController {
	private static final Logger LOG = LoggerFactory.getLogger(MasterAPIController.class);
	
	@RequestMapping("/sample")
	 public String printNew(){
		LOG.warn("sending hello world response...");
		System.out.println("its came");
	    return "Produces attribute";
	  }

}
