package com.cheetah.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cheetah.model.Recipient;
import com.cheetah.service.CheetahService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

@RestController
public class CheetahController {
	
	@Autowired
	private CheetahService cheetahService;
		
	@RequestMapping(method=RequestMethod.POST, value="/recipientlist")
	public String process2(@RequestBody Map<String,Recipient[]>  json) throws JsonMappingException, JsonProcessingException {
				
		return cheetahService.processRecipientList(json.get("recipients"));
	}
}
