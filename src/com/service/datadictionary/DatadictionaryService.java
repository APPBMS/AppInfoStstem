package com.service.datadictionary;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.entity.DataDictionary;

public interface DatadictionaryService {
	public List<DataDictionary> getDataDictionaryList(@Param("typeCode")String typeCode);
}
