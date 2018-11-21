package com.dao.backenduser;
import org.apache.ibatis.annotations.Param;

import com.entity.BackendUser;

public interface BackendUserMapper {

	/**
	 * 通过userCode获取User
	 * @param userCode
	 * @return
	 * @throws Exception
	 */
	public BackendUser getLoginUser(@Param("userCode")String userCode,@Param("userPassword")String userPassword);

}
