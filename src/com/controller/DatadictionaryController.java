package com.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entity.DataDictionary;
import com.service.datadictionary.DatadictionaryService;

@Controller
@RequestMapping(value="/dev/flatform/app")
public class DatadictionaryController {
	@Resource 
	private DatadictionaryService dataDictionaryService;
	
	public List<DataDictionary> getDataDictionaryList(String typeCode){
		List<DataDictionary> dataDictionaryList = null;
		try {
			dataDictionaryList = dataDictionaryService.getDataDictionaryList(typeCode);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dataDictionaryList;
	}
}
