package com.service.datadictionary;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.datadictionary.DatadictionaryMapper;
import com.entity.DataDictionary;
@Service
public class DatadictionaryServiceImpl implements DatadictionaryService {
	@Resource
	private DatadictionaryMapper datadictionaryMapper;
	@Override
	public List<DataDictionary> getDataDictionaryList(String typeCode) {
		List<DataDictionary> list = datadictionaryMapper.getDataDictionaryList(typeCode);
		return list;
	}

}
