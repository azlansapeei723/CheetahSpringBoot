package com.cheetah.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cheetah.model.Recipient;

@Service
public class CheetahService {
	
	public String processRecipientList(Recipient[] receipientList) {
		Arrays.sort(receipientList);
		String result = "";
		
		for(Recipient i: receipientList) {
			for(Recipient j:receipientList) {
				if(i.getId() < j.getId()) {
					List<String> comparedList = new ArrayList<String>();
					
					comparedList = matchTags(i,j);
					
					if(comparedList.size()>1) {
						System.out.print(i.getName() + ", " + j.getName() + " - ");					
						System.out.print(matchTags(i,j)+"|");
						
						result = result + i.getName() + ", " + j.getName() + " - " + matchTags(i,j)+"|"; 
					}
				}
				
			}
		}
		return result;
	}
	
	public List<String> matchTags(Recipient rec1, Recipient rec2) {
		
		List<String> arrList = Arrays.asList(rec2.getTags());
		List<String> comparedList = new ArrayList<String>();
		
		for(String tag:rec1.getTags()) {
			if(arrList.contains(tag)) {
				comparedList.add(tag);
			}
		}
		return comparedList;
	}

}
