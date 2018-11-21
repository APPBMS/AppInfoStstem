package com.dao.datadictionary;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.entity.DataDictionary;

public interface DatadictionaryMapper {
	public List<DataDictionary> getDataDictionaryList(@Param("typeCode")String typeCode);
}
