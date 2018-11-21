package com.dao.devuser;

import org.apache.ibatis.annotations.Param;

import com.entity.DevUser;

public interface DevUserMapper {
	/**
	 * 通过userCode获取User
	 * @param userCode
	 * @return
	 * @throws Exception
	 */
	public DevUser getLoginUser(@Param("devCode")String devCode,@Param("devPassword")String devPassword);
}
